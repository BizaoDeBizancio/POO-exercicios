package geometria;();
	                ^
geometria/FiguraPlana.java:10: error: class, interface, or enum expected
	public String toString() {
	       ^
geometria/FiguraPlana.java:12: error: class, interface, or enum expected
	}
	^
3 errors
ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ javac *.java geometria/*.java
geometria/FiguraPlana.java:3: error: FiguraPlana is not abstract and does not override abstract method area() in FiguraPlana
class FiguraPlana {
^
1 error
ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ 




ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ javac *.java geometria/*.java
geometria/FiguraPlana.java:3: error: FiguraPlana is not abstract and does not override abstract method area() in FiguraPlana
class FiguraPlana {
^
1 error
ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ javac *.java geometria/*.java
geometria/Poligono.java:3: error: Poligono is not abstract and does not override abstract method area() in FiguraPlana
class Poligono extends FiguraPlana{
^
1 error
ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ javac *.java geometria/*.java
ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ java Principal 
Obj: Quadrado, Area: 4, Perimetro: 8
Obj: Triangulo, Area: 6, Perimetro: 12
Obj: Retangulo, Area: 27, Perimetro: 24
Obj: Circulo, Area: 79, Perimetro: 31
ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ javac *.java geometria/*.java
ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ java Principal 
Obj: Quadrado, Area: 4, Perimetro: 8
Obj: Triangulo, Area: 6, Perimetro: 12
Obj: Retangulo, Area: 27, Perimetro: 24
Obj: Circulo, Area: 79, Perimetro: 31
ufabc@ufabc-OptiPlex-9010:~/Documentos/Java - Ramon/FigurasPlanas2$ 


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