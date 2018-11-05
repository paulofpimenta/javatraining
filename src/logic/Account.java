package logic;

public class Account {
	
	
	private Integer code;
	private Double solde;
	private Client client;
	
	//Constructors
	public Account() {
		
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


	// Methods
	public void addSolde(Double amount) {
		solde += amount;
	}
	
	public void withdrawal (Double amount) {
		
		if (solde >= 0 ){
			solde -= amount;
		}
	}
	
	public void transfer(Account targetAccount, Double montant) {
		Double totalSolde = solde - montant;
		if (totalSolde > 0) {
			solde -= montant;
			targetAccount.solde += montant;
		} else {
			System.out.println("Not enough sold (" + solde + ")" + " for a transfer of " + montant);
		}
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
		solde = 50.0;
	}

	@Override
	public String toString() {
		return "Account [code=" + code + ", solde=" + solde + "\n" + client + "]";
	}
	
	
	
	
}
