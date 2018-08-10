package estrutura;

import objetos.*;

public class PilhaGenericaEletronico<T extends Eletronico> extends PilhaGenerica<T> {
	public PilhaGenericaEletronico(int tamanhoMax){
		super(tamanhoMax);
	}
}