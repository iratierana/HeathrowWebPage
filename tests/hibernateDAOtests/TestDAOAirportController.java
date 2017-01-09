package hibernateDAOtests;

import org.junit.Test;

import domain.dao.DAOAirportController;

import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The Class TestDAOAirportController.
 */
public class TestDAOAirportController {
	
	
	/**
	 * Test to load airport controller with correct data.
	 */
	@Test
	public void testToLoadAirportControllerWithCorrectData() {
		String pass = "123";
		String username = "irati";
		
		assertNotNull(DAOAirportController.loadAirportController(username, pass));
	}


}
