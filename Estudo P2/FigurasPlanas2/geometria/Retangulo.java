package geometria;

public class Retangulo extends Poligono{


	public Retangulo(double[] lados) {
		super(lados);
		this.tipo = "Retangulo";
	}


	@Override
	public double area() {
		return this.lados[0]*this.lados[1];
	}
}