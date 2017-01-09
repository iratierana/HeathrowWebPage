package login;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.login.LoginAction;
// TODO: Auto-generated Javadoc
 
/**
 * The Class TestLoginActionController.
 */
public class TestLoginActionController {
	
	/** The action context. */
	private ActionContext actionContext;
	
	/** The log act. */
	private LoginAction logAct;
	
	/**
	 * Pepare for correct test.
	 */
	@Before
	public void pepareForCorrectTest() {
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		
		logAct = Mockito.spy(new LoginAction());	

		ActionContext.setContext(actionContext);
		
	}
	
	
	/**
	 * Finish the testing.
	 */
	@After
	public void finishTheTesting() {
		this.setActionContext(null);
	}

	
	/**
	 * Test if the login user distribution function 
	 * is ok if A passenger is logged.
	 */
	@Test
	public void testIfTheLoginUserDistributionFunctionIsOkIfAPassengerIsLogged() {
		
		String username = "joanes";
		String password = "123";
		String ret;
		
		logAct.setPassword(password);
		logAct.setUsername(username);
		
		ret = logAct.execute();

		assertEquals("The passenger was not logged", ret, "passenger");
	}
	
	/**
	 * Test if the login user distribution function is
	 *  ok if A controller is logged.
	 */
	@Test
	public void testIfTheLoginUserDistributionFunctionIsOkIfAControllerIsLogged() {
		String username = "irati";
		String password = "123";
		String ret;
		
		logAct.setPassword(password);
		logAct.setUsername(username);
		
		ret = logAct.execute();
		
		assertEquals("The controller was not logged", ret, "airportController");
	}

	/**
	 * Test if the login user distribution 
	 * function is ok if A manager is logged.
	 */
	@Test
	public void testIfTheLoginUserDistributionFunctionIsOkIfAManagerIsLogged() {
		String username = "arizz";
		String password = "arizz";
		String ret;
		
		logAct.setPassword(password);
		logAct.setUsername(username);
		
		ret = logAct.execute();
		
		assertEquals("The controller was not logged", ret, "airlineManager");
	}

	/**
	 * Sets the action context.
	 *
	 * @param actionContext the new action context
	 */
	public void setActionContext(final ActionContext actionContext) {
		this.actionContext = actionContext;
	}
	
}
