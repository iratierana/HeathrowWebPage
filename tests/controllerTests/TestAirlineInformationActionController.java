package controllerTests;
import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.airlineManager.AirlineInformationAction;


public class TestAirlineInformationActionController {
	
	AirlineInformationAction airInfoAct;
	ActionContext actionContext;
	
	@Before
	public void pepareForCorrectTest(){
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		
		ActionContext.setContext(actionContext);
		
		airInfoAct = Mockito.mock(AirlineInformationAction.class);
		airInfoAct = Mockito.spy(new AirlineInformationAction());
	}
	
	@After
	public void finishTheTesting(){
		this.setAirInfoAct(null);
	}
	
	@Test
	public void testIfTheFunctionExecuteCorrectInaCorrectWayRedirectingThePage(){
		
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


	public void setAirInfoAct(AirlineInformationAction airInfoAct) {
		this.airInfoAct = airInfoAct;
	}

}
