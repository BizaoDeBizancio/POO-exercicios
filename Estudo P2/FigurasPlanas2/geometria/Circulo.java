package geometria;

public class Circulo extends FiguraPlana {
	double raio;

	public Circulo(double raio){
		this.raio = raio;
		this.tipo = "Circulo";
	}

	@Override
	public double area() {
		return Math.PI*raio*raio;
	}


	@Override
	public double perimetro(){
		return 2*Math.PI*raio;
	}
}