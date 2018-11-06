package logic;

import java.util.ArrayList;

public class Client extends Person{
	
	private Integer clientNumber;
	protected static ArrayList<Client> clients = new ArrayList<>();
	protected static int totalClients;
	
	
	public Client() {
		totalClients++;
	}
	
	public Client(String name, String surname, Integer age, Integer clientNumber) {
		super(name, surname, age);
		this.clientNumber = clientNumber;
		totalClients++;
		clients.add(this);

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

	
	public static void clientsView() {
		System.out.println("|=========|=========|=========|========|");
		System.out.println("|--CODE---|--NAME---|-SURNAME-|---AGE--|");
		System.out.println("|=========|=========|=========|========|");
		clients.forEach(client-> System.out.println("    " + client.getClientNumber() +
													"       " + client.getName() + 
													"     " + client.getSurname() + 
													"    " + client.getAge() + 
													"\n|--------------------------------------|"));
		//for (Client aClient : clients) {
		//	System.out.println("wow");
		    //System.out.println(aClient.clientNumber);
		//}
		
	} 

}
