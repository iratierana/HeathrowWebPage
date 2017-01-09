package passengerMenu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.passengerMenu.BookAFlightAction;
import domain.dao.DAOPassanger;
import domain.model.Passanger;

public class TestBookAFlightAction {
	
	ActionContext actionContext;
	Map<String, Object> contextMap;
	BookAFlightAction bookFlightAction;
	
	@Before
	public void prepareTest(){
		
		Passanger p = DAOPassanger.loadPassanger("123", "ane95");
		contextMap = new HashMap<String, Object>();
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(contextMap);
		
		contextMap.put("loggedPassanger", p);
		
		
		ActionContext.setContext(actionContext);
		
		bookFlightAction = Mockito.mock(BookAFlightAction.class);
		bookFlightAction = Mockito.spy(new BookAFlightAction());
	}
	
	@After
	public void detroyTest(){
		this.setActionContext(null);
		this.setBookFlightAction(null);
		this.setContextMap(null);
	}
	
	@Test
	public void checkIfTheDataIsFilled(){
		bookFlightAction = new BookAFlightAction(); 
		bookFlightAction.execute();
		assertNotNull("The planes are not loaded", bookFlightAction.getBirthDate());

	}
	
	@Test
	public void checkIfTheRedirectionIsOk(){
		String ret;
		bookFlightAction = new BookAFlightAction();
		ret = bookFlightAction.execute();
		
		assertEquals("The redirection was NOT OK", ret, "bookAFlight");
	}

	public void setActionContext(ActionContext actionContext) {
		this.actionContext = actionContext;
	}

	public void setContextMap(Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}

	public void setBookFlightAction(BookAFlightAction bookFlightAction) {
		this.bookFlightAction = bookFlightAction;
	}
	
	

}
