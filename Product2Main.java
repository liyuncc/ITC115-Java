
public class Product2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product2 p1 = new Product2("123", "Apples", 2.50);
		Product2 p2 = new Product2("456", "Watermelons", 7.00);
		Product2 p3 = new Product2("789", "Coconuts", 5.00);
		
		
		System.out.println(p1.toString());
		System.out.println(p1.getPriceFormatted());
		//System.out.println("Product count: " + p1.getCount());
		
		System.out.println(p2.toString());
		System.out.println(p2.getPriceFormatted());
		
		
	}
	
	

}
