package non_main;

import java.util.regex.Pattern;

public class GoldTicket extends BookAMovieTicket{

	public GoldTicket(String ticketId, String customerName, long mobileNumber, String emailId, String movieName) {
		super(ticketId, customerName, mobileNumber, emailId, movieName);

	}
	
	BookAMovieTicket b1 = new BookAMovieTicket(getTicketId(), getCustomerName(), getMobileNumber(),getEmailId(), getMovieName());

	public boolean ValidateTicketId()
	{
		
		String str = b1.getTicketId();
		boolean answer = Pattern.matches("[GOLD001-999]{7}", str);
		return answer;
		
	}
	
	public int claculateTicketCost(int numberofTickets, String ACFacility)
	{
		int Ac = 500;
		int NonAC = 350;
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
