package geometria;

abstract class Poligono extends FiguraPlana{
	protected double lados[] = null;

	public Poligono(double[] lados) {
		this.lados = lados.clone();
	}

	@Override
	public double perimetro(){
		double soma = 0;

		if(lados != null) {
			for (int i = 0; i < lados.length ; i++) {
				soma += lados[i];
			}
		}

		return soma;
	}

}