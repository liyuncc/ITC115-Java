
public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Ian = new BankAccount("Ian", 100.00, 2.50);
				
		Ian.deposit(50.00);
		System.out.println(Ian.balance);
		System.out.println(Ian.toString());
		
		Ian.withdraw(200.00);
		System.out.println(Ian.balance);
		System.out.println(Ian.toString());
	}

}
