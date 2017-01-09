package airlineManager;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.airlineManager.AirlineInformationEditSaveAction;
import domain.dao.DAOAirlineManager;
import domain.model.AirlineManager;

public class TestAirlineInformationEditSaveAction {
	
	ActionContext actionContext;
	AirlineInformationEditSaveAction airInfoEditSaveAct;
	Map<String, Object> contextMap;

	@Before
	public void prepareTest(){
		
		AirlineManager aM = DAOAirlineManager.loadAirLineManager("arizz", "arizz");
		contextMap = new HashMap<String, Object>();
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(contextMap);
		
		contextMap.put("loggedAirlineManager", aM);		
		ActionContext.setContext(actionContext);
		
		airInfoEditSaveAct = Mockito.mock(AirlineInformationEditSaveAction.class);
		airInfoEditSaveAct = Mockito.spy(new AirlineInformationEditSaveAction());		
	}
	
	@After
	public void destroyTest(){
		this.setActionContext(null);
		this.setAirInfoEditSaveAct(null);
		this.setContextMap(null);
		
	}
	
	@Test
	public void checkIfTheRedirectionOfThePageAndTheCreationOfTheAirplane(){
		String ret;
		
		ret = airInfoEditSaveAct.execute();
		
		assertEquals("Error redirecting the page with filled atributes", ret, "airplanesList");
	}

	public void setActionContext(ActionContext actionContext) {
		this.actionContext = actionContext;
	}

	public void setAirInfoEditSaveAct(AirlineInformationEditSaveAction airInfoEditSaveAct) {
		this.airInfoEditSaveAct = airInfoEditSaveAct;
	}

	public void setContextMap(Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}
	
	
}
