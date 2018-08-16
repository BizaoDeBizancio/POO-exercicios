package pilha.exceptions;

public abstract class PilhaException extends RuntimeException {

    private int limite;

    public PilhaException(String erro) {
        super(erro);
        this.limite = limite;
    }


}