package logic;

public class TransationAccount extends Account{

	private Double percentage ;
	
	public TransationAccount() {
		this.setSolde(200.0);
	}

	@Override
	public String toString() {
		return "\nTransationAccount [percentage=" + percentage + ", toString()=" + super.toString() + "]";
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

}
