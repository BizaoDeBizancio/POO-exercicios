package jogadores;

import java.util.Scanner;

public class GoleiroPessoa extends Jogador implements IDefendeStrategy{

	public GoleiroPessoa(String nome) {
		super(nome);
	}

	public int defender() {
		System.out.println("Qual lado voce vai defender? 1=esquerda 2=meio 3=direita");
		Scanner leitor = new Scanner(System.in);
		return leitor.nextInt();		
	}

}