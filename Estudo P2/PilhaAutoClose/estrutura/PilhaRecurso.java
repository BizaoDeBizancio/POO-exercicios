package estrutura;

public class PilhaRecurso extends PilhaAprimorada implements AutoCloseable{
    
    public PilhaRecurso(int tamanhoMax) {
        super(tamanhoMax);
    }
    
    @Override
    public void close(){
        for(int i = 0 ; i < getTamanhoMax() ; i++) {
            itens[i] = null;
        }
    }
    
    
}