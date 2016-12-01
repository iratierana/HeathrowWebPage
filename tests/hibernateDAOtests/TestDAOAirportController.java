package hibernateDAOtests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.Test;
import domain.dao.DAOAirportController;
import domain.model.AirportController;

public class TestDAOAirportController {
	
	@Test
	public void testToInsertAirportControllerWhitAllAtributes(){
		
		AirportController aC = new AirportController();
		boolean result;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d;
		try {
			d = sdf.parse("28/08/1996");
			aC.setAirportControllerId(1);
			aC.setBirthDate(d);
			aC.setDni_passport("45126387X");
			aC.setEmail("xjauregi@sareteknika.com");
			aC.setFirstName("Ane");
			aC.setHomeTlf("945234518");
			aC.setLastName1("Alameda");
			aC.setLastName2("Alamenda");
			aC.setMovileTlf("688686945");
			aC.setPassword("ane95");
			aC.setUsername("123");
			
			result = DAOAirportController.insertAirportController(aC);
			
			assertTrue("Error inserting a new airport controller", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void testToInsertAirportControllerWithNullAtribute(){
		
		AirportController aC = new AirportController();
		boolean result;
		
		aC.setAirportControllerId(1);
		aC.setBirthDate(null);
		aC.setDni_passport("45126387X");
		aC.setEmail("xjauregi@sareteknika.com");
		aC.setFirstName("Ane");
		aC.setHomeTlf("945234518");
		aC.setLastName1("Alameda");
		aC.setLastName2("Alamenda");
		aC.setMovileTlf("688686945");
		aC.setPassword("ane95");
		aC.setUsername("123");
		
		result = DAOAirportController.insertAirportController(aC);
		
		assertFalse("Error insertin a bad airport controller", result);
	}
	
	@Test
	public void testToDeletAirportController(){
		
		AirportController aC = new AirportController();
		
		aC.setAirportControllerId(1);
		
		assertTrue("Error deleting a airport controller", DAOAirportController.deleteAirportController(aC));
	}
	
	@Test
	public void testToDeleteAirportControllerWithNullObject(){
		assertFalse("Error deleting a airport controller", DAOAirportController.deleteAirportController(null));
	}
	
	@Test
	public void testToLoadAllAriportControllers(){
		assertNotNull("Error loading the airport controllers", DAOAirportController.loadAllAirportControllers());
	}

}
