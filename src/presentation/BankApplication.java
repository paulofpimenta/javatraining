package presentation;

import logic.Client;
import logic.TransationAccount;
import logic.SimpleAccount;

public class BankApplication {

	public static void main(String[] args) {
		
		// Instantiating clients
		Client clark = new Client("Clark","Kent",38,1);
		Client bruce = new Client("Bruce","Wayne",38,2);
		
		// Instantiating accounts
		SimpleAccount clarkAccount = new SimpleAccount();
		TransationAccount bruceAccount = new TransationAccount();
		
		// Setting client accounts
		clarkAccount.setClient(clark);
		bruceAccount.setClient(bruce);
		
		
		// Adding sold to clark's and bruce's account
		clarkAccount.addSolde(100.00);
		bruceAccount.addSolde(1000.00);
		
		// Show sold on both accounts
		clarkAccount.showSold(); 
		bruceAccount.showSold();  

		// Adding sold to clark's account
		bruceAccount.transfer(clarkAccount, 2000.00);

		System.out.println(clarkAccount);
		System.out.println(bruceAccount);
		
		// Clarck withdraw
		clarkAccount.withdrawal(70.0);
		// Clarck make a new withdraw below this solde
		clarkAccount.withdrawal(100.0);
		
		// coucou
	}
	
}
