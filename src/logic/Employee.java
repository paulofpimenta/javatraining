package logic;

public class Employee extends Person{
	
	private Double salary;
	

	public Employee() {
		
	}
	


	public Employee(String name, String surname, Integer age, Double salary) {
		super(name, surname, age);
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", toString()=" + super.toString() + "]";
	}

	
	

}
