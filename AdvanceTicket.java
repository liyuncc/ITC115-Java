
public class AdvanceTicket extends Ticket{

	//fields

	//constructor
	public AdvanceTicket(int ticketNum, int daysInAdvance) {
		super(ticketNum);
		if(daysInAdvance > 10) {
			super.setPrice(30.0);
		}else {
			super.setPrice(40.0);
		}
	}
	
	


}
