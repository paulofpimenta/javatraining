package presentation;

import logic.Holding;
import logic.Person;
import logic.Client;
import logic.Employee;

public class Application {
	
	/**
	 * The application main class
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person paulo = new Person();
		Person paulo2 = new Person("Paulo", "Pimenta", 36);
		paulo.setName("Paulo");
		paulo.setSurname("Pimenta");
		paulo.setAge(36);
		
		// Person Show
		paulo.show();
		paulo2.show();
		
		// Using toString()
		System.out.println(paulo);
		System.out.println(paulo2);
		
		// Show objects ID
		String p1Hash = Integer.toHexString(System.identityHashCode(paulo));
		String p2Hash = Integer.toHexString(System.identityHashCode(paulo2));
		System.out.println("First object's reference " + p1Hash);
		System.out.println("Second object's reference " + p2Hash);
		
		
		// Holding
		Holding wayne = new Holding();
		Holding oscorp = new Holding("OSCORP", 120000, "X1FGAY");
		wayne.setName("WAYNE ENTERPRISES");
		wayne.setTotalIncome(120000);
		wayne.setCodeAPE("G13YU6");
		
		// Show holding using toString overridden method
		System.out.println(wayne);
		System.out.println(oscorp);
		
		// Client constructor without parameters
		Client c1 = new Client();
		c1.setName("Peter");
		c1.setClientNumber(1442);
		c1.setSurname("Griffin");
		c1.setAge(38);
		System.out.println(c1);
		
		// Client constructor with parameters
		Client c2 = new Client("Homer","Simpson",45453,40);
		System.out.println(c2);
		
		// Employee constructor without parameters
		Employee e1 = new Employee();
		e1.setName("Michael");
		e1.setSurname("Jordan");
		e1.setAge(38);
		e1.setSalary(100000.34);
		System.out.println(e1);
		
		// Client constructor with parameters
		//String name, String surname, Integer age, Double salary
		Employee e2 = new Employee("Chris","Paul",40,153000.56);
		System.out.println(e2);

	}

}
