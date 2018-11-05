package logic;

public class Holding {

	private String name;
	private Integer totalIncome;
	private String codeAPE;
	
	
	// Constructors definition
	
	public Holding() {
		
	}

	/**
	 * A constructor with parameters
	 * @param name Company's name
	 * @param totalIncome Company's total income
	 * @param codeAPE Comapany's codeAPE
	 */
	public Holding(String name, Integer totalIncome, String codeAPE) {
		super();
		this.name = name;
		this.totalIncome = totalIncome;
		this.codeAPE = codeAPE;
	}
	
	
	// Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return the total income
	 */
	public Integer getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(Integer totalIncome) {
		this.totalIncome = totalIncome;
	}


	public String getCodeAPE() {
		return codeAPE;
	}
	public void setCodeAPE(String codeAPE) {
		this.codeAPE = codeAPE;
	}
	
	// toString Overrride
	@Override
	public String toString() {
		return "Holding [name=" + name + ", totalIncome=" + totalIncome + ", codeAPE=" + codeAPE + "]";
	}

}
