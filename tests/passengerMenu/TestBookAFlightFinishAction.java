package passengerMenu;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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

}
