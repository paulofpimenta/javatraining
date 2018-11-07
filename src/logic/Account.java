package logic;

public class Account {
	
	
	protected Integer code;
	protected static int totalAccounts;
	protected Double solde;
	protected Agency agency;
	protected Client client;
	protected String accountType = "Account"; 
	
	//Constructors
	public Account() {
		totalAccounts ++;
	}
	
	// Getters and setters
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		//Add the client to the Agency list of clients
		Agency.clients.add(client);
		this.client = client;
		// Set the client account to the current account object type
		this.client.setAccount(this);
	}
	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

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


	@Override
	public String toString() {
		return "Account [code=" + code + ", solde=" + solde + ", agency=" + agency + ", accountType=" + accountType + "]";
	}
	
	public void showSold() {
		//System.out.println("tetetet " + this.getClient().getAccount());
		System.out.println(" \nMr(s) " + this.getClient().getSurname() + "'s sold is " + this.getClient().account.getSolde());  
	}


	}

