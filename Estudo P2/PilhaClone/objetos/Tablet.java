package objetos;

public class Tablet extends Eletronico {
	
	public Tablet(String serial) {
		super(serial);
	}

	@Override
	public Tablet clone() throws CloneNotSupportedException{
		return new Tablet(super.getSerial());
	}

	@Override
	public String toString() {
		return "Tablet"+"-"+super.getSerial();
	}

}