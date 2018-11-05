package logic;

public class SimpleAccount extends Account{
	
	private double decouvert;
	
	public SimpleAccount() {
		
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "SimpleAccount [decouvert=" + decouvert + ", \n" + super.toString() + "]";
	}

}
