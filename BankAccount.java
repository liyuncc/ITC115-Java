//each BankAccount object represents one user's account
//info including name and balance of money


public class BankAccount {


	//fields
	String name;
	double balance;
	double transactionFee = 0.00;

	//constructors
	public BankAccount(String firstName, double bal) {
		this.name = firstName;
		this.balance = bal;
	}
	
	public BankAccount(String firstName, double bal, double transFee) {
		this.name = firstName;
		this.balance = bal;
		this.transactionFee = transFee;
	}
	
	//methods
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public double withdraw(double amount) {
		if(balance - (amount + transactionFee) < 0.00) {
			return balance;
		}else {
		return balance - amount - transactionFee;
		}
	}
	
	public String toString() {
		return (name + ", $" + String.format("%.2f", balance));
	}
	
	
}
