package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import non_main.GoldTicket;
import non_main.PlatinumTicket;
import non_main.silverTicket;

public class userInterface {

	public static void main(String[] args) throws Exception {

		BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
	
		while(true)
		{
			System.out.println("****Welcome to My Theatres Portal****");
			System.out.println("Available Class are: SILVER, GOLD, PLATINUM");
			System.out.println("Enter your ticket Id(your class(in uppercase) followed by 3 digit number): ");
			String sId = b1.readLine();
			
			System.out.println("Enter your Name: ");
			String Sname = b1.readLine();
			
			System.out.println("Enter your Mobile Number: ");
			Long PhoneNum = Long.parseLong(b1.readLine());
			
			System.out.println("Enter your Email-Id : ");
			String emailId = b1.readLine();
			
			System.out.println("Enter the name of Movie : ");
			String movieName = b1.readLine();
		
			silverTicket s1 = new silverTicket(sId, Sname, PhoneNum, emailId, movieName);
			boolean silver = s1.ValidateTicketId();
			
			GoldTicket g1 = new GoldTicket(sId, Sname, PhoneNum, emailId, movieName);
			boolean gold = g1.ValidateTicketId();
			
			
			PlatinumTicket p1 = new PlatinumTicket(sId, Sname, PhoneNum, emailId, movieName);
			boolean platinum = p1.ValidateTicketId();
			
			if(silver == true)
			{
				
				//Theater Portal Starts here
				
				System.out.println("-+-+-+-+- Please Select options for tickets -+-+-+-+-");
				
				System.out.println("Please Select Number of Seats you want: ");
				int ticket = Integer.parseInt(b1.readLine());
				
				System.out.println("Non-AC facility: 100 " + "AC facility: 250");
				System.out.println("Please select an option from " + "AC " + "or " + "NON-AC ");
				String ACInput = b1.readLine();
				
				
					System.out.println("Hey " + Sname +" Your Total amount to be Paid is: " + s1.claculateTicketCost(ticket, ACInput));
					break;
			  }
				
				else if(gold == true)
				{
					System.out.println("-+-+-+-+- Please Select options for tickets -+-+-+-+-");
					
					System.out.println("Please Select Number of Seats you want: ");
					int ticketgold = Integer.parseInt(b1.readLine());
					
					System.out.println("Non-AC facility: 350 " + "AC facility: 500");
					System.out.println("Please select an option from " + "AC " + "or " + "NON-AC ");
					String ACInputgold = b1.readLine();
					
					System.out.println( "Hey " + Sname +  " Your Total amount to be Paid is: " + g1.claculateTicketCost(ticketgold, ACInputgold));
						break;
					
				}
				
				else if(platinum == true)
				{
					System.out.println("-+-+-+-+- Please Select options for tickets -+-+-+-+-");
					
					System.out.println("Please Select Number of Seats you want: ");
					int ticketplatinum = Integer.parseInt(b1.readLine());
					
					System.out.println("Non-AC facility: 600 " + "AC facility: 750");
					System.out.println("Please select an option from " + "AC " + "or " + "NON-AC ");
					String ACInputplatinum = b1.readLine();
					
					
						System.out.println("Hey " + Sname +" Your Total amount to be Paid is: " + g1.claculateTicketCost(ticketplatinum, ACInputplatinum));
						break;
					
				

				//Theater Portal Ends here
			}
				else {
				System.out.println("Please Enter a Valid ID");
				System.exit(0);
			}
			
			
		}
		
	
	}

}
