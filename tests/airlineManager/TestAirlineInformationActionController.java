package airlineManager;
import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import actions.airlineManager.AirlineInformationAction;


// TODO: Auto-generated Javadoc
/**
 * The Class TestAirlineInformationActionController.
 */
public class TestAirlineInformationActionController {
	
	/** The air info act. */
	private AirlineInformationAction airInfoAct;
	
	/**
	 * Pepare for correct test.
	 */
	@Before
	public void pepareForCorrectTest() {
		
		airInfoAct = Mockito.mock(AirlineInformationAction.class);
		airInfoAct = Mockito.spy(new AirlineInformationAction());
	}
	
	/**
	 * Finish the testing.
	 */
	@After
	public void finishTheTesting() {
		this.setAirInfoAct(null);
	}
	
	/**
	 * Test if the function execute correct ina correct way 
	 * redirecting the page.
	 */
	@Test
	public void testIfTheFunctionExecuteCorrectInaCorrectWayRedirectingThePage() {
		
		int airplaneId = 1;
		String ret;
		
		airInfoAct.setAirplaneId(airplaneId);
		try {
			ret = airInfoAct.execute();
		} catch (UnsupportedEncodingException e) {
			ret = null;
			e.printStackTrace();
		}
		
		assertEquals("The plane was not loaded, so that error in redirection", ret, "airlineInfo");
	}


	/**
	 * Sets the air info act.
	 *
	 * @param airInfoAct the new air info act
	 */
	public void setAirInfoAct(final AirlineInformationAction airInfoAct) {
		this.airInfoAct = airInfoAct;
	}

}
