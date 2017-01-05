package hibernateDAOtests;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.Test;

import domain.dao.DAOAirplane;
import domain.model.Airline;
import domain.model.Airplane;
import domain.model.AirplanePhoto;
import domain.model.Airport;
import domain.model.AirportController;
import domain.model.PlanePosition;;

public class TestDAOAirplane {
	
	
	
	@Test
	public void testToDeleteAirplaneWithAllValues(){
		Airplane a = new Airplane(); 
		boolean result;
		
		try {
			a.setName("Boeing 747");
			a.setSerialNumb("27090");
			a.setAirplaneId(1);
			a.setLineNumber(959);
			a.setCurrentRegistration("G-BNLY");
			a.setOperatorOwner("Xabier Jauregi");
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			a.setDeliberyDate(formatter.parse("1/1/2010"));
			a.setEngineModel("RB211-524H2");
			a.setStatus(true);
			a.setHoursOfFlight(500);
			a.setNumberOfFlights(20);
			a.setPlanePosition(new PlanePosition());
			a.setPhotoList(new ArrayList<AirplanePhoto>());
			a.setCotrollerList(new ArrayList<AirportController>());
			a.setAirport(new Airport());
			a.setAirline(new Airline());
			result=DAOAirplane.deleteAirplane(a);
			
			assertTrue("Error inserting a airplane", result);
			
		} catch (Exception e) {
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
	public void testToLoadAirplanesOfAirlineSendingACorrectId(){
		int id=1;
		assertNotNull(DAOAirplane.loadAirplanesOfAirline(id));
	}
	
	@Test
	public void testToLoadAnSpecificAirline(){
		int id=1;
		assertNotNull(DAOAirplane.loadAirplane(id));
	}

}
