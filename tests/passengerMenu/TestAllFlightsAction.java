package passengerMenu;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import actions.passengerMenu.AllFlightsAction;

/**
 * The Class TestAllFlightsAction.
 */
public class TestAllFlightsAction {

	/** The all flights action. */
	private AllFlightsAction allFlightsAction;

	/**
	 * Check if the redirection is made in A goo way.
	 */
	@Test
	public void checkIfTheRedirectionIsMadeInAGooWay() {

		String ret;
		allFlightsAction = new AllFlightsAction();
		ret = allFlightsAction.execute();

		assertEquals("The redirection was NOT OK", ret, "allFlights");
	}

	/**
	 * Check if the flights are loaded.
	 */
	@Test
	public void checkIfTheFlightsAreLoaded() {

		allFlightsAction = new AllFlightsAction();
		allFlightsAction.execute();

		assertNotNull("The planes are not loaded", allFlightsAction.getFlightList());
	}

}
