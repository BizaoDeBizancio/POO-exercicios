package copadomundo;

public abstract class Jogador {
    private String nome;
    private int camisa;
    private String posicao;
    
    public Jogador(String nome, int camisa, String posicao){
        this.nome    = nome;
        this.camisa  = camisa;
        this.posicao = posicao;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    public String getPosicao(){
        return this.posicao;
    }

    public int getCamisa(){
        return this.camisa;
    }
}