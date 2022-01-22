package non_main;

import java.util.regex.Pattern;

public class PlatinumTicket extends BookAMovieTicket{

	public PlatinumTicket(String ticketId, String customerName, long mobileNumber, String emailId, String movieName) {
		super(ticketId, customerName, mobileNumber, emailId, movieName);

	}
	
	BookAMovieTicket b1 = new BookAMovieTicket(getTicketId(), getCustomerName(), getMobileNumber(),getEmailId(), getMovieName());

	public boolean ValidateTicketId()
	{
		
		String str = b1.getTicketId();
		boolean answer = Pattern.matches("[PLATINUM001-999]{11}", str);
		return answer;
		
	}
	
	public int claculateTicketCost(int numberofTickets, String ACFacility)
	{
		int Ac = 750;
		int NonAC = 600;
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
