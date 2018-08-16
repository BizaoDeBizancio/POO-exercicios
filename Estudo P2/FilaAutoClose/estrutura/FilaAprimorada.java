package estrutura;

import exceptions.*;

public class FilaAprimorada extends FilaSimples {
	private int inicio, fim;
	private Object[] itens;
    private int itensNaFila;
    
    public FilaAprimorada(int tamanhoMax) {
        super(tamanhoMax);
        this.itens = new Object[tamanhoMax];
        this.inicio = 0;
        this.fim = 0;
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
    
    @Override
	int getTamanhoMax() {
		if (itens != null)
			return this.itens.length;
		else
			return -1;
	}

}