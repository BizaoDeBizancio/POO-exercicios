package estrutura;

import exceptions.*;

public class FilaAprimorada extends FilaSimples {
    
    private int itensNaFila;
    
    public FilaAprimorada(int tamanhoMax) {
        super(tamanhoMax);
        this.itens = new Object[tamanhoMax];
        this.itensNaFila = 0;
    }
    
    @Override
    public void enfileira(Object novoItem) {
        if(itensNaFila < getTamanhoMax()) {
            itens[fim] = novoItem;
            fim = (fim + 1) % getTamanhoMax();
            itensNaFila++;
        } else {
            throw new FilaCheiaException(getTamanhoMax(), novoItem);
        }
    }
    
    @Override
	public Object desenfileira() {
        if(itensNaFila > 0){
            Object item = itens[inicio];
            itens[inicio] = null;
            inicio = (inicio + 1) % getTamanhoMax();
            itensNaFila--;
            return item;
        } else {
            throw new FilaVaziaException();
        }
	}

}