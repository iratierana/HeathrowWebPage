package hibernateDAOtests;
import static org.junit.Assert.*;

import org.junit.Test;

import domain.dao.DAOAirlineManager;

public class TestDAOAirlineManager {

	
	@Test
	public void testIfTheAirlineManagerIsLoadedSendingCorrectValues(){
		String username="arizz";
		String password="arizz";
		assertNotNull(DAOAirlineManager.loadAirLineManager(username, password));
	}
	
	@Test
	public void testIfTheAirlineManagerIsNotLoadedSendingIncorrectValues(){
		String username="a";
		String password="c";
		assertNull((DAOAirlineManager.loadAirLineManager(username, password)));
	}
	
}
