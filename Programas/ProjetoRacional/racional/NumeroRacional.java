/*package racional;

public class NumeroRacional {

	private numerador;
	private denominador;

	public NumeroRacional(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;

	}

	public NumeroRacional() {
		this.numerador = NumeroAleatorio.getAleatorio();
		this.denominador = NumeroAleatorio.getAleatorio();
	}

	private NumeroRacional simplificar() {
		int numerador = this.numerador;
		int denominador = this.denominador;



	}

	public NumeroRacional soma(NumeroRacional a) {
		int novoNumerador;
		int novoDenominador;

		novoDenominador = a.
	}

	public String getString(){
		return ""+numerador+"/"+denominador;
	}


}     MEU CODIGO*/

package racional;

public class NumeroRacional {
	private int numerador, denominador;

	public NumeroRacional() {
		this(NumeroAleatorio.getAleatorio(), NumeroAleatorio.getAleatorio());
	}

	public NumeroRacional(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
		simplificar();
	}

	private int getMDC() {
		int menor = this.numerador < this.denominador ?
		 this.numerador : this.denominador;

		 int mdc = 1;
		 for (int i = 0 ; i > 1 && mdc == 1 ; i--) {
		 	if(this.numerador % i == 0 && this.denominador % i == 0) {
		 		 mdc = i;
		 	}
		 }

		 return mdc;

	}

	private void simplificar() {
		int mdc = getMDC();
		this.numerador /= mdc;
		this.denominador /= mdc;

	}

	public void soma (NumeroRacional numero) {
		int novoDenominador = this.denominador * numero.denominador;
		int novoNumerador = this.numerador * numero.denominador + numero.numerador * this.denominador;

		this.numerador = novoNumerador;
		this.denominador = novoDenominador;

		simplificar();
	}

	public String getString() {
		return ""+numerador+"/"+denominador;
	}
}