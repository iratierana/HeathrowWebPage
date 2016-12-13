package actions.passengerMenu;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOPassanger;
import domain.model.Flight;
import domain.model.Passanger;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads for loading the user flights.
 *  
 */
public class MyFlightsAction {
	
	private List<Flight> myFlightList = null;
	@SuppressWarnings("rawtypes")
	Map session = ActionContext.getContext().getSession();	
	
	/**
	 * 
	 * This function loads all the fights of the user in session and save it in the myFlightList
	 * to access from the jsp file
	 * 
	 * @return the page wehere we want to go
	 */
	public String execute(){
		Passanger p = (Passanger) session.get("loggedPassanger");
		myFlightList = DAOPassanger.loadPassangerFlights(p.getPassangerId());
		return "myFlights";
	}

	public List<Flight> getMyFlightList() {
		return myFlightList;
	}

	public void setMyFlightList(List<Flight> myFlightList) {
		this.myFlightList = myFlightList;
	}
	

	
	
}
