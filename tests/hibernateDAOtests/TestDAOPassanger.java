package hibernateDAOtests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import domain.dao.DAOPassanger;
import domain.model.Passanger;

// TODO: Auto-generated Javadoc
/**
 * The Class TestDAOPassanger.
 */
public class TestDAOPassanger {

	/**
	 * Test to insert new passanger with all atributes.
	 */
	@Test
	public void testToInsertNewPassangerWithAllAtributes() {
		Passanger p = new Passanger();
		boolean result;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d;
		try {
			d = sdf.parse("28/08/1996");
			p.setPassangerId(1);
			p.setBirthDate(d);
			p.setDni_passport("45126387X");
			p.setEmail("xjauregi@sareteknika.com");
			p.setFirstName("Ane");
			p.setHomeTlf("945234518");
			p.setLastName1("Alameda");
			p.setLastName2("Alamenda");
			p.setMovileTlf("688686945");
			p.setPassword("ane95");
			p.setUsername("123");
			
			result = DAOPassanger.insertPassanger(p);
			
			assertTrue("Error inserting a new passanger", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Test to insert new passanger with A null atribute.
	 */
	@Test
	public void testToInsertNewPassangerWithANullAtribute() {
		
		Passanger p = new Passanger();
		boolean result;
		
		p.setBirthDate(null);
		p.setDni_passport("45126387X");
		p.setEmail("xjauregi@sareteknika.com");
		p.setFirstName("Ane");
		p.setHomeTlf("945234518");
		p.setLastName1("Alameda");
		p.setLastName2("Alamenda");
		p.setMovileTlf("688686945");
		p.setPassword("ane95");
		p.setUsername("123");
		
		result = DAOPassanger.insertPassanger(p);
		
		assertFalse("Error inserting a new passanger", result);
	}

	/**
	 * Test to load A passenger with correct data.
	 */
	@Test
	public void testToLoadAPassengerWithCorrectData() {
		String pass = "ane95";
		String username = "123";
		
		assertNotNull(DAOPassanger.loadPassanger(username, pass));
	}
	
	/**
	 * Test to load passenger flights.
	 */
	@Test
	public void testToLoadPassengerFlights() {
		assertNotNull(DAOPassanger.loadPassangerFlights(1));
	}
	
	/**
	 * Test to update A passenger.
	 */
	@Test
	public void testToUpdateAPassenger() {
		Passanger p = new Passanger();
		
		p.setFirstName("a");
		p.setLastName1("a");
		p.setLastName2("a");
		p.setDni_passport("a");
		p.setHomeTlf("a");
		p.setMovileTlf("a");
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try {
			p.setBirthDate(formatter.parse("1/1/2010"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		p.setUsername("a");
		p.setPassword("a");
		p.setPassangerId(376);
		
		assertTrue(DAOPassanger.updatePassanger(p));
		
		
		
	}
	
	/**
	 * Test to add flight to logged passenger.
	 */
	@Test
	public void testToAddFlightToLoggedPassenger() {
		//TODO Testa itxeko denboria badao 
	}
}
