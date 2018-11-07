package logic;

import java.util.ArrayList;
import java.util.List;

import logic.Entreprise;
import logic.Country;
import logic.CountryCode;

public class Adress {
	
	private Integer number;
	private String street;
	private String postCode;
	private String city;
	private Country country;
	private CountryCode countryCode;
	
	private List<Entreprise> entrepises = new ArrayList<Entreprise>();
	
	public Adress() {
		// TODO Auto-generated constructor stub
	}

}
