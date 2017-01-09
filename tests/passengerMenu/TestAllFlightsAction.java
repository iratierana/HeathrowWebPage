package passengerMenu;

import static org.junit.Assert.*;

import org.junit.Test;

import actions.passengerMenu.AllFlightsAction;

public class TestAllFlightsAction {
	
	AllFlightsAction allFlightsAction;
	
	@Test
	public void checkIfTheRedirectionIsMadeInAGooWay() {
			
		String ret;
		allFlightsAction = new AllFlightsAction();
		ret = allFlightsAction.execute();
		
		assertEquals("The redirection was NOT OK", ret, "allFlights");
	}
	
	@Test
	public void checkIfTheFlightsAreLoaded(){
		
		allFlightsAction = new AllFlightsAction();
		allFlightsAction.execute();
		
		assertNotNull("The planes are not loaded", allFlightsAction.getFlightList());
	}
	
}
