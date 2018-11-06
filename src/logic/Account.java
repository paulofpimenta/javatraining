package logic;

public class Account {
	
	
	private Integer code;
	protected static int totalAccounts;
	protected Double solde;
	protected Client client;
	
	//Constructors
	public Account() {
		totalAccounts ++;
	}
	
	// Getters and setters
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}

	public static void setTotalAccounts(Integer totalAccounts) {
		Account.totalAccounts = totalAccounts;
	}


	// Methods
	public void addSolde(Double amount) {
		solde += amount;
	}
	
	public void withdrawal (Double amount) {
		
		if (solde >= 0 ){
			solde -= amount;
			System.out.println("Mr(s) " + this.client.getSurname() + " has withdrawn " + amount);
			System.out.println("Mr(s) " + this.client.getSurname() + " sold is now " + this.solde);
		} else {
			System.out.println("Not enough sold (" + solde + ")" + " for a withdrawn of " + amount);
		}
	}
	
	public void transfer(Account targetAccount, Double montant) {
		Double totalSolde = solde - montant;
		if (totalSolde > 0) {
			solde -= montant;
			targetAccount.solde += montant;
		} else {
			System.out.println("\nNot enough sold (" + solde + ")" + " for a transfer of " + montant);
		}
	}
	
	public void deposit(Double amount) {
		
		this.setSolde(solde+=amount);

	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Account [code=" + code + ", solde=" + solde + "\n" + client + "]";
	}
	
	public void showSold() {
		
		System.out.println(" \nMr(s) " + this.getClient().getSurname() + "'s sold is " + this.getSolde());  
	}


	
	
}
