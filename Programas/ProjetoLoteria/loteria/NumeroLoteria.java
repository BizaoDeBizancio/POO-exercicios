package loteria;

public class NumeroLoteria {
	private int[] numeros;

	public NumeroLoteria() {
		numeros = new int [3];
		for (int i = 0 ; i < 3 ; i++) {
			numeros[i] = NumeroAleatorio.getAleatorio();
		}
	}

	public NumeroLoteria(int[] numeros) throws Exception{
		if(numeros.length != 3) {
			throw new Exception ("São necessarios 3 numeros");
		} else {
			this.numeros = numeros.clone();
		}

	}

	public String getNumeros() {
		String numeros = "";
		for (int i = 0 ; i < 3 ; i++) {
			numeros += this.numeros[i]+" ";
		}
		return numeros;
	}

	public boolean ganhou(NumeroLoteria nLoteria) {
		for (int i = 0 ; i < 3 ; i++) {
			if(this.numeros[i] != nLoteria.numeros[i]) {
				return false;
			}
		}
		return true;
	}

}