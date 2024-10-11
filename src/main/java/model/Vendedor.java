package model;

public class Vendedor {

    private String codigo;
    private String nome;

    public Vendedor(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
