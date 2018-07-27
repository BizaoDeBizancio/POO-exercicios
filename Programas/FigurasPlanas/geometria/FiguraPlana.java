package geometria;

class FiguraPlana {
	protected String tipo;
	public double perimetro() {
		return 0;
	}

	public double area() {
		return 0;
	}

	public String toString() {
		return "Obj: "+tipo+", Area: "+(Math.round(area()))+", Perimetro: "+(Math.round(perimetro()));
	}


}