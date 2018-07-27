public class MeuGuardaEncomenda implements GuardaEncomenda{
	private Encomenda encomendas[] = new Encomenda [1000];
	private int nEncomendas = 0;

	@Override
	public void adiciona(Encomenda e) {
		boolean igual = false;

		if(e == null){
			return;
		}

		if(nEncomendas == 0) {
			encomendas[0] = e;
			nEncomendas++;
			return;
		}

		for (int i = 0 ; i < nEncomendas && !igual; i++) {
			if(e.compareTo(encomendas[i]) == 0) {
				igual = true;
			}
		}
		if(!igual){
			encomendas[nEncomendas] = e;
			nEncomendas++;
		}
	}

	@Override
	public int getSize() {
		return nEncomendas;
	}

	@Override
	public void ordena(){
		int menor = 0;
		Encomenda aux;
		for (int j = 0 ; j < nEncomendas ; j++) {
			for (int i = j; i < nEncomendas ; i++ ) {
				if(encomendas[i].compareTo(encomendas[menor]) == -1){
					menor = i;
				}
			}
			aux = encomendas[j];
			encomendas[j] = encomendas[menor];
			encomendas[menor] = aux;
			menor = j+1;
		}
	}

	@Override
	public String toString(){
		String ret = "";
		for(int i = 0; i < nEncomendas; ++i){
			ret = ret + encomendas[i] + ", ";
		}
		return ret;
	}

}