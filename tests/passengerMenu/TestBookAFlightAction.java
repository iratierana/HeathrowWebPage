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

// TODO: Auto-generated Javadoc
/**
 * The Class TestBookAFlightAction.
 */
public class TestBookAFlightAction {
	
	/** The action context. */
	private ActionContext actionContext;
	
	/** The context map. */
	private Map<String, Object> contextMap;
	
	/** The book flight action. */
	private BookAFlightAction bookFlightAction;
	
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
		
		bookFlightAction = Mockito.mock(BookAFlightAction.class);
		bookFlightAction = Mockito.spy(new BookAFlightAction());
	}
	
	/**
	 * Destroy test.
	 */
	@After
	public void detroyTest() {
		this.setActionContext(null);
		this.setBookFlightAction(null);
		this.setContextMap(null);
	}
	
	/**
	 * Check if the data is filled.
	 */
	@Test
	public void checkIfTheDataIsFilled() {
		bookFlightAction = new BookAFlightAction(); 
		bookFlightAction.execute();
		assertNotNull("The planes are not loaded", bookFlightAction.getBirthDate());

	}
	
	/**
	 * Check if the redirection is ok.
	 */
	@Test
	public void checkIfTheRedirectionIsOk() {
		String ret;
		bookFlightAction = new BookAFlightAction();
		ret = bookFlightAction.execute();
		
		assertEquals("The redirection was NOT OK", ret, "bookAFlight");
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
	 * Sets the book flight action.
	 *
	 * @param bookFlightAction the new book flight action
	 */
	public void setBookFlightAction(final BookAFlightAction bookFlightAction) {
		this.bookFlightAction = bookFlightAction;
	}
}
