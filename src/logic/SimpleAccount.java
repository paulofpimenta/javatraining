package logic;
/**
 * The simple account is a class that represents a common simple bank account 
 * @author Paulo Pimenta
 *
 */
public class SimpleAccount extends Account{
	
	private double decouvert;
	private static int totalSimpleAccount;
	
	public SimpleAccount() {
		super();
		this.setSolde(50.0);
		this.setDecouvert(50.0);
		totalSimpleAccount++;
		
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
	
	/**
	 * @param amount The amount
	 */
	@Override
	public void withdrawal (Double amount) {
		Double soldeSimpleAccount = solde - amount + decouvert;
		if (soldeSimpleAccount >= 0 && amount > 0) {
			solde -= amount;
			System.out.println("\nMr(s) " + this.client.getSurname() + " has withdrawn " + amount);
			System.out.println("Mr(s) " + this.client.getSurname() + " sold is now " + this.solde);
		} else {
			System.out.println("\nNot enough sold (" + solde + ")" + " for a withdrawn of " + amount);
		}
	}
	@Override
	public void deposit(Double amount) {
		if (amount > 0) {
			double finalSold = this.getSolde() + amount;
			this.setSolde(finalSold);
			System.out.println("\nDeposit of " + amount + " was sucessfully done ");
		} else {
			System.out.println("\nCannot make a deposit with a negative amount");
		}
	}
	
	public static int getTotalSimpleAccount() {
		return totalSimpleAccount;
	}

	public static void setTotalSimpleAccount(int totalSimpleAccount) {
		SimpleAccount.totalSimpleAccount = totalSimpleAccount;
	}

	
}
