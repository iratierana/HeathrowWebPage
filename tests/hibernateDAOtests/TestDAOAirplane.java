package hibernateDAOtests;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import domain.dao.DAOAirplane;
import domain.model.Airplane;


// TODO: Auto-generated Javadoc
/**
 * The Class TestDAOAirplane.
 */
public class TestDAOAirplane {
	
	
	
	/**
	 * Test to delete airplane with all values.
	 */
	@Test
	public void testToDeleteAirplaneWithAllValues() {
		Airplane a = new Airplane(); 
		boolean result;
		
		try {
			 a = DAOAirplane.loadAirplane(1);
			result = DAOAirplane.deleteAirplane(a);
			
			assertTrue("Error inserting a airplane", result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Test to delete airplane with null airplane.
	 */
	@Test
	public void testToDeleteAirplaneWithNullAirplane() {
		boolean result;
					
		result = DAOAirplane.deleteAirplane(null);
		
		assertFalse("Error deleting a airplane", result);
	}
	
	/**
	 * Test to load airplanes of airline sending A correct id.
	 */
	@Test
	public void testToLoadAirplanesOfAirlineSendingACorrectId() {
		int id = 1;
		assertNotNull(DAOAirplane.loadAirplanesOfAirline(id));
	}
	
	/**
	 * Test to load an specific airline.
	 */
	@Test
	public void testToLoadAnSpecificAirplane() {
		int id = 9;
		assertNotNull(DAOAirplane.loadAirplane(id));
	}

}
