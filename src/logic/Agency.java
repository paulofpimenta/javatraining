package logic;

import java.util.ArrayList;
import java.util.List;

public class Agency {

	protected int number;
	protected String name;
	protected static List<Client> clients = new ArrayList<Client>();
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public static void setClients(List<Client> clients) {
		Agency.clients = clients;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static List<Client> getClients() {
		return clients;
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
