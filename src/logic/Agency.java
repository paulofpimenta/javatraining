package logic;

public class Agency {

	protected int number;
	protected String name;
	private Client clients;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Client getClients() {
		return clients;
	}
	public void setClients(Client clients) {
		this.clients = clients;
	}

	

}
