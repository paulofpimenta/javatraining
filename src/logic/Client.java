package logic;

public class Client extends Person{
	
	private Integer clientNumber; 
	
	public Client() {
		
		
	}

	public Integer getClientNumber() {
		return clientNumber;
	}

	public Client(String name, String surname, Integer age, Integer clientNumber) {
		super(name, surname, age);
		this.clientNumber = clientNumber;
	}

	public void setClientNumber(Integer clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "Client [clientNumber=" + clientNumber + ", getName()=" + getName() + ", getSurname()=" + getSurname()
				+ ", getAge()=" + getAge() + "\n" + super.toString() + "]";
	}

}
