package estrutura;

import exceptions.*;

public class PilhaAprimorada extends PilhaSimples {

    public PilhaAprimorada(int tamanhoMax) {
        super(tamanhoMax);
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

}