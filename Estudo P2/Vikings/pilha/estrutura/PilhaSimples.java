package pilha.estrutura;

import viking.*;

public class PilhaSimples {

    protected int topo;
    protected Viking[] itens;
    
    public PilhaSimples(int tamanhoMax) {
        this.itens = new Viking[tamanhoMax];
        this.topo = -1;
    }
    
    public void empilha(Viking novoItem) {
        itens[++topo] = novoItem;
    }
    
    public Viking desempilha() {
        Viking item = itens[topo];
        itens[topo--] = null;
        return item;
    }
    
    public int getTopo() {
        return this.topo;
    }
    
    int getTamanhoMax() {
        if (itens != null)
            return this.itens.length;
        else
            return -1;
    }

}