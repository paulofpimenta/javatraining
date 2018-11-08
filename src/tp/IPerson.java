package tp;

public interface IPerson {
	
	public void bonjour();
	public default String id() {
		return "default behaviour";
	}
}
