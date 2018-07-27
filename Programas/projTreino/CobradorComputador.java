public class CobradorComputador extends Jogador implements ICobradorStrategy{
	public CobradorComputador() {
		super("Computador Cobrador");
	}

	public int chutar() {
        int lado = (int)(Math.random()*3+1);
		return lado;
	}		
}