package presentation;

import java.util.Scanner;


import logic.Account;
import logic.Client;
import logic.SimpleAccount;
import logic.TransactionAccount;
import logic.LoanAccount;
import logic.Agency;

public class BankApplication {

	public static void main(String[] args)  {
				
		
		// Instantiating clients
		Client clark = new Client("Clark","Kent",38,1);
		Client bruce = new Client("Bruce","Wayne",38,2);
		Client hal = new Client("Hal","Jordan",37,3);
		
		// Instantiating accounts
		SimpleAccount clarkAccount = new SimpleAccount();
		TransactionAccount bruceAccount = new TransactionAccount();
		LoanAccount halAccount = new LoanAccount();
		
		
		// Setting client accounts
		clarkAccount.setClient(clark);
		bruceAccount.setClient(bruce);
		halAccount.setClient(hal);
		
		
		// Menu 
		Scanner keyboard = new Scanner(System.in);
		int choiceLv1 = 100;
		int choiceLv2 = 200;
		
		while(choiceLv1 != 0 ) {
			
			System.out.println("\n\n###############################################################");
			System.out.println("########///////******SELECT AN OPTION\\\\\\*******################\n");
			System.out.println("1 - CREATE AN SIMPLE ACCOUNT");
			System.out.println("2 - CREATE A TRANSACTION ACCOUNT");
			System.out.println("3 - CREATE AN LOAN ACCOUNT");
			System.out.println("4 - PERFORM AN ACCOUNT OPERATION");
			System.out.println("5 - SHOW THE LIST OF ACCOUNTS");
			System.out.println("6 - SHOW THE LIST OF CLIENTS");
			System.out.println("0 - QUIT THE APPLICATION");
			System.out.println("\n########///////******|||||||||||\\\\\\\\\\\\*******#################");
			choiceLv1 = keyboard.nextInt();
			switch (choiceLv1) {
			case 0:
				break;
				
			// MAIN MENU - CREATE A SIMPLE ACCOUNT (OPTION 1)
			case 1: 
				while (choiceLv2 != 0) {
					System.out.println("MENU CREATE AN SINGLE ACCOUNT");
					System.out.println("1 - CREATE A CLIENT WITH A SIMPLE ACCOUNT");
					System.out.println("2 - LIST CLIENTS WITH A SIMPLE ACCOUNT");
					System.out.println("0 - PREVIOUS MENU");
					choiceLv2 = keyboard.nextInt();
					switch (choiceLv2) {
					case 1:
						System.out.println("What is the name of client");
						String inputClientName = keyboard.next();
						System.out.println("What is the surname of client");
						String inputClientSurname = keyboard.next();
						System.out.println("What is the code of client");
						int inputClientCode = keyboard.nextInt();
						System.out.println("What is the age of client");
						int inputClientAge = keyboard.nextInt();
						
						Client client = new Client(inputClientName, inputClientSurname,inputClientAge, inputClientCode);
						SimpleAccount simpleAccount = new SimpleAccount();
						simpleAccount.setClient(client);
						
						break;
					case 2:
						Agency.clientsView("Simple");
						//System.out.println("\nTotal number of clients : " + Client.clientsView() + "\n");
						break;
						
					default:
						break;
					}
				}
				break;
				
			// MAIN MENU - CREATE A TRANSACTION ACCOUNT (OPTION 2)
			case 2:
				while (choiceLv2 != 0) {
					System.out.println("MENU CREATE AN TRANSACTION ACCOUNT");
					System.out.println("1 - CREATE A CLIENT WITH A TRANSACTION ACCOUNT");
					System.out.println("2 - LIST CLIENTS WITH A TRANSACTION ACCOUNT");
					System.out.println("0 - PREVIOUS MENU");
					choiceLv2 = keyboard.nextInt();
					switch (choiceLv2) {
					case 1:
						System.out.println("What is the name of client");
						String inputClientName = keyboard.next();
						System.out.println("What is the surname of client");
						String inputClientSurname = keyboard.next();
						System.out.println("What is the code of client");
						int inputClientCode = keyboard.nextInt();
						System.out.println("What is the age of client");
						int inputClientAge = keyboard.nextInt();
						
						Client client = new Client(inputClientName, inputClientSurname,inputClientAge, inputClientCode);
						TransactionAccount transactionAccount = new TransactionAccount();
						transactionAccount.setClient(client);
						
						break;
					case 2:
						Agency.clientsView("Transaction");
						//System.out.println("\nTotal number of clients : " + Client.clientsView() + "\n");
						break;
						
					default:
						break;
					}
				}
				break;

			// MAIN MENU - CREATE A LOAN ACCOUNT (OPTION 3)
			case 3:
				
				break;
			
			// MAIN MENU -  SELECT AN OPERATION (OPTION 4)	
			case 4:
				System.out.println("PLEASE SELECT AN OPERATION");
				System.out.println("===========================");
				System.out.println("1 - WITHDRAW");
				System.out.println("2 - TRANSFER");
				System.out.println("3 - DEPOSIT");
				System.out.println("0 - RETURN TO PREVIOUS MENU");
				System.out.println("===========================");
				int choice4 = 400;
				while (choice4 !=0) {
					choice4 = keyboard.nextInt();
					// SUB-MENU 4
					switch (choice4) {
					case 1:
						System.out.println("1 - WITHDRAW");
						System.out.println("What is the client's code ?");
						int inputClientCode = keyboard.nextInt();
						System.out.println("What is the amount ?");
						int inputAmount = keyboard.nextInt();
						
						break;
					case 2:
						System.out.println("2 - TRANSFER");
						break;
					case 3:
						System.out.println("3 - DEPOSIT");
						break;
					default:
						break;
					}
				}
				
				break;
				
			// MAIN MENU - VIEW ACCOUNTS REPORT (OPTION 5)
			case 5: 
					System.out.println("Total number of accountsss: " + Account.getTotalAccounts() + ", which: " + 
						"\n" + SimpleAccount.getTotalSimpleAccount() + " is a simple type account" + 
						"\n" + TransactionAccount.getTotalTransactionAccount() + " is a transaction type account" +
						"\n" + LoanAccount.getTotalLoanAccount() + " is a loan type account" );
					break;
			
			// MAIN MENU - VIEW CLIENT LIST (OPTION 6)
			case 6:
				Agency.clientsView("");
				break;
			
			// MAIN MENU - DEFAULT OPTION
			default:
				break;
			}
			
		}
		keyboard.close();
		
		
		// Show sold on both accounts
		clarkAccount.showSold();
		bruceAccount.showSold();  
		halAccount.showSold();
		
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
