import geometria.*;

public class Principal {
	public static void main(String[] args){
		double[] qLados = {2,2,2,2};
		Quadrado q = new Quadrado(qLados);
		System.out.println(q.toString());


		double[] wLados = {3,4,5};
		Triangulo w = new Triangulo(wLados);
		System.out.println(w.toString());

		double[] eLados = {3,9,3,9};
		Retangulo e = new Retangulo(eLados);
		System.out.println(e.toString());

		double raio = 5;
		Circulo r = new Circulo(raio);
		System.out.println(r.toString());
	}

}