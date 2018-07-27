public class GoleiroComputador extends Jogador implements IDefendeStrategy{
    public GoleiroComputador() {
        super("Computador Goleiro");
    }
    
	public int defender() {
        int lado = (int)(Math.random()*3+1);
		return lado;		
	}
    
}