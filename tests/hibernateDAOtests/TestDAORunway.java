package hibernateDAOtests;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.dao.DAORunway;
import domain.model.Runway;

public class TestDAORunway {
	
	
	@Test
	public void testToInsertNewRunway(){
		Runway r = new Runway();
		boolean result;
		
		r.setTipo("Aterrizaje");
		r.setRunwayId(1);
		r.setState(true);
		
		result = DAORunway.insertRunway(r);
		
		assertTrue("Error inserting a new runway", result);
		
	}
	
	@Test
	public void testToInsertNewRunwayWithEmtyParameter(){
		Runway r = new Runway();
		boolean result;
		
		r.setTipo(null);
		r.setRunwayId(1);
		r.setState(true);
		
		result = DAORunway.insertRunway(r);
		
		assertFalse("Error inserting a new runway", result);
	}
	
	@Test
	public void testToDeleteARunway(){
		Runway r = new Runway();
		boolean result;
		
		r.setRunwayId(1);
		
		result = DAORunway.deleteRunway(r);
		
		assertTrue("Error deleting a runway", result);
	}
	
	@Test
	public void testToDeleteRunwayWithEmptyObject(){	
		
		assertTrue("Error deleting a runway", DAORunway.deleteRunway(null));
	}
	
	@Test
	public void testToLoadAllRunways(){
		assertNotNull("Error loading all runways", DAORunway.loadAllRunways());
	}

}
