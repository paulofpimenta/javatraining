package tp;

public class Person implements IPerson {
	
	private String name;

	@Override
	public void bonjour() {
		// TODO Auto-generated method stub
		System.out.println("Person 2");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String id() {
		// TODO Auto-generated method stub
		return "my id is " + getName();
	}
}
