package logic;

import java.util.ArrayList;
import java.util.List;



public class Client extends Person{
	
	private Integer clientNumber;
	protected Account account;


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
				+ ", getAge()=" + getAge() + "\n" + super.toString() + "]";
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	} 

}
