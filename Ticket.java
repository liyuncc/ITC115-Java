
public abstract class Ticket {

	//fields
	private int number;
	private double price;
	
	//constructor
	public Ticket(int ticketNum) {
		this.number = ticketNum;
	}
	
	//methods
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Number: " + number + ", Price: " + price;
	}

	
	
}
