import estrutura.*;
import objetos.*;

public class PrincipalGenerics {

	public static void main(String[] args) {
	
		try {
			Eletronico tablet = new Tablet("1234");
			Eletronico notebook1 = new Notebook("5678", 2);
			Eletronico notebook2 = new Notebook("0000", 25);
			
			PilhaGenericaEletronico<Notebook> p1 = new PilhaGenericaEletronico<Notebook>(10); // Esta pilha armazena somente eletronicos
			p1.empilha((Notebook) notebook1);
			p1.empilha((Notebook) notebook2);

			PilhaGenericaEletronico<Eletronico> p2 = new PilhaGenericaEletronico<Eletronico>(10);
			p2.empilha((Tablet) tablet);

			for (int i = 0; i < 2; i++)
				System.out.println("Item P1: " + p1.desempilha());

			for (int i = 0 ; i < 1 ; i++)
				System.out.println("Item P2: " + p2.desempilha());
			
		} catch (PilhaCheiaException e) {
			System.out.println("Pilha esta cheia!");
		} catch (PilhaVaziaException e) {
			System.out.println("Pilha esta vazia!");
		} catch (Exception e) {
			System.out.println("Outro erro: " + e);
		}
	}

}