package service;

import dto.PagamentoDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import repository.PagamentoRepository;

import java.math.BigDecimal;

@Service
public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;
    private final RabbitTemplate rabbitTemplate;

    public PagamentoService(PagamentoRepository pagamentoRepository, RabbitTemplate rabbitTemplate) {
        this.pagamentoRepository = pagamentoRepository;
        this.rabbitTemplate = rabbitTemplate;
    }

    public String processarPagamentos(Iterable<PagamentoDto> pagamentos) {
        pagamentos.forEach(this::processarPagamento);
        return "Pagamentos processados com sucesso";
    }

    private void processarPagamento(PagamentoDto pagamento) {
        if (!pagamentoRepository.existsByCodigoCobranca(pagamento.getCodigoCobranca())) {
            throw new IllegalArgumentException("Código de cobrança não encontrado: " + pagamento.getCodigoCobranca());
        }

        String status = validarPagamento(pagamento);
        enviarParaFila(status, pagamento);
    }

    private String validarPagamento(PagamentoDto pagamento) {
        BigDecimal valorPago = pagamento.getValorPago();
        BigDecimal valorOriginal = pagamento.getValorOriginal();

        if (valorPago.compareTo(valorOriginal) < 0) {
            return "PAGAMENTO_PARCIAL";
        } else if (valorPago == valorOriginal) {
            return "PAGAMENTO_TOTAL";
        } else {
            return "PAGAMENTO_EXCEDENTE";
        }
    }

    private void enviarParaFila(String status, PagamentoDto pagamento) {
        String fila;

        switch (status) {
            case "parcial":
                fila = RabbitMQConfig.FILA_PARCIAL;
                break;
            case "total":
                fila = RabbitMQConfig.FILA_TOTAL;
                break;
            case "excedente":
                fila = RabbitMQConfig.FILA_EXCEDENTE;
                break;
            default:
                throw new IllegalArgumentException("Status de pagamento inválido: " + status);
        }

        rabbitTemplate.convertAndSend(fila, pagamento);
        System.out.printf("Enviando pagamento %s para a fila %s com status: %s%n",
                pagamento.getCodigoCobranca(), fila, status);
    }
}
