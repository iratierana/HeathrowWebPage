package hibernateDAOtests;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.dao.DAOAirport;
import domain.model.Airport;

public class TestDAOAirpot {
	
	@Test
	public void testToInsertNewAirport(){
		Airport a = new Airport();
		boolean result;
		
		a.setAirportId(1);
		a.setName("Loiu");
		
		result = DAOAirport.insertAirport(a);
		
		assertTrue("Error inserting new airport", result);
	}
	
	@Test
	public void testToInsertNewAirportWithEmptyAtribute(){
		Airport a = new Airport();
		boolean result;
		
		a.setAirportId(1);
		a.setName(null);
		
		result = DAOAirport.insertAirport(a);
		
		assertFalse("Error inserting new airport", result);
	}
	
	@Test
	public void testToDeleteAirport(){
		Airport a = new Airport();
		boolean result;
		
		a.setAirportId(1);
		
		result = DAOAirport.deleteAirport(a);
		
		assertTrue("Error deleting airport", result);
	}
	
	@Test
	public void testToDeleteAirportWithEmptyObject(){
		assertFalse("Error deleting airport", DAOAirport.deleteAirport(null));
	}
	
	@Test
	public void testToLoadAllAirports(){
		assertNotNull("Error loading all airports", DAOAirport.loadAllAirports());
	}

}
