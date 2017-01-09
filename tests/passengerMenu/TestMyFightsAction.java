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

// TODO: Auto-generated Javadoc
/**
 * The Class TestMyFightsAction.
 */
public class TestMyFightsAction {
	
	/** The action context. */
	private ActionContext actionContext;
	
	/** The context map. */
	private Map<String, Object> contextMap;
	
	/** The my flights act. */
	private MyFlightsAction myFlightsAct;
	
	/**
	 * Prepare test.
	 */
	@Before
	public void prepareTest() {
		Passanger p = DAOPassanger.loadPassanger("123", "ane95");
		contextMap = new HashMap<String, Object>();
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(contextMap);
		
		contextMap.put("loggedPassanger", p);
		
		
		ActionContext.setContext(actionContext);
		
		myFlightsAct = Mockito.mock(MyFlightsAction.class);
		myFlightsAct = Mockito.spy(new MyFlightsAction());
	}
	
	/**
	 * Destroy test.
	 */
	@After
	public void destroyTest() {
		this.setActionContext(null);
		this.setContextMap(null);
		this.setMyFlightsAct(null);
	}
	
	/**
	 * Check the flight loading and redirection.
	 */
	@Test
	public void checkTheFlightLoadingAndRedirection() {
		String ret;
		ret = myFlightsAct.execute();
		assertEquals("The redirection was NOT OK", ret, "myFlights");

	}

	/**
	 * Sets the action context.
	 *
	 * @param actionContext the new action context
	 */
	public void setActionContext(final ActionContext actionContext) {
		this.actionContext = actionContext;
	}

	/**
	 * Sets the context map.
	 *
	 * @param contextMap the context map
	 */
	public void setContextMap(final Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}

	/**
	 * Sets the my flights act.
	 *
	 * @param myFlightsAct the new my flights act
	 */
	public void setMyFlightsAct(final MyFlightsAction myFlightsAct) {
		this.myFlightsAct = myFlightsAct;
	}
}
