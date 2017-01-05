package hibernateDAOtests;

import org.junit.Test;

import domain.dao.DAOAirportController;

import static org.junit.Assert.*;

public class TestDAOAirportController {
	
	
	@Test
	public void testToLoadAirportControllerWithCorrectData(){
		String pass="123";
		String username="irati";
		
		assertNotNull(DAOAirportController.loadAirportController(username, pass));
	}


}
