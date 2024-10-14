package com.san_giorno.service;

import dto.PagamentoDto;
import dto.PagamentoRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.amqp.core.AmqpTemplate;
import service.PagamentoService;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class PagamentoServiceTest {

    @Mock
    private AmqpTemplate amqpTemplate;

    @InjectMocks
    private PagamentoService pagamentoService;

//    @Test
//    public void deveEnviarParaFilaParcial() {
//        String codigoCobranca = "12345";
//        List<PagamentoDto> pagamentoDtos = List.of(new PagamentoDto("98765", 50.0));
//        PagamentoRequest request = new PagamentoRequest(codigoCobranca, pagamentoDtos);
//
//        pagamentoService.processarPagamento(request);
//
//        verify(amqpTemplate, times(1)).convertAndSend("pagamento_parcial", request.getPagamentos().get(0));
//    }

//    @Test
//    public void deveEnviarParaFilaTotal() {
//        String codigoCobranca = "12345";
//        List<PagamentoDto> pagamentoDtos = List.of(new PagamentoDto("98765", 100.0));
//        PagamentoRequest request = new PagamentoRequest(codigoCobranca, pagamentoDtos);
//
//        pagamentoService.processarPagamento(request);
//
//        verify(amqpTemplate, times(1)).convertAndSend("pagamento_total", request.getPagamentos().get(0));
//    }

//    @Test
//    public void deveEnviarParaFilaExcedente() {
//        String codigoCobranca = "12345";
//        List<PagamentoDto> pagamentoDtos = List.of(new PagamentoDto("98765", 150.0));
//        PagamentoRequest request = new PagamentoRequest(codigoCobranca, pagamentoDtos);
//
//        pagamentoService.processarPagamento(request);
//
//        verify(amqpTemplate, times(1)).convertAndSend("pagamento_excedente", request.getPagamentos().get(0));
//    }
}
