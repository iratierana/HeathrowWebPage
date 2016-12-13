package actions.passengerMenu;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads for the starst of booking.
 *  
 */
public class BookAFlightAction {
	
	/**
	 * 
	 * This function redirect the flow to a booking page
	 * 
	 * @return the page where we want to go
	 */
	public String execute(){
		return "bookAFlight";
	}

}
