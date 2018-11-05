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

		this.solde -= amount;
	}
	
	public void withdrawal (Double d) {
		
		
	}
	
	public void transfer(Account a1, Account a2) {
		
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Account [code=" + code + ", solde=" + solde + ", \nclient=" + client + "]";
	}
	
	
	
	
}
