package JavaBankApplication;
// ************************************************************************
// Account.java	15.9.2016
// - The class for Account objects
// ************************************************************************
public class Account {
	// Fields
	
	private String accountNumber;
	private double balance;
	
	// Constructor
	
	public Account(String accountNumber) {
		
		this.accountNumber = accountNumber;
	}
	
	// Methods
	
	public void deposit(double amount) {
		
		balance += amount;
		
	}
	
	public String getAccountNumber() {
		
		return accountNumber;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public boolean withdraw(double amount) {
		
		if (balance < amount) {
			
			return false;
		} else {
			
			balance -= amount;
		}
		
		
		return true;
	}
}
// End