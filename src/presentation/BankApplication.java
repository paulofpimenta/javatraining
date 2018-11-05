package presentation;
import logic.Account;
import logic.Client;
import logic.LoanAccount;
import logic.PaymentAccount;
import logic.SimpleAccount;

public class BankApplication {

	public static void main(String[] args) {
		
		// Instantiating clients
		Client clark = new Client("Clark","Kent",38,1);
		Client bruce = new Client("Bruce","Wayne",38,2);
		
		// Instatiatinf accounts
		SimpleAccount simpleAcount = new SimpleAccount();
		PaymentAccount paymentAccount = new PaymentAccount();
		
		// Setting client accounts
		simpleAcount.setClient(clark);
		paymentAccount.setClient(bruce);
		
		// Adding solde to account
		simpleAcount.addSolde(100.00);

		System.out.println(simpleAcount);
		System.out.println(simpleAcount.getSolde());
		
	}

}
