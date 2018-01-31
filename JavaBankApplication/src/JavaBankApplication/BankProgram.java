package JavaBankApplication;

// ************************************************************************
// BankProgram.java	15.9.2016 - Completed on 4th October 2017
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
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
		
		input.close();
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------"
				+ "---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | "
				+ "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("\n*** Account list ***\n");

		for (Account accountListObject : accountList) {

			System.out.println("Number: " + accountListObject.getAccountNumber() + " | Balance: "
					+ twoDecimals.format(accountListObject.getBalance()) + " euros");
		}
		System.out.println("");
	}

	private static void addAccount() {
		Scanner input = new Scanner(System.in);

		System.out.print("\n*** Add an account ***\n");

		System.out.print("Enter account number: ");
		String userInput = input.nextLine();

		if (accountList.contains(findAccount(userInput))) {

			System.out.println("");
			System.out.println("Account not created. Account " + userInput + " exists already!");
			System.out.println("");

		} else {

			accountList.add(new Account(userInput));

			System.out.println("");
			System.out.print("Account created successfully!");
			System.out.println("");
		}
		
		input.close();
	}

	// Finds an account in accountList by given account number
	// Returns either the index of the account object in the account list
	// OR -1 if the account is not found.
	private static Account findAccount(String accountNumber) {

		Account myAccount = null;

		for (Account accountListObject : accountList) {

			if (accountListObject.getAccountNumber().equals(accountNumber)) {

				myAccount = accountListObject;

			}
		}

		return myAccount;
	}

	private static void depositMoney() {
		Scanner input = new Scanner(System.in);

		System.out.print("\n*** Deposit money to an account ***\n");

		System.out.print("Enter account number: ");
		String userInput = input.nextLine();

		if (accountList.contains(findAccount(userInput))) {

			Account myAccount = findAccount(userInput);

			System.out.print("Enter the amount to be deposited: ");
			double amount = input.nextDouble();

			if (amount < 0) {

				System.out.println("");
				System.out.println("Cannot deposit a negative amount!");
				System.out.println("");

			} else {

				myAccount.deposit(amount);

				System.out.println("");
				System.out.println("Deposit completed successfully!");
				System.out.println("");
			}

		} else {

			System.out.println("");
			System.out.println("Account " + userInput + " does not exist!");
			System.out.println("");
		}

		input.close();
	}

	private static void withdrawMoney() {
		Scanner input = new Scanner(System.in);

		System.out.print("\n*** Withdraw money from an account ***\n");

		System.out.print("Enter account number: ");
		String userInput = input.nextLine();
		
		if (accountList.contains(findAccount(userInput))){
			
		Account myAccount = findAccount(userInput);
				
		System.out.print("Enter the amount to be withdrawn: ");
		double amount = input.nextDouble();
				
		if (amount < 0){
			
			System.out.println("");
			System.out.println("Cannot withdraw a negative amount!");
			System.out.println("");
		}	
		
		else if (!myAccount.withdraw(amount)) {
			
			System.out.println("");
			System.out.println("Withdrawal not completed. Available balance is too low.");
			System.out.println("");
			
		} else {
		System.out.println("");
		System.out.println("Withdrawal completed successfully!");
		System.out.println("");
		}
		} else {
			
			System.out.println("");
			System.out.println("Account " + userInput + " does not exist!");
			System.out.println("");
		}
		input.close();
	}

	private static void deleteAccount() {
		Scanner input = new Scanner(System.in);

		System.out.print("\n*** Delete an account ***\n");

		System.out.print("Enter account number: ");
		String userInput = input.nextLine();
		
		if (accountList.contains(findAccount(userInput))) {
		
		accountList.remove(findAccount(userInput));

		System.out.println("");
		System.out.print("Account deleted succesfully!");
		System.out.println("");
		
	} else {
		
		System.out.println("");
		System.out.print("Nothing deleted. Account " + userInput + " does not exist!");
		System.out.println("");
		
	}
		
		input.close();
	}
}
// End
