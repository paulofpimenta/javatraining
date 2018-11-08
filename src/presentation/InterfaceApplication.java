package presentation;

import tp.Car;
import tp.IPerson;
import tp.Person;

public class InterfaceApplication {
	
	public static void main(String[] args) {
		IPerson p = new Person();
		p.bonjour();
		System.out.println(p.id());
		
		IPerson c = new Car();
		c.bonjour();
		System.out.println(c.id());

	}
}
