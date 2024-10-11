package service;

import dto.PagamentoDto;
import dto.PagamentoRequest;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class PagamentoService {

    private final Logger logger = LoggerFactory.getLogger(PagamentoService.class);

    private final AmqpTemplate amqpTemplate;

    public PagamentoService(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public String processarPagamento(PagamentoRequest request) {
        // Validações (omitidas para foco na parte do RabbitMQ)

        for (PagamentoDto pagamento : request.getPagamentos()) {
            String status = validarPagamento(pagamento);
            enviarParaFila(status, pagamento);
        }

        return "Pagamentos processados com sucesso";
    }

    private void enviarParaFila(String status, PagamentoDto pagamento) {
        String routingKey;
        switch (status) {
            case "parcial":
                routingKey = "pagamento_parcial";
                logger.info("Mensagem enviada para a fila: " + routingKey + " com status: " + status);
                break;
            case "total":
                routingKey = "pagamento_total";
                logger.info("Mensagem enviada para a fila: " + routingKey + " com status: " + status);
                break;
            case "excedente":
                routingKey = "pagamento_excedente";
                logger.info("Mensagem enviada para a fila: " + routingKey + " com status: " + status);
                break;
            default:
                throw new IllegalArgumentException("Status de pagamento inválido: " + status);
        }

        amqpTemplate.convertAndSend(routingKey, pagamento);
    }

    private String validarPagamento(PagamentoDto pagamento) {
        double valorOriginal = 100.00; // Mock de valor original

        if (pagamento.getValor() < valorOriginal) {
            return "parcial";
        } else if (pagamento.getValor().equals(valorOriginal)) {
            return "total";
        } else {
            return "excedente";
        }
    }
}
