package navio;

import pilha.estrutura.*;
import viking.*;


public class Navio {

    private PilhaAprimorada navio;
    
    public Navio() {
        this.navio = new PilhaAprimorada(20);
    }
    
    public void embarcar(){
        Timoneiro timoneiro = new Timoneiro();
        navio.empilha(timoneiro);
        System.out.println(timoneiro.grita(navio.getTopo()+1));
        
        for(int i = 0 ; i < 18 ; i++) {
            Remador remador = new Remador();
            navio.empilha(remador);
            System.out.println(remador.grita(navio.getTopo()+1));
        }
        
        Lider lider = new Lider();
        navio.empilha(lider);
        System.out.println(lider.grita(navio.getTopo()+1));
        
    }
    
    public void desembarcar(){
        for(int i = 19 ; i >= 0 ; i--) {
            Viking desembarcando = navio.desempilha();
            System.out.println(desembarcando.grita(i+1));
        }
    }
}