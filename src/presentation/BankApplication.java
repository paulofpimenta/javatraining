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
		
		// Instantiating accounts
		SimpleAccount clarkAccount = new SimpleAccount();
		PaymentAccount bruceAccount = new PaymentAccount();
		
		// Setting client accounts
		clarkAccount.setClient(clark);
		bruceAccount.setClient(bruce);
		
		// Adding solde to clark's and bruce's account
		clarkAccount.addSolde(100.00);
		bruceAccount.addSolde(1000.00);
		System.out.println(bruceAccount.getSolde());  
		// Adding solde to clark's account
		bruceAccount.transfer(clarkAccount, 50.00);

		
		System.out.println(clarkAccount.getSolde());
		System.out.println(clarkAccount);
		//System.out.println("##########################################");
		System.out.println(bruceAccount);
		
	}

}
