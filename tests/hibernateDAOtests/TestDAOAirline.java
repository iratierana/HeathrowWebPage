package hibernateDAOtests;

import static org.junit.Assert.*;


import org.junit.Test;

import domain.dao.DAOAirline;
import domain.model.Airline;

public class TestDAOAirline {
	
	@Test
	public void insertAirlineWithAllValues(){
		Airline a = new Airline(); 
		boolean result;
		
		a.setAirlineId(1);
		a.setDescription("This is a current airline");
		a.setName("Naranair");
		
		result=DAOAirline.insertAirline(a);
		
		assertTrue("Error inserting a airline", result);
	}
	
	@Test
	public void insertAirlineWithANullName(){
		Airline a = new Airline();
		boolean result;
		
		a.setAirlineId(1);
		a.setDescription("This is a current airline");
		
		result=DAOAirline.insertAirline(a);
		
		assertFalse("Error inserting  new airline", result);		
	}
	
	@Test
	public void testToDeleteAirlineWithAllValues(){
		Airline a = new Airline();
		boolean result;
		
		a.setAirlineId(1);
		a.setDescription("This is a Naranair airline plane");
		a.setName("Fuftansa");
		
		result = DAOAirline.deleteAirline(a);
				
		assertTrue("Error deleting a airline with all the values", result);
	}
	
	@Test
	public void testToDeleteAirlineWithEmptyName(){
		Airline a = new Airline();
		boolean result;
		
		a.setAirlineId(1);
		a.setDescription("This is a Naranair airline plane");
		a.setName(null);
		
		result = DAOAirline.deleteAirline(a);
				
		assertTrue("Error deleting a airline with all the values", result);
	}
	
	@Test
	public void testToDeleteAirlineWithANullAirline(){
		
		boolean result;		
		
		result = DAOAirline.deleteAirline(null);
				
		assertFalse("Error deleting a airline with all the values", result);
	}
	
	@Test
	public void testToLoadIfTheFunctionToLoadAirlinesIsCorrect(){
		
		assertNotNull("Error loading all the airlines", DAOAirline.loadAllAirlines());
	}

}
