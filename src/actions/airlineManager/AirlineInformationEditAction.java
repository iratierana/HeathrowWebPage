package actions.airlineManager;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the process and loads of Editing the airline.
 *  
 */
public class AirlineInformationEditAction {
	/**
	 * 
	 * Redirect the the interaction flow.
	 * 
	 * @return The page where we want to go
	 */
	public String execute() {
		return "airlineEdit";
	}

}
