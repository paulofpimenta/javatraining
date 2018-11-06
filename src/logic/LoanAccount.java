package logic;

public class LoanAccount extends Account {

	private Double interestRateTax;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}

	public Double getInterestRate() {
		return interestRateTax;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRateTax = interestRate;
	}
	
	public Double calculateInterestRate(Double d) {
		return d;
	}
	
	

}
