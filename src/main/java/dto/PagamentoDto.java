package dto;

import java.math.BigDecimal;

public class PagamentoDto {

    private String codigoCobranca;
    private BigDecimal valorPago;
    private BigDecimal valorOriginal;

    public PagamentoDto() {
    }

    public PagamentoDto(String codigoCobranca, BigDecimal valorPago, BigDecimal valorOriginal) {
        this.codigoCobranca = codigoCobranca;
        this.valorPago = valorPago;
        this.valorOriginal = valorOriginal;
    }

    public String getCodigoCobranca() {
        return codigoCobranca;
    }

    public void setCodigoCobranca(String codigoCobranca) {
        this.codigoCobranca = codigoCobranca;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(BigDecimal valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    @Override
    public String toString() {
        return "PagamentoDto{" +
                "codigoCobranca='" + codigoCobranca + '\'' +
                ", valorPago=" + valorPago +
                ", valorOriginal=" + valorOriginal +
                '}';
    }
}
