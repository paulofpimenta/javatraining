package logic;

import java.util.List;

public class Client extends Person{
	
	private Integer clientNumber;
	protected static List<Client> clients;
	protected static int totalClients;
	
	
	public Client() {
		totalClients++;
	}
	
	public Client(String name, String surname, Integer age, Integer clientNumber) {
		super(name, surname, age);
		this.clientNumber = clientNumber;
		totalClients++;

		//System.out.println(clients);
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
				+ ", getAge()=" + getAge() + "\n" + super.toString() + "]";
	}
	
	public static void addClient(Client client) {
		
		clients.add(client);
	}
	
	public static void clientsView() {
		//Client t  = new Client("Paulo", "pimenta", 32, 12);
		//clients.add(t);
		//System.out.println("test");
		//System.out.println(clients.size());
		//for (Client aClient : clients) {
		//	System.out.println("wow");
		    //System.out.println(aClient.clientNumber);
		//}
		
	} 

}
