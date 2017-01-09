package hibernateDAOtests;
import static org.junit.Assert.*;

import org.junit.Test;

import domain.dao.DAOAirlineManager;

// TODO: Auto-generated Javadoc
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
		String password = "arizz";
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
