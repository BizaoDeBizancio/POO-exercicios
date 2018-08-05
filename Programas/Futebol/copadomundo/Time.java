package copadomundo;

public class Time {
    private String nome;
    private Jogador jogadores[] = new Jogador [11];
    private int nJogadores = 0;
    
    public Time(String nome) {
        this.nome = nome;
    }
    
    public void adicionarJogador(Jogador jogador) throws Exception {
        if(nJogadores == 11) {
            throw new Exception ("Excedeu o numero de jogadores");
        }
        
        boolean adicionou = false;
        
        for(int i = 0 ; i < this.jogadores.length && !adicionou; i++) {
            if(jogadores[i] == null || jogador.getCamisa() < jogadores[i].getCamisa()) {
                encaixa(jogador, i);
                adicionou = true;
            }
        }
        
        nJogadores++;
    }
    
    private void encaixa(Jogador jogador, int pos) {
        for(int i = this.jogadores.length - 1 ; i >= pos ; i--){
            if(this.jogadores[i] != null) {
                this.jogadores[i+1] = jogadores[i];
            }
        }
        
        this.jogadores[pos] = jogador;
        
    }
    
    private void arrumaBuraco(int pos) {
        int i = pos + 1;
        for( ; i < this.jogadores.length && jogadores[i] != null ; i++) {
            this.jogadores[i-1] = this.jogadores[i];
        }
        this.jogadores[i-1] = null;
    }
    
    public void substituir(Jogador entra, int camisaSai) throws Exception{
        for(int i = 0 ; i < this.jogadores.length && this.jogadores[i] != null ; i++) {
            if(this.jogadores[i].getCamisa() == camisaSai) {
                this.jogadores[i] = null;
                arrumaBuraco(i);
                adicionarJogador(entra);
            }
        }
    }
    
    public String escalacao(){
        String textEscalacao = "";
        for(int i = 0 ; i < this.jogadores.length && this.jogadores[i] != null ; i++) {
            textEscalacao += this.jogadores[i].getNome() + " (" + this.jogadores[i].getCamisa() + ") - " + this.jogadores[i].getPosicao()+'\n';
        }
        return textEscalacao;
    }
    
    public boolean verificaTime() {
        int nGoleiros = 0;
        int nLinha    = 0;
        
        for(int i = 0 ; i < jogadores.length ; i++) {
            if(jogadores[i] instanceof Goleiro) {
                nGoleiros++;
            } else if (jogadores[i] instanceof Atacante || jogadores[i] instanceof Lateral) {
                nLinha++;
            }
        }
        
        return nGoleiros == 1 && nLinha == 10;
    }

}