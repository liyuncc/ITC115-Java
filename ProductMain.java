//From the client app create instance of 2-3 different products
//and use the toString method to display their data.

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Local pear jam", 4.00);
		Product p2 = new Product(2, "Imported Belgium chocolate", 5.00);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
		//method: getCount (optional)
		
	}

}
