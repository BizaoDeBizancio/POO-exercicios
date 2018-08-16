package pilha.estrutura;

import pilha.exceptions.*;
import viking.*;

public class PilhaAprimorada extends PilhaSimples {

    public PilhaAprimorada(int tamanhoMax) {
        super(tamanhoMax);
    }
     
    @Override
    public void empilha(Viking novoItem) {
        topo++;
        if(topo >= getTamanhoMax()) {
            throw new PilhaCheiaException(getTamanhoMax(), novoItem);
        } else {
            itens[topo] = novoItem;
        }
    }
    
    @Override
    public Viking desempilha() {
        if(topo < 0) {
            throw new PilhaVaziaException();
        } else {
            Viking item = itens[topo];
            itens[topo--] = null;
            return item;
        }
    }

}