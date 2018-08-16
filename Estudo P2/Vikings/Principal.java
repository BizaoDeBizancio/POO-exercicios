import navio.*;
import viking.*;
import pilha.*;

public class Principal {
    public static void main(String[] args) {
        Navio navio = new Navio();
        navio.embarcar();
        
        System.out.println();
        System.out.println();
        
        navio.desembarcar();
    }
}