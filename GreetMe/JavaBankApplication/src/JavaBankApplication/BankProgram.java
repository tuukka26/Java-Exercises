package JavaBankApplication;
// ************************************************************************
// BankProgram.java	15.9.2016
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BankProgram {

	private static List<Account> accountList = new ArrayList<Account>();

	// *** DO NOT change anything in the main method ***
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = input.nextInt();
		}

		System.out.println("\nThe program ends now. Bye!");
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------" +
			"---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | " +
			"3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		System.out.print("\n*** Account list ***\n");

	}

	private static void addAccount() {
		System.out.print("\n*** Add an account ***\n");

	}

	// Finds an account in accountList by given account number
	// Returns either the index of the account object in the account list
	// OR -1 if the account is not found.
	private static Account findAccount(String accountNumber) {
		Account myAccount = null;
		
				
		return myAccount;
	}	
	
	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");

	}
		
	private static void withdrawMoney() {
		System.out.print("\n*** Withdraw money from an account ***\n");

	}

	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");

	}
}
// End 
