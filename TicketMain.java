
public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket[] tickets = new Ticket[3];
		tickets[0] = new AdvanceTicket(23, 20);
		tickets[1] = new StudentAdvanceTicket(45, 9);
		tickets[2] = new WalkupTicket(40);
		
		
		for(int i = 0; i < tickets.length; i++){
			
			System.out.println(tickets[i].toString());
		}
	}

}
