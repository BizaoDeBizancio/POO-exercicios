package objetos;

public class Notebook extends Eletronico implements Cloneable{
	
	private int nUsbs;

	public Notebook(String serial, int nUsbs) {
		super(serial);
		this.nUsbs = nUsbs;
	}

	@Override
	public Notebook clone() throws CloneNotSupportedException{
		return new Notebook(super.getSerial(), this.nUsbs);
	}

	@Override
	public String toString() {
		return "Notebook"+"-"+super.getSerial()+"-"+nUsbs;
	}
}