package actions.passengerMenu;

import java.util.List;

import domain.dao.DAOFlight;
import domain.model.Flight;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads for Flight list.
 *  
 */
public class AllFlightsAction {
	
	List<Flight> flightList = null;

	/**
	 * 
	 * This function loads all the flights in the database and after that 
	 * redirect to another page to see all of them
	 * 
	 * @return The page where we want to go
	 */
	public String execute(){
		flightList = DAOFlight.loadAllFlights();
		return "allFlights";
	}
	
	

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}
	
	
}
