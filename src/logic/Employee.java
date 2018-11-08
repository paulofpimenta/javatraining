package logic;

public abstract class Employee extends Person{
	
	private Double salary;
	private int matricule;


	public Employee() {
		
	}
	

	public Employee(String name, String surname, Integer age) {
		super(name, surname, age);
		// TODO Auto-generated constructor stub
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
	
	// Abstract methods
	
	public abstract float grossSalary();
	
	public abstract int numberWorkedDays(); 
	
	public float vacationIndemities() {
		
		return grossSalary() * numberWorkedDays() / 12;
	}


	public int getMatricule() {
		return matricule;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	} 

}
