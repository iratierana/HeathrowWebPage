package actions.passengerMenu;

import java.util.List;

import domain.dao.DAOFlight;
import domain.model.Flight;

/**
 * The Class AllFlightsAction.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * Class where are made all the processes and loads for Flight list.
 */
public class AllFlightsAction {

	/** The flight list. */
	private List<Flight> flightList = null;

	/**
	 * This function loads all the flights in the database and after that
	 * redirect to another page to see all of them.
	 *
	 * @return The page where we want to go
	 */
	public String execute() {
		flightList = DAOFlight.loadAllFlights();
		return "allFlights";
	}


	/**
	 * Gets the flight list.
	 *
	 * @return the flight list
	 */
	public List<Flight> getFlightList() {
		return flightList;
	}

	/**
	 * Sets the flight list.
	 *
	 * @param flightList the new flight list
	 */
	public void setFlightList(final List<Flight> flightList) {
		this.flightList = flightList;
	}

}
