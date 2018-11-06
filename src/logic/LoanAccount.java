package logic;

public class LoanAccount extends Account {

	private Double interestRateTax;
	private static int totalLoanAccount;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
		totalLoanAccount++;
	}

	public Double getInterestRate() {
		return interestRateTax;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRateTax = interestRate;
	}
	
	public Double calculateInterestRate(Double d) {
		return d;
	}
	
	// Methods
	
	@Override
	public void withdrawal (Double amount) {
		
		if (solde >= 0  && amount > 0){
			solde = (solde - amount);
			System.out.println("Mr(s) " + this.client.getSurname() + " has withdrawn " + amount);
			System.out.println("Mr(s) " + this.client.getSurname() + " sold is now " + this.solde);
		} else {
			System.out.println("Not enough sold (" + solde + ")" + " for a withdrawn of " + amount);
		}
	}
	@Override
	public void transfer(Account targetAccount, Double montant) {
		Double totalSolde = solde - montant;
		
		if (totalSolde > 0) {
			solde = (solde - montant + (montant * this.interestRateTax));
			targetAccount.solde = targetAccount.solde + montant  - (montant * this.interestRateTax) ;
			System.out.println("Mr(s) " + this.client.getSurname() + " has sucessufly made a transfer of " + montant + "with a interest rate of " + interestRateTax);
		} else {
			System.out.println("\nNot enough sold (" + solde + ")" + " for a transfer of " + montant);
		}
	}
	@Override
	public void deposit(Double amount) {
		if (amount > 0) {
			double finalSold = this.getSolde() + amount;
			this.setSolde(finalSold);
			System.out.println("\nDeposit of " + amount + " was sucessfully done");
		} else {
			System.out.println("\nCannot make a deposit with a negative amount");
		}
	}

	public static int getTotalLoanAccount() {
		return totalLoanAccount;
	}

	public static void setTotalLoanAccount(int totalloanAccount) {
		LoanAccount.totalLoanAccount = totalloanAccount;
	}
	
	

}
