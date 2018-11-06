package presentation;

import java.util.Scanner;

import logic.Account;
import logic.Client;
import logic.SimpleAccount;
import logic.TransactionAccount;
import logic.LoanAccount;

public class BankApplication {

	public static void main(String[] args)  {
				
		// Create a menu
		Scanner keyboard = new Scanner(System.in);
		int choiceLv1 = 100;
		int choiceLv2 = 200;
		
		while(choiceLv1 != 0 ) {
			
			System.out.println("\n\n###############################################################");
			System.out.println("########///////******SELECT AN OPTION\\\\\\*******################");
			System.out.println("TYPE 1 TO CREATE AN SINGLE ACCOUNT");
			System.out.println("TYPE 2 TO CREATE A TRANSACTION ACCOUNT");
			System.out.println("TYPE 3 TO CREATE AN LOAN ACCOUNT");
			System.out.println("TYPE 4 TO CREATE AN CLIENT");
			System.out.println("TYPE 5 TO SHOW A LIST OF ACCOUNTS");
			System.out.println("TYPE 6 TO SHOW A LIST OF CLIENTS");
			System.out.println("TYPE 0 TO QUIT");
			System.out.println("########///////******|||||||||||\\\\\\\\\\\\*******#################");
			choiceLv1 = keyboard.nextInt();
			switch (choiceLv1) {
			case 0:
				break;
				
			// Create a single account
			case 1: 
				while (choiceLv2 != 0) {
					System.out.println("MENU CREATE AN SINGLE ACCOUNT - TYPE 0 TO RETURN TO THE PREVIOUS MENU");
					System.out.println("TYPE 1 TO CREATE A CLIENT FIRST");
					System.out.println("TYPE 2 TO VIEW A LIST OF CLIENTS");
					choiceLv2 = keyboard.nextInt();
					switch (choiceLv2) {
					case 1:
						System.out.println("What is th name of client");
						String inputClientName = keyboard.next();
						System.out.println("What is the surname of client");
						String inputClientSurname = keyboard.next();
						System.out.println("What is the code of client");
						int inputClientCode = keyboard.nextInt();
						System.out.println("What is the age of client");
						int inputClientAge = keyboard.nextInt();
						Client c = new Client(inputClientName, inputClientSurname, inputClientCode, inputClientAge);
						break;
					case 2:
						Client.clientsView();
						//System.out.println("\nTotal number of clients : " + Client.clientsView() + "\n");
						break;
						
					default:
						break;
					}
				}
					SimpleAccount s = new SimpleAccount();
					break;
			case 4:
					System.out.println("MENU CREATE AN SINGLE ACCOUNT - TYPE 0 TO RETURN TO THE PREVIOUS MENU");
				
			case 5: 
					System.out.println("Total number of accounts: " + Account.getTotalAccounts() + ", which: " + 
						"\n" + SimpleAccount.getTotalSimpleAccount() + " is a simple type account" + 
						"\n" + TransactionAccount.getTotalTransactionAccount() + " is a transaction type account" +
						"\n" + LoanAccount.getTotalLoanAccount() + " is a loan type account" );
				break;
			default:
				break;
			}
			
		}
		
		
		
		
		
		
		
		// Instantiating clients
		Client clark = new Client("Clark","Kent",38,1);
		Client bruce = new Client("Bruce","Wayne",38,2);
		Client jordan = new Client("Jordan","Hal",37,3);
		
		// Instantiating accounts
		SimpleAccount clarkAccount = new SimpleAccount();
		TransactionAccount bruceAccount = new TransactionAccount();
		LoanAccount jordanAccount = new LoanAccount();

		
		// Setting client accounts
		clarkAccount.setClient(clark);
		bruceAccount.setClient(bruce);
		jordanAccount.setClient(jordan);

		
		// Show sold on both accounts
		clarkAccount.showSold(); 
		bruceAccount.showSold();  
		jordanAccount.showSold();
		
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
		
		// Show total number of accounts()
		System.out.println("Total number of accounts: " + Account.getTotalAccounts() + ", which: " + 
		"\n" + SimpleAccount.getTotalSimpleAccount() + " is a simple type account" + 
		"\n" + TransactionAccount.getTotalTransactionAccount() + " is a transaction type account" +
		"\n" + LoanAccount.getTotalLoanAccount() + " is a loan type account" );
	}
	
}
