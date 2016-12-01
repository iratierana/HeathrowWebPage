package hibernateDAOtests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import domain.dao.DAOPlanePosition;
import domain.model.PlanePosition;

public class TestDAOPlanePosition {
	
	@Test
	public void testToInsertNewPlanePosition(){
		boolean result;
		PlanePosition pP = new  PlanePosition();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d;
		try {
			d = sdf.parse("28/08/1996");
			pP.setHour(d);
			pP.setPlanePositionId(1);
			pP.setPosition(2);
			
			result = DAOPlanePosition.insertPlanePosition(pP);
					
			assertTrue("Error insertin a new plane position", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testToInsertNewPlanePositionWithNulAtribute(){
		boolean result;
		PlanePosition pP = new  PlanePosition();
		
		pP.setHour(null);
		pP.setPlanePositionId(1);
		pP.setPosition(2);
			
		result = DAOPlanePosition.insertPlanePosition(pP);
					
		assertFalse("Error insertin a new plane position", result);
		
	}
	
	@Test
	public void testToDeletePlanePosition(){
		PlanePosition pP = new  PlanePosition();
		
		pP.setPlanePositionId(1);
		
		assertTrue("Error deleting the plane position", DAOPlanePosition.deletePlanePosition(pP));
	}
	
	@Test
	public void testToDeletePlanePositionWithNullObject(){
		assertFalse("Error deleting the plane position", DAOPlanePosition.deletePlanePosition(null));
	}
	
	@Test
	public void testToLoadAllPlanePositions(){
		assertNotNull("Error loading all the plane positions",DAOPlanePosition.loadAllPlanePositions());
	}

}
