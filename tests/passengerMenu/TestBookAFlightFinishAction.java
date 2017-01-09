package passengerMenu;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import actions.passengerMenu.BookAFlightFinishAction;

public class TestBookAFlightFinishAction {
	
	BookAFlightFinishAction finishBooking;
	
	
	@Test
	public void checkIfTheRedirectionOfThePageIsOKWithExistingFlight(){
		String ret;
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		finishBooking = new BookAFlightFinishAction();
		finishBooking.setFrom("Loiu");
		finishBooking.setTo("Hatrhow");
		
		try {
			finishBooking.setDepartureDay(formatter.parse("09/01/2017"));
			finishBooking.setArrivalDay(formatter.parse("09/01/2017"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ret = finishBooking.execute();
		
		assertEquals("The redirection was NOT OK", ret, "passenger");
	}
	
	@Test
	public void testGettersAndSetters(){
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		finishBooking = new BookAFlightFinishAction();
		Date d = null;
		
		
		try {
			d = formatter.parse("09/01/2017");
			finishBooking.setFrom("a");
			finishBooking.setTo("b");
			finishBooking.setDepartureDay(formatter.parse("09/01/2017"));
			finishBooking.setArrivalDay(formatter.parse("09/01/2017"));
			finishBooking.setNumberOfPassangers(1);
			finishBooking.setName("a");
			finishBooking.setFirstName("a");
			finishBooking.setSecondName("a");
			finishBooking.setDniPassport("a");
			finishBooking.setBirthDate(formatter.parse("09/01/2017"));
			finishBooking.setHomeTlf("a");
			finishBooking.setMovileTlf("a");
			finishBooking.setEmail("a");
			finishBooking.setCa("a");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals("From not equal", "a", finishBooking.getFrom());
		assertEquals("To not equal", "b", finishBooking.getTo());
		assertEquals("Departure date not equal", d, finishBooking.getDepartureDay());
		assertEquals("Arrival date not equal", d, finishBooking.getArrivalDay());
		assertEquals("Number of passengers not equal", (Integer)1, finishBooking.getNumberOfPassangers());
		assertEquals("Name not equal", "a", finishBooking.getName());
		assertEquals("First name not equal", "a", finishBooking.getFirstName());
		assertEquals("Second name not equal", "a", finishBooking.getSecondName());
		assertEquals("Dni not equal", "a", finishBooking.getDniPassport());
		assertEquals("Birth date not equal", d, finishBooking.getBirthDate());
		assertEquals("Home tlf not equal", "a", finishBooking.getHomeTlf());
		assertEquals("Movile tlf not equal", "a", finishBooking.getMovileTlf());
		assertEquals("Email not equal", "a", finishBooking.getEmail());
		assertEquals("Ca not equal", "a", finishBooking.getCa());

	}

}
