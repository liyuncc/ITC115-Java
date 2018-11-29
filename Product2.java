import java.text.NumberFormat;

public class Product2 {

	//fields
	private String code;
	private String description;
	private double price;
	private static int count = 0; //count how many products
	
	//constructor is a method too
	public Product2(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
		count++;
	}

	//getter and setter
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
	
	@Override
	public String toString() {//comes from Object superclass
		//toString() converts the object to String
		
		
		return description;
	}
	
	public static int getCount() {
		return count;
	}
}
