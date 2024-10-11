package dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;

@Schema(description = "Informações de cada pagamento")
public class PagamentoDto {

    @Schema(description = "Código da cobrança", example = "98765", required = true)
    @NotNull
    private String codigoCobranca;

    @Schema(description = "Valor do pagamento", example = "150.00", required = true)
    @NotNull
    private Double valor;

    public PagamentoDto(String codigoCobranca, Double valor) {
        this.codigoCobranca = codigoCobranca;
        this.valor = valor;
    }

    public @NotNull String getCodigoCobranca() {
        return codigoCobranca;
    }

    public @NotNull Double getValor() {
        return valor;
    }

    // Getters e setters
}