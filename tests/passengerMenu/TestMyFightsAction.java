package passengerMenu;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.passengerMenu.BookAFlightAction;
import actions.passengerMenu.MyFlightsAction;
import domain.dao.DAOPassanger;
import domain.model.Passanger;

public class TestMyFightsAction {
	
	ActionContext actionContext;
	Map<String, Object> contextMap;
	MyFlightsAction myFlightsAct;
	
	@Before
	public void prepareTest(){
		Passanger p = DAOPassanger.loadPassanger("123", "ane95");
		contextMap = new HashMap<String, Object>();
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(contextMap);
		
		contextMap.put("loggedPassanger", p);
		
		
		ActionContext.setContext(actionContext);
		
		myFlightsAct = Mockito.mock(MyFlightsAction.class);
		myFlightsAct = Mockito.spy(new MyFlightsAction());
	}
	
	@After
	public void destroyTest(){
		this.setActionContext(null);
		this.setContextMap(null);
		this.setMyFlightsAct(null);
	}
	
	@Test
	public void checkTheFlightLoadingAndRedirection(){
		String ret;
		ret = myFlightsAct.execute();
		assertEquals("The redirection was NOT OK", ret, "myFlights");

	}

	public void setActionContext(ActionContext actionContext) {
		this.actionContext = actionContext;
	}

	public void setContextMap(Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}

	public void setMyFlightsAct(MyFlightsAction myFlightsAct) {
		this.myFlightsAct = myFlightsAct;
	}
	
	

}
