package hibernateDAOtests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.Test;

import domain.dao.DAOAirlineManager;
import domain.model.AirlineManager;

public class TestDAOAirlineManager {

	@Test
	public void insertAirlineManagerWithAllValues(){
		AirlineManager aM =new AirlineManager();
		boolean result;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d = sdf.parse("28/08/1996");
			aM.setAirlineManagerId(1);
			aM.setBirthDate(d);
			aM.setDni_passport("45114376X");
			aM.setEmail("xabi96@hotmail.es");
			aM.setFirstName("Xabier");
			aM.setHomeTlf("943760604");
			aM.setLastName1("Jauregi");
			aM.setLastName2("Aguirre");
			aM.setMovileTlf("688683618");
			aM.setPassword("123");
			aM.setUsername("jaure96");
			result=DAOAirlineManager.insertAirlineManager(aM);
			assertTrue("Error inserting a airline manager", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}				
	}
	
	@Test
	public void insertAirlineManagerWithANullName(){
		
		AirlineManager aM =new AirlineManager();
		boolean result;
		
		aM.setAirlineManagerId(1);
		aM.setBirthDate(null);
		aM.setDni_passport("45114376X");
		aM.setEmail("xabi96@hotmail.es");
		aM.setFirstName("Xabier");
		aM.setHomeTlf("943760604");
		aM.setLastName1("Jauregi");
		aM.setLastName2("Aguirre");
		aM.setMovileTlf("688683618");
		aM.setPassword("123");
		aM.setUsername("jaure96");
		
		result=DAOAirlineManager.insertAirlineManager(aM);
		
		assertFalse("Error inserting a airline manager", result);
	}
	
	@Test
	public void testToDeleteAirlineManagerWithAllValues(){
		AirlineManager aM =new AirlineManager();
		boolean result;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d = sdf.parse("28/08/1996");
			aM.setAirlineManagerId(1);
			aM.setBirthDate(d);
			aM.setDni_passport("45114376X");
			aM.setEmail("xabi96@hotmail.es");
			aM.setFirstName("Xabier");
			aM.setHomeTlf("943760604");
			aM.setLastName1("Jauregi");
			aM.setLastName2("Aguirre");
			aM.setMovileTlf("688683618");
			aM.setPassword("123");
			aM.setUsername("jaure96");
			result=DAOAirlineManager.deleteAirlineManager(aM);
			assertTrue("Error deleting a airline manager", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testToDeleteAirlineManagerWithEmptyDate(){
		
		boolean result;	
		
		result=DAOAirlineManager.deleteAirlineManager(null);
		
		assertFalse("Error deleting a airline manager", result);
	}
	
	@Test
	public void testToDeleteAirlineManagerWithANullName(){
		AirlineManager aM =new AirlineManager();
		boolean result;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d = sdf.parse("28/08/1996");
			aM.setAirlineManagerId(1);
			aM.setBirthDate(d);
			aM.setDni_passport("45114376X");
			aM.setEmail("xabi96@hotmail.es");
			aM.setFirstName(null);
			aM.setHomeTlf("943760604");
			aM.setLastName1("Jauregi");
			aM.setLastName2("Aguirre");
			aM.setMovileTlf("688683618");
			aM.setPassword("123");
			aM.setUsername("jaure96");
			
			result=DAOAirlineManager.insertAirlineManager(aM);
			
			assertFalse("Error deleting a airline manager", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}			
	}
	
	@Test
	public void testToLoadIfTheFunctionToLoadAirlineManagersIsCorrect(){
		assertNotNull("Error loading all the airline managers", DAOAirlineManager.loadAllAirlineManagers());		
	}
}
