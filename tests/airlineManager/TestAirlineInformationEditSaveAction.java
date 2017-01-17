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

// TODO: Auto-generated Javadoc
/**
 * The Class TestAirlineInformationEditSaveAction.
 */
public class TestAirlineInformationEditSaveAction {
	
	/** The action context. */
	private ActionContext actionContext;
	
	/** The air info edit save act. */
	private AirlineInformationEditSaveAction airInfoEditSaveAct;
	
	/** The context map. */
	private Map<String, Object> contextMap;

	/**
	 * Prepare test.
	 */
	@Before
	public void prepareTest() {
		
		AirlineManager aM = DAOAirlineManager.loadAirLineManager("arizz", "123");
		contextMap = new HashMap<String, Object>();
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(contextMap);
		
		contextMap.put("loggedAirlineManager", aM);		
		ActionContext.setContext(actionContext);
		
		airInfoEditSaveAct = Mockito.mock(AirlineInformationEditSaveAction.class);
		airInfoEditSaveAct = Mockito.spy(new AirlineInformationEditSaveAction());		
	}
	
	/**
	 * Destroy test.
	 */
	@After
	public void destroyTest() {
		this.setActionContext(null);
		this.setAirInfoEditSaveAct(null);
		this.setContextMap(null);
		
	}
	
	/**
	 * Check if the redirection of the page and the creation of the airplane.
	 */
	@Test
	public void checkIfTheRedirectionOfThePageAndTheCreationOfTheAirplane() {
		String ret;
		
		ret = airInfoEditSaveAct.execute();
		
		assertEquals("Error redirecting the page with filled atributes", ret, "airplanesList");
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
	 * Sets the air info edit save act.
	 *
	 * @param airInfoEditSaveAct the new air info edit save act
	 */
	public void setAirInfoEditSaveAct(final AirlineInformationEditSaveAction airInfoEditSaveAct) {
		this.airInfoEditSaveAct = airInfoEditSaveAct;
	}

	/**
	 * Sets the context map.
	 *
	 * @param contextMap the context map
	 */
	public void setContextMap(final Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}
	
	
}
