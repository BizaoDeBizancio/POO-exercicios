package exceptions;

public class FilaCheiaException extends FilaException {
    
    private int tamanho;
    private Object item;
    
    public FilaCheiaException(int tamanho, Object item){
        super("FilaCheia");
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