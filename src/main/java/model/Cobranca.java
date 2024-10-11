package model;

public class Cobranca {

    private String codigo;
    private double valorPago;

    public Cobranca(String codigo, double valorPago) {
        this.codigo = codigo;
        this.valorPago = valorPago;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValorPago() {
        return valorPago;
    }
}
