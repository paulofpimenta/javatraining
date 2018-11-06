package presentation;

import logic.Client;
import logic.TransationAccount;
import logic.SimpleAccount;
import logic.LoanAccount;

public class BankApplication {

	public static void main(String[] args) {
		
		// Instantiating clients
		Client clark = new Client("Clark","Kent",38,1);
		Client bruce = new Client("Bruce","Wayne",38,2);
		Client jordan = new Client("Jordan","Hal",37,3);
		
		// Instantiating accounts
		SimpleAccount clarkAccount = new SimpleAccount();
		TransationAccount bruceAccount = new TransationAccount();

		
		// Setting client accounts
		clarkAccount.setClient(clark);
		bruceAccount.setClient(bruce);
		jordan = new Client("Jordan","Hal",37,3);
		
		
		// Show sold on both accounts
		clarkAccount.showSold(); 
		bruceAccount.showSold();  
		
		// Adding a deposit to clark's and bruce's account
		clarkAccount.deposit(200.00);
		bruceAccount.deposit(1000.00);
		
		// Show sold on both accounts after deposit
		clarkAccount.showSold(); 
		bruceAccount.showSold();  

		// Adding sold to clark's account
		bruceAccount.transfer(clarkAccount, 2000.00);

		System.out.println(clarkAccount);
		System.out.println(bruceAccount);
		
		// Clark withdraw
		clarkAccount.withdrawal(70.0);
		// Clark make a new withdraw below this solde
		// Clark can still withdraw as long as his final sold is still below his limit
		clarkAccount.withdrawal(200.0);
		// Clark withdraw fails because the widthdraw is above his account's limit
		clarkAccount.withdrawal(50.0);
		
	}
	
}
