package model;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {

    private String codigoVendedor;
    private List<Cobranca> pagamentos;

    public Pagamento(String codigoVendedor, List<Cobranca> pagamentos) {
        this.codigoVendedor = codigoVendedor;
        this.pagamentos = new ArrayList<>();
    }

    public void addPagamento(Cobranca cobranca) {
        this.pagamentos.add(cobranca);
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public List<Cobranca> getPagamentos() {
        return pagamentos;
    }
}
