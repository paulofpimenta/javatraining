package logic;

import java.util.ArrayList;
import java.util.List;

import logic.Entreprise;
public class Person {
	
	private String name;
	private String surname;
	private Integer age;
	
	private List<Entreprise> entrepises = new ArrayList<Entreprise>();
	
	public Person(String name, String surname, Integer age){

		this.name = name;
		this.surname = surname;
		this.age = age;
	}	

	public Person() {

	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}


	public void show() {
		System.out.println("The person's name is " + this.name + " " + this.surname );
		System.out.println(this.name + " is " + this.age + " old");
	}
}
