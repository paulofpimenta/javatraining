package presentation;

import logic.Cadre;
import logic.NonCadre;
import logic.Employee;

public class EmployeeApplication {


	public static void main(String[] args) {
		
		Cadre c = new Cadre();
		c.setName("Test");
		NonCadre nc = new NonCadre();
		System.out.println(c.getName());
	}
}
