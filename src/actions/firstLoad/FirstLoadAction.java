package actions.firstLoad;

import java.util.List;

import domain.dao.DAOFlight;
import domain.model.Flight;


/**
 * The Class FirstLoadAction.
 */
public class FirstLoadAction {

	/** The flight list. */
	private List<Flight> flightList;

	/**
	 * Execute.
	 *
	 * @return the string
	 */
	public String execute() {
		System.out.println("Loading first login page...");
		flightList = DAOFlight.loadAllFlights();
		return "goToLogin";
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
