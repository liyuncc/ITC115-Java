import java.text.NumberFormat;

public class Product {

	//fields
	private int productCode;
	private String description;
	private double price;
	
	//constructor
	public Product(int pc, String desc, double pr) {
		this.productCode = pc;
		this.description = desc;
		this.price = pr;
	}
	
	//method 1: getter and setter
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
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

	
	//method 2: toString
	public String toString() {
		return ("Product code " + productCode + " : " + description + ", price: " + this.getPriceFormatted() + "/each");
	}
	
	//method 3: formatted output of the price here
	public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
	
	//method 4: getCount

	
}
