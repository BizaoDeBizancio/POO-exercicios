package exceptions;

public class FilaException extends RuntimeException {
    private int limite;

    public FilaException(String erro) {
        super(erro);
        this.limite = limite;
    }
    
}