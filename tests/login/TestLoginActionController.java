package login;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.login.LoginAction;
public class TestLoginActionController {
	
	ActionContext actionContext;
	LoginAction logAct;
	
	@Before
	public void pepareForCorrectTest(){
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		
		logAct = Mockito.spy(new LoginAction());	

		ActionContext.setContext(actionContext);
		
	}
	
	
	@After
	public void finishTheTesting(){
		this.setActionContext(null);
	}

	
	@Test
	public void testIfTheLoginUserDistributionFunctionIsOkIfAPassengerIsLogged(){
		
		String username = "joanes";
		String password = "123";
		String ret;
		
		logAct.setPassword(password);
		logAct.setUsername(username);
		
		ret = logAct.execute();

		assertEquals("The passenger was not logged", ret, "passenger");
	}
	
	@Test
	public void testIfTheLoginUserDistributionFunctionIsOkIfAControllerIsLogged(){
		String username = "irati";
		String password = "123";
		String ret;
		
		logAct.setPassword(password);
		logAct.setUsername(username);
		
		ret = logAct.execute();
		
		assertEquals("The controller was not logged", ret, "airportController");
	}

	@Test
	public void testIfTheLoginUserDistributionFunctionIsOkIfAManagerIsLogged(){
		String username = "arizz";
		String password = "arizz";
		String ret;
		
		logAct.setPassword(password);
		logAct.setUsername(username);
		
		ret = logAct.execute();
		
		assertEquals("The controller was not logged", ret, "airlineManager");
	}

	public void setActionContext(ActionContext actionContext) {
		this.actionContext = actionContext;
	}
	
	
}
