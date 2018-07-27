package programa;
import loteria.*;
import java.util.Scanner;

public class Loteria {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (System.in);
			int[] numeros = new int [3];
			NumeroLoteria numerosUsuario;
			NumeroLoteria[] sorteios;


			System.out.println("Digite o numero de sorteios");
			int quantidadeSorteios = sc.nextInt();

			
			
			sorteios = new NumeroLoteria[quantidadeSorteios];
			

			System.out.println("Digite seus 3 numeros");

			for (int i = 0 ; i < 3 ; i++) {
				numeros[i] = sc.nextInt();
			}

			numerosUsuario = new NumeroLoteria(numeros);

			for (NumeroLoteria elemento: sorteios) {
				elemento = new NumeroLoteria();
				System.out.println("Sorteio: " + elemento.getNumeros());
				if(elemento.ganhou(numerosUsuario)) {
					System.out.println("Voce ganhou este sorteio!");
				} else {
					System.out.println("Voce nao ganhou este sorteio!");
				}
			}

		} catch (Exception e){
			System.out.println(e.toString());
			return;
		}

	}
}