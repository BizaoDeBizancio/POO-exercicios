package estrutura;

public class FilaRecurso extends FilaAprimorada implements AutoCloseable {
    
    public FilaRecurso(int tamanhoMax) {
        super(tamanhoMax);
    }
    
    @Override
    public void close() {
        for(int i = 0 ; i < getTamanhoMax() ; i++) {
            itens[i] = null;
        }
    }
}