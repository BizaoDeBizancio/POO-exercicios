package geometria;

public class Triangulo extends Poligono{
	public Triangulo(double[] lados) {
		super(lados);
		this.tipo = "Triangulo";
	}

	public double area() {
		double p = perimetro()/2;
		return Math.sqrt(p*(p-lados[0])*(p-lados[1])*(p-lados[2]));
	}
}