package hibernateDAOtests;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.dao.DAODirection;
import domain.model.Direction;

public class TestDaoDirection {
	
	@Test
	public void testToInsertNewDirectionWithAllAtributes(){
		Direction d = new Direction();
		boolean result;
		
		d.setAddress("Zurradeero 8 4-b");
		d.setCity("bergara");
		d.setCodPost("20570");
		d.setDirectionId(1);
		d.setState("Spain");
		
		result = DAODirection.insertDirection(d);
		
		assertTrue("Error insertin a new direction", result);
	}
	
	@Test
	public void testToInsertNewDirectionWithNullAtribute(){
		Direction d = new Direction();
		boolean result;
		
		d.setAddress("Zurradeero 8 4-b");
		d.setCity("bergara");
		d.setCodPost(null);
		d.setDirectionId(1);
		d.setState("Spain");
		
		result = DAODirection.insertDirection(d);
		
		assertFalse("Error insertin a new direction", result);
	}
	
	@Test
	public void testToDeleteADirection(){
		Direction d = new Direction();
		boolean result;
		
		d.setAddress("Zurradeero 8 4-b");
		d.setCity("bergara");
		d.setCodPost("20570");
		d.setDirectionId(1);
		d.setState("Spain");
		
		result = DAODirection.deleteDirection(d);
		
		assertTrue("Error deleting a direction", result);
	}
	
	@Test
	public void testToLoadAllTheDirecction(){
		assertNotNull("Error loading all directions", DAODirection.loadAllDirections());
	}

}
