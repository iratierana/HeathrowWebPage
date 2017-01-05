package controllerTests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

import actions.airlineManager.AirlineInformationDeleteAction;

public class TestAirlineInformationDeleteAction {
	
	AirlineInformationDeleteAction airInfoDelAct;
	
	@Before
	public void pepareForCorrectTest(){
		airInfoDelAct = Mockito.mock(AirlineInformationDeleteAction.class);
		airInfoDelAct = Mockito.spy(new AirlineInformationDeleteAction());
	}
	

	@After
	public void finishTheTesting(){
		this.setAirInfoDelAct(null);
	}
	
	@Test
	public void testIfTheFunctionExecuteCorrectInaCorrectWayRedirectingThePage(){
		
		int airplaneId = 1;
		String ret;
		
		airInfoDelAct.setAirplaneId(airplaneId);
		ret = airInfoDelAct.execute();
		
		assertEquals("Error redirecting the page", ret, "airlineManagerList");
		
	}
	

	public void setAirInfoDelAct(AirlineInformationDeleteAction airInfoDelAct) {
		this.airInfoDelAct = airInfoDelAct;
	}
}
