package hibernateDAOtests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import domain.dao.DAOAirplane;
import domain.model.Airplane;;

public class TestDAOAirplane {
	
	@Test
	public void insertAirplaneWithAllValues(){
		Airplane a = new Airplane(); 
		boolean result;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d;
		try {
			d = sdf.parse("28/08/1996");
			a.setAirplaneId(1);
			a.setCurrentRegistration("R");
			a.setDeliberyDate(d);
			a.setEngineModel("TurboBoost");
			a.setHoursOfFlight(952);
			a.setLineNumber(123);
			a.setName("BOING-0214");
			a.setNumberOfFlights(152);
			a.setOperatorOwner("Lineas Irati");
			a.setSerialNumb("abbabba");
			a.setStatus(true);
			
			result=DAOAirplane.insertAirplane(a);
			
			assertTrue("Error inserting a airplane", result);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void insertAirplaneWithANullDAte(){
		Airplane a = new Airplane(); 
		boolean result;
		
		a.setAirplaneId(1);
		a.setCurrentRegistration("R");
		a.setDeliberyDate(null);
		a.setEngineModel("TurboBoost");
		a.setHoursOfFlight(952);
		a.setLineNumber(123);
		a.setName("BOING-0214");
		a.setNumberOfFlights(152);
		a.setOperatorOwner("Lineas Irati");
		a.setSerialNumb("abbabba");
		a.setStatus(true);
			
		result=DAOAirplane.insertAirplane(a);
		
		assertFalse("Error inserting a airplane", result);
				
	}
	
	@Test
	public void testToDeleteAirplaneWithAllValues(){
		Airplane a = new Airplane(); 
		boolean result;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d;
		try {
			d = sdf.parse("28/08/1996");
			a.setAirplaneId(1);
			a.setCurrentRegistration("R");
			a.setDeliberyDate(d);
			a.setEngineModel("TurboBoost");
			a.setHoursOfFlight(952);
			a.setLineNumber(123);
			a.setName("BOING-0214");
			a.setNumberOfFlights(152);
			a.setOperatorOwner("Lineas Irati");
			a.setSerialNumb("abbabba");
			a.setStatus(true);
			
			result=DAOAirplane.deleteAirplane(a);
			
			assertTrue("Error inserting a airplane", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testToDeleteAirplaneWithNullAirplane(){
		boolean result;
					
		result=DAOAirplane.deleteAirplane(null);
		
		assertFalse("Error deleting a airplane", result);
	}
	
	@Test
	public void testToDeleteAirplaneWithANullName(){
		
		Airplane a = new Airplane(); 
		boolean result;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d;
		try {
			d = sdf.parse("28/08/1996");
			a.setAirplaneId(1);
			a.setCurrentRegistration("R");
			a.setDeliberyDate(d);
			a.setEngineModel("TurboBoost");
			a.setHoursOfFlight(952);
			a.setLineNumber(123);
			a.setName(null);
			a.setNumberOfFlights(152);
			a.setOperatorOwner("Lineas Irati");
			a.setSerialNumb("abbabba");
			a.setStatus(true);
			
			result=DAOAirplane.insertAirplane(a);
			
			assertFalse("Error deleting a airplane", result);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testToLoadIfTheFunctionToLoadAirlinesIsCorrect(){
		
		assertNotNull("Error loading all the airlines", DAOAirplane.loadAllAirplanes());
	}

}
