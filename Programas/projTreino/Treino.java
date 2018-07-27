public class Treino {

    public static ICobradorStrategy instanciaCobrador(String[] args) {
        if(args[0].equals("P")) {
            return new CobradorPessoa("Saul");
        } else {
            return new CobradorComputador();
        }
    }
    
    public static IDefendeStrategy instanciaGoleiro(String[] args) {
        if(args[1].equals("P")) {
            return new GoleiroPessoa("Paulo");
        } else {
            return new GoleiroComputador();
        }
    }

	public static void main(String[] args) {
		
		ICobradorStrategy cobrador = instanciaCobrador(args);
		IDefendeStrategy goleiro = instanciaGoleiro(args);
		
		Penalty p = new Penalty(goleiro, cobrador);
		
		int acertosCobrador = 0;
		int defesas = 0;
		
		for (int i = 0; i < 3; i++)
			if (p.cobrar())
				acertosCobrador++;
			else
				defesas++;
			
		System.out.println("[" + ((Jogador) cobrador).getNome() + "] Gols = " + acertosCobrador 
						+ "  [" + ((Jogador) goleiro).getNome() + "] Defesas = " + defesas);
	}

}