package hibernateDAOtests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import domain.dao.DAOAirlineManager;


/**
 * The Class TestDAOAirlineManager.
 */
public class TestDAOAirlineManager {


	/**
	 * Test if the airline manager is loaded sending correct values.
	 */
	@Test
	public void testIfTheAirlineManagerIsLoadedSendingCorrectValues() {
		String username = "arizz";
		String password = "123";
		assertNotNull(DAOAirlineManager.loadAirLineManager(username, password));
	}

	/**
	 * Test if the airline manager is not loaded sending incorrect values.
	 */
	@Test
	public void testIfTheAirlineManagerIsNotLoadedSendingIncorrectValues() {
		String username = "a";
		String password = "c";
		assertNull((DAOAirlineManager.loadAirLineManager(username, password)));
	}

}
