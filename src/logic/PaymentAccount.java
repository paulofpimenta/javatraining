package logic;

public class PaymentAccount extends Account{

	private Double percentage ;
	
	public PaymentAccount() {
		
	}

	@Override
	public String toString() {
		return "PaymentAccount [percentage=" + percentage + ", toString()=" + super.toString() + "]";
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

}
