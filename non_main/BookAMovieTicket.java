package non_main;

public class BookAMovieTicket {

	private String ticketId;
	private String customerName;
	private long mobileNumber;
	String emailId;
	String movieName;
	
	//Constructors of all attributes
	public BookAMovieTicket(String ticketId, String customerName, long mobileNumber, String emailId, String movieName) {
		super();
		this.ticketId = ticketId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.movieName = movieName;
	}

	//getter and setter method
	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMovieName() {
		return movieName;
	}

	@Override
	public String toString() {
		return "BookAMovieTicket [ticketId=" + ticketId + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + ", movieName=" + movieName + "]";
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
	
}
