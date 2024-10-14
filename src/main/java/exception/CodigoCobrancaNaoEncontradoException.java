package exception;

public class CodigoCobrancaNaoEncontradoException extends RuntimeException {

    public CodigoCobrancaNaoEncontradoException(String codigo) {
        super("Cobrança com o código '" + codigo + "' não foi encontrada.");
    }

}