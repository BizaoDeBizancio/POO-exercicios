package geometria;

public class Retangulo extends Poligono{


	public Retangulo(double[] lados) {
		super(lados);
		this.tipo = "Retangulo";
	}

	/*public Retangulo(double ladoA, double ladoB) {
		double lados[] = new double[4];
		lados[0] = ladoA;
		lados[1] = ladoA;
		lados[2] = ladoB;
		lados[3] = ladoB;

	}*/

	public double area() {
		return this.lados[0]*this.lados[1];
	}
}