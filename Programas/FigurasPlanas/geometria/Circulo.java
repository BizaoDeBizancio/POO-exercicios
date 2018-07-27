package geometria;

public class Circulo extends FiguraPlana {
	double raio;

	public Circulo(double raio){
		this.raio = raio;
		this.tipo = "Circulo";
	}

	public double area() {
		return Math.PI*raio*raio;
	}

	public double perimetro(){
		return 2*Math.PI*raio;
	}
}