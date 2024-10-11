package dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import java.util.List;

@Schema(description = "Requisição de pagamento contendo o código do vendedor e lista de pagamentos.")
public class PagamentoRequest {

    @Schema(description = "Código do vendedor", example = "12345", required = true)
    @NotNull
    private String codigoVendedor;

    @Schema(description = "Lista de pagamentos", required = true)
    @NotNull
    private List<PagamentoDto> pagamentos;

    // Getters e setters


    public PagamentoRequest(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public PagamentoRequest(String codigoVendedor, List<PagamentoDto> pagamentos) {
        this.codigoVendedor = codigoVendedor;
        this.pagamentos = pagamentos;
    }

    public @NotNull String getCodigoVendedor() {
        return codigoVendedor;
    }

    public @NotNull List<PagamentoDto> getPagamentos() {
        return pagamentos;
    }
}