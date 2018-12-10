
public class StudentAdvanceTicket extends AdvanceTicket{

	//constructor
	public StudentAdvanceTicket(int ticketNum, int daysInAdvance) {
		super(ticketNum, daysInAdvance);
		if(daysInAdvance <10) {
			super.setPrice(15.0);
		}else {
			super.setPrice(20.0);
		}
	}
	
	//method
	public String toString() {
		return "Number: " + super.getNumber() + ", price: " + super.getPrice() + " (ID required)";
	}

	
	
	
	

}
