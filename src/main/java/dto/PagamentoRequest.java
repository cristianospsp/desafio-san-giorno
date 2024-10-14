package dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import java.util.List;

@Schema(description = "Requisição de pagamento contendo o código do vendedor e lista de pagamentos.")
public class PagamentoRequest {

//    @Schema(description = "Código do vendedor", example = "12345", required = true)
//    @NotNull
//    private String codigoVendedor;
//
//    @Schema(description = "Lista de pagamentos", required = true)
//    @NotNull
//    private List<PagamentoDto> pagamentos;

    private List<PagamentoItem> pagamentos;

    public List<PagamentoItem> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<PagamentoItem> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public static class PagamentoItem {
        private String codigoCobranca;
        private double valorPago;

        // Getters e Setters
        public String getCodigoCobranca() {
            return codigoCobranca;
        }

        public void setCodigoCobranca(String codigoCobranca) {
            this.codigoCobranca = codigoCobranca;
        }

        public double getValorPago() {
            return valorPago;
        }

        public void setValorPago(double valorPago) {
            this.valorPago = valorPago;
        }
    }
}