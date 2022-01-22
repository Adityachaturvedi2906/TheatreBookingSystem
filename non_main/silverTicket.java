package non_main;

import java.util.regex.Pattern;

public class silverTicket extends BookAMovieTicket{

	public silverTicket(String ticketId, String customerName, long mobileNumber, String emailId, String movieName) {
		super(ticketId, customerName, mobileNumber, emailId, movieName);

	}
	
	BookAMovieTicket b1 = new BookAMovieTicket(getTicketId(), getCustomerName(), getMobileNumber(),getEmailId(), getMovieName());

	public boolean ValidateTicketId()
	{
		
		String str = b1.getTicketId();
		boolean answer = Pattern.matches("[SILVER001-999]{9}", str);
		return answer;
		
	}
	
	public int claculateTicketCost(int numberofTickets, String ACFacility)
	{
		int Ac = 250;
		int NonAC = 100;
		int amount = 0;
		
		if(ACFacility.equals("AC"))
		{
			amount = numberofTickets * Ac;
			
		}
		else {
			amount = numberofTickets * NonAC;
		}
		return amount;
	}
	
}
