package airlineManager;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.airlineManager.AirlineInformationDeleteAction;
import domain.dao.DAOAirlineManager;
import domain.model.AirlineManager;

// TODO: Auto-generated Javadoc
/**
 * The Class TestAirlineInformationDeleteAction.
 */
public class TestAirlineInformationDeleteAction {
	
	/** The action context. */
	private ActionContext actionContext;
	
	/** The air info del act. */
	private AirlineInformationDeleteAction airInfoDelAct;
	
	/** The context map. */
	private Map<String, Object> contextMap;
	
	/**
	 * Pepare for correct test.
	 */
	@Before
	public void pepareForCorrectTest() {
		
		AirlineManager aM = DAOAirlineManager.loadAirLineManager("arizz", "123");
		contextMap = new HashMap<String, Object>();
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(contextMap);
		
		contextMap.put("loggedAirlineManager", aM);
		
		
		ActionContext.setContext(actionContext);
		
		airInfoDelAct = Mockito.mock(AirlineInformationDeleteAction.class);
		airInfoDelAct = Mockito.spy(new AirlineInformationDeleteAction());
	}
	

	/**
	 * Finish the testing.
	 */
	@After
	public void finishTheTesting() {
		this.setActionContext(null);
		this.setAirInfoDelAct(null);
	}
	
	/**
	 * Test if the function execute correct in a correct
	 *  way redirecting the page.
	 */
	@Test
	public void testIfTheFunctionExecuteWorksInaCorrectWayRedirectingThePage() {
		
		int airplaneId = 9;
		String ret;
		
		airInfoDelAct.setAirplaneId(airplaneId);
		ret = airInfoDelAct.execute();
		
		assertEquals("Error redirecting the page", ret, "airlineManagerList");
		
	}
	

	/**
	 * Sets the air info del act.
	 *
	 * @param airInfoDelAct the new air info del act
	 */
	public void setAirInfoDelAct(final AirlineInformationDeleteAction airInfoDelAct) {
		this.airInfoDelAct = airInfoDelAct;
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
