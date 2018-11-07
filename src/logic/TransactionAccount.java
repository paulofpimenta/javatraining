package logic;

public class TransactionAccount extends Account{

	private double percentage;
	private static int totalTransactionAccount;
	
	public TransactionAccount() {
		this.setAccountType("Transaction");
		this.setSolde(200.0);
		this.setPercentage(0.10);
		totalTransactionAccount++;
	}

	@Override
	public String toString() {
		return "\nTransationAccount [percentage=" + percentage + ", toString()=" + super.toString() + "]";
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public void withdrawal (Double amount) {
		
		if (solde >= 0  && amount > 0){
			solde = (solde - amount - (solde * this.percentage));
			System.out.println("Mr(s) " + this.client.getSurname() + " has withdrawn " + amount + " with a tax percentage of " + this.percentage);
			System.out.println("Mr(s) " + this.client.getSurname() + " sold is now " + this.solde);
		} else {
			System.out.println("Not enough sold (" + solde + ")" + " for a withdrawn of " + amount);
		}
	}
	@Override
	public void transfer(Account targetAccount, Double montant) {
		Double totalSolde = solde - montant;
		
		if (totalSolde > 0) {
			solde = (solde - montant - (solde * this.percentage));
			targetAccount.solde += montant;
		} else {
			System.out.println("\nNot enough sold (" + solde + ")" + " for a transfer of " + montant);
		}
	}
	@Override
	public void deposit(Double amount) {
		if (amount > 0) {
			double finalSold = this.getSolde() + amount - (amount * this.getPercentage());
			this.setSolde(finalSold);
			System.out.println("\nDeposit of " + amount + " was sucessfully done with a percentage rate of " + this.getPercentage());
		} else {
			System.out.println("\nCannot make a deposit with a negative amount");
		}
	}
	
	public static int getTotalTransactionAccount() {
		return totalTransactionAccount;
	}

	public static void setTotalTransactionAccount(int totalTransactionAccount) {
		TransactionAccount.totalTransactionAccount = totalTransactionAccount;
	}

}
