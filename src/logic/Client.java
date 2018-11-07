package logic;

public class Client extends Person{
	
	private Integer clientNumber;
	protected Account account;


	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	protected Agency agency;
	protected static int totalClients;
	
	
	public Client() {
		totalClients++;
	}
	
	public Client(String name, String surname, Integer age, Integer clientNumber) {
		super(name, surname, age);
		this.clientNumber = clientNumber;
		totalClients++;
		
	}

	public static int getTotalClients() {
		return totalClients;
	}

	public static void setTotalClients(int totalClients) {
		Client.totalClients = totalClients;
	}

	public Integer getClientNumber() {
		return clientNumber;
	}


	public void setClientNumber(Integer clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "Client [clientNumber=" + clientNumber + ", getName()=" + getName() + ", getSurname()=" + getSurname()
				+ ", getAge()=" + getAge() + ", getAcccount()=" + getAccount() + "\n" + super.toString() + "]";
	}

	public Account getAccount() {
		//System.out.println("o get ------------ " + account + "----");
		return account;
	}

	public void setAccount(Account account) {
		//System.out.println("Deu set ------------ " + account + "----");
		this.account = account;

	} 

}
