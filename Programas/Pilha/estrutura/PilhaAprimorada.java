package estrutura;

import exceptions.*;

public class PilhaAprimorada extends PilhaSimples {

    private int topo;
    private Object[] itens;

    public PilhaAprimorada(int tamanhoMax) {
        super(tamanhoMax);
        this.itens = new Object[tamanhoMax];
        this.topo = -1;
    }
     
    @Override
    public void empilha(Object novoItem) {
        topo++;
        if(topo >= getTamanhoMax()) {
            throw new PilhaCheiaException(getTamanhoMax(), novoItem);
        } else {
            itens[topo] = novoItem;
        }
    }
    
    @Override
    public Object desempilha() {
        if(topo < 0) {
            throw new PilhaVaziaException();
        } else {
            Object item = itens[topo];
            itens[topo--] = null;
            return item;
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