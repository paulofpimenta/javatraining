package logic;
import java.util.List;

import logic.Agency;


public class Bank {

	private String name;
	private final List<Agency> agencies;
	
	// Getters and setters
	public Bank(List<Agency> agenciesList) {
		
		this.agencies = agenciesList;
	}

	public List<Agency> getAgencies() {
		return agencies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
