package actions.airlineManager;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the process and loads of Airline Information.
 *  
 */
public class AirlineInformationAction {

	/**
	 * 
	 * This function redirect the content flow to another page
	 * 
	 * @return airlineInfo the page(jsp) where we want to redirect
	 */
	public String execute(){
		return "airlineInfo";
	}
}
