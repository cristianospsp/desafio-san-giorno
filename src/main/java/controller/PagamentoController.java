package controller;

import dto.PagamentoDto;
import org.springframework.beans.factory.annotation.Autowired;
import service.PagamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    @Autowired
    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public String processarPagamentos(@RequestBody List<PagamentoDto> pagamentos) {
        return pagamentoService.processarPagamentos(pagamentos);
    }
}


