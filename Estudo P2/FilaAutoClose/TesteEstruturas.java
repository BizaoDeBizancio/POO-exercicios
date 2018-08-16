import estrutura.*;
import exceptions.*;

public class TesteEstruturas {

    public static void main(String[] args) {
    
        System.out.println("--- Teste 1 ---");
        try {
            FilaSimples Fila = new FilaAprimorada(3);
            Fila.enfileira("10");
            Fila.enfileira("20");
            Fila.enfileira("30");
            Fila.enfileira("40");
            System.out.println(Fila.desenfileira());
            System.out.println(Fila.desenfileira());
            System.out.println(Fila.desenfileira());
            System.out.println(Fila.desenfileira());
            
            System.out.println();
        } catch (FilaVaziaException e) {
            System.out.println(e);
        } catch (FilaCheiaException e) {
            System.out.println(e);
            System.out.println("Limite eh " + e.getLimite());
            System.out.println("Item eh " + e.getItem());
        }
        
        System.out.println();
        System.out.println("--- Teste 2 ---");
        
        try {
            FilaSimples Fila = new FilaAprimorada(3);
            Fila.enfileira("10");
            Fila.enfileira("20");
            Fila.enfileira("30");
            System.out.println(Fila.desenfileira());
            System.out.println(Fila.desenfileira());
            System.out.println(Fila.desenfileira());
            System.out.println(Fila.desenfileira());
            
            System.out.println();
        } catch (FilaVaziaException e) {
            System.out.println(e);
        } catch (FilaCheiaException e) {
            System.out.println(e);
            System.out.println("Limite eh " + e.getLimite());
            System.out.println("Item eh " + e.getItem());
        }
        
        System.out.println();
    }

}