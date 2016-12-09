package hibernateDAOtests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import domain.dao.DAOPassanger;
import domain.model.Passanger;

public class TestDAOPassanger {

	@Test
	public void testToInsertNewPassangerWithAllAtributes(){
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
	
	@Test
	public void testToInsertNewPassangerWithANullAtribute(){
		
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
	
	@Test
	public void testToDeleteAPassanger(){
		Passanger p = new Passanger();
		boolean result;
		
		p.setPassangerId(1);
		
		result = DAOPassanger.deletePassanger(p);
		
		assertTrue("Error deleting a passanger", result);
	}
	
	@Test
	public void testToDeleteAPassangerWhitNullPassanger(){
		boolean result;
		
		result = DAOPassanger.deletePassanger(null);
		
		assertFalse("Error deleting a passanger", result);
	}
	
	
	@Test
	public void testToLoadPassangersFromDirections(){
		List<Passanger> passangerList = null;
		
		passangerList= DAOPassanger.loadAllPassangersFromOneCity("Bergara");
		
		assertNotNull("Error loading the passanger", passangerList);
	}
	
	@Test
	public void testToLoadAllPassangers(){
		assertNotNull("Error loading al the passangers", DAOPassanger.loadAllPassangers());
	}
}
