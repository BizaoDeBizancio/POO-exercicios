package geometria;

abstract class FiguraPlana {
	protected String tipo;
	public abstract double perimetro();

	public abstract double area();

	public String toString() {
		return "Obj: "+tipo+", Area: "+(Math.round(area()))+", Perimetro: "+(Math.round(perimetro()));
	}


}