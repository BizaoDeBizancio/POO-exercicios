package objetos;

public abstract class Eletronico implements Cloneable{
	
	private String serial;

	public Eletronico(String serial) {
		this.serial = serial;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	@Override
	public abstract Eletronico clone() throws CloneNotSupportedException;

}