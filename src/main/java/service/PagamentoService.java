package service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.CobrancaRepository;
import repository.VendedorRepository;


@Service
public class PagamentoService {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private CobrancaRepository cobrancaRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

}
