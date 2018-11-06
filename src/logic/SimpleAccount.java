package logic;

public class SimpleAccount extends Account{
	
	private double decouvert;
	
	public SimpleAccount() {
		
		this.setSolde(50.0);
		this.setDecouvert(50.0);
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "\nSimpleAccount [decouvert=" + decouvert + ", \n" + super.toString() + "]";
	}
	
	@Override
	public void withdrawal (Double amount) {
		Double soldeSimpleAccount = solde - amount + decouvert;
		if (soldeSimpleAccount >= 0 ) {
			solde -= amount;
			System.out.println("\nMr(s) " + this.client.getSurname() + " has withdrawn " + amount);
			System.out.println("Mr(s) " + this.client.getSurname() + " sold is now " + this.solde);
		} else {
			System.out.println("\nNot enough sold (" + solde + ")" + " for a withdrawn of " + amount);
		}
	}	

}
