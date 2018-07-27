import copadomundo.*;

public class Principal {
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
            
            System.out.println(t1.escalacao());
            System.out.println(t2.escalacao());
            
            Jogador j7 = new Lateral("L3", 4, "Esquerdo");
            t1.substituir(j7, 11);
            
            System.out.println(t1.escalacao());
            System.out.println(t2.escalacao());
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}