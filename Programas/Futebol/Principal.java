import copadomundo.*;

public class Principal {
    
    public static void verificaValidade(boolean validade) {
        if(validade) {
            System.out.println("Time valido");
        } else {
            System.out.println("Time invalido");
        }
    }
    
    public static void main(String[] args) {
        try{
            Time t1 = new Time("ABC");
            Time t2 = new Time("DEF");
            Jogador j1 = new Atacante("At1", 11);
            Jogador j2 = new Goleiro("G1", 1);
            Jogador j3 = new Lateral("L1", 6, "Direito");
            Jogador j4 = new Lateral("L2", 5, "Esquerdo");
            Jogador j5 = new Atacante("At2", 9);
            Jogador j6 = new Goleiro("G2", 12);
            t1.adicionarJogador(j1);
            t1.adicionarJogador(j2);
            t1.adicionarJogador(j3);
            
            t2.adicionarJogador(j4);
            t2.adicionarJogador(j5);
            t2.adicionarJogador(j6);
            
            System.out.print(t1.escalacao());
            verificaValidade(t1.verificaTime());
            System.out.println();
            
            System.out.print(t2.escalacao());
            verificaValidade(t2.verificaTime());
            System.out.println();
            
            Jogador j7 = new Lateral("L3", 4, "Esquerdo");
            t1.substituir(j7, 11);
            
            System.out.print(t1.escalacao());
            verificaValidade(t1.verificaTime());
            System.out.println();
            
            System.out.print(t2.escalacao());
            verificaValidade(t2.verificaTime());
            System.out.println();
            
            /* Exemplo de time valido
            Time t3 = new Time ("Valido");
            t3.adicionarJogador(new Goleiro("A", 1));
            t3.adicionarJogador(new Atacante("B", 2));
            t3.adicionarJogador(new Atacante("B", 3));
            t3.adicionarJogador(new Atacante("B", 4));
            t3.adicionarJogador(new Atacante("B", 5));
            t3.adicionarJogador(new Atacante("B", 6));
            t3.adicionarJogador(new Atacante("B", 7));
            t3.adicionarJogador(new Atacante("B", 8));
            t3.adicionarJogador(new Atacante("B", 9));
            t3.adicionarJogador(new Atacante("B", 10));
            t3.adicionarJogador(new Atacante("B", 11));
          
            System.out.print(t3.escalacao());
            verificaValidade(t3.verificaTime());
            System.out.println();
            */
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}