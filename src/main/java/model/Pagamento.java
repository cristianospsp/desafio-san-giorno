package model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Pagamento {

    private String codigoVendedor;
    private List<Cobranca> pagamentos;

    public Pagamento(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
        this.pagamentos = new ArrayList<>();
    }

    public void addPagamento(Cobranca cobranca) {
        this.pagamentos.add(cobranca);
    }

}
