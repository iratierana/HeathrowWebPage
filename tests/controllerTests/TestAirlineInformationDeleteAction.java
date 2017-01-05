package controllerTests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import actions.airlineManager.AirlineInformationDeleteAction;
import domain.dao.DAOAirlineManager;
import domain.model.AirlineManager;

public class TestAirlineInformationDeleteAction {
	
	ActionContext actionContext;
	AirlineInformationDeleteAction airInfoDelAct;
	
	@Before
	public void pepareForCorrectTest(){
		
		AirlineManager aM = DAOAirlineManager.loadAirLineManager("arizz", "arizz");
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		actionContext.put("loggedAirlineManager", aM);
		
//		Map<String, Object> contextMap = new HashMap<String, Object>();
//		contextMap.put("loggedAirlineManager", aM);
//		ActionContext.setContext(new ActionContext(contextMap));
		
		ActionContext.setContext(actionContext);
		
		airInfoDelAct = Mockito.mock(AirlineInformationDeleteAction.class);
		airInfoDelAct = Mockito.spy(new AirlineInformationDeleteAction());
	}
	

	@After
	public void finishTheTesting(){
		this.setActionContext(null);
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


	public void setActionContext(ActionContext actionContext) {
		this.actionContext = actionContext;
	}
	
}
