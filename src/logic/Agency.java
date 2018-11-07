package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	
	
	public static List<Client> getClients() {
		return clients;
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
	
	//public static void clientTs() {
	//	clients.forEach(client-> System.out.println(client.account.accountType));
	//}
	
	public static void clientsView(String typeOfAccount) {
		List<Client> result = clients;
		if (typeOfAccount!="") { 
			result = clients.stream()
						    .filter(client-> typeOfAccount.equals(client.account.accountType))
						    .collect(Collectors.toList());
		} 
		System.out.println("|=========|=========|=========|========|========|");
		System.out.println("|--CODE---|--NAME---|-SURNAME-|---AGE--|--TYPE--|");
		System.out.println("|=========|=========|=========|========|========|");
		if (result.isEmpty() ) {
			System.out.println("   No results found " + 
							   "\n|--------------------------------------|");
		} else {
			result.forEach(client-> System.out.println("    " + client.getClientNumber() +
		
													"       " + client.getName() + 
													"      " + client.getSurname() + 
													"       " + client.getAge() + 
													"    " + client.getAccount().getAccountType() +
													"\n|-----------------------------------------------|"));
		}
		
	}
	

}
