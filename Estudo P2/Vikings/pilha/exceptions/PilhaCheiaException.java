package pilha.exceptions;

public class PilhaCheiaException extends PilhaException {

    private int tamanho;
    private Object item;

    public PilhaCheiaException(int tamanho, Object item) {
        super("Pilha Cheia");
        this.tamanho = tamanho;
        this.item = item;
    }

    public int getLimite() {
        return this.tamanho;
    }

    public Object getItem() {
        return item;
    }
}