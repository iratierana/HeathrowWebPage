package actions.passengerMenu;

import java.util.List; 
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOPassanger;
import domain.model.Flight;
import domain.model.Passanger;

// TODO: Auto-generated Javadoc
/**
 * The Class MyFlightsAction.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes 
 * and loads for loading the user flights.
 */
public class MyFlightsAction {
	
	/** The my flight list. */
	private List<Flight> myFlightList = null;
	
	/** The session. */
	@SuppressWarnings("rawtypes")
	private Map session = ActionContext.getContext().getSession();	
	
	/**
	 * This function loads all the fights of the user 
	 * in session and save it in the myFlightList
	 * to access from the jsp file.
	 *
	 * @return the page where we want to go
	 */
	public String execute() {
		Passanger p = (Passanger) session.get("loggedPassanger");
		myFlightList = DAOPassanger.loadPassangerFlights(p.getPassangerId());
		return "myFlights";
	}

	/**
	 * Gets the my flight list.
	 *
	 * @return the my flight list
	 */
	public List<Flight> getMyFlightList() {
		return myFlightList;
	}

	/**
	 * Sets the my flight list.
	 *
	 * @param myFlightList the new my flight list
	 */
	public void setMyFlightList(final List<Flight> myFlightList) {
		this.myFlightList = myFlightList;
	}
	

	
	
}
