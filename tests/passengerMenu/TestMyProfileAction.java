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

import actions.passengerMenu.MyProfileAction;
import domain.dao.DAOPassanger;
import domain.model.Passanger;


/**
 * The Class TestMyProfileAction.
 */
public class TestMyProfileAction {

	/** The action context. */
	private ActionContext actionContext;

	/** The context map. */
	private Map<String, Object> contextMap;

	/** The my profile act. */
	private MyProfileAction myProfileAct;

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

		myProfileAct = Mockito.mock(MyProfileAction.class);
		myProfileAct = Mockito.spy(new MyProfileAction());
	}

	/**
	 * Destroy test.
	 */
	@After
	public void destroyTest() {
		this.setActionContext(null);
		this.setContextMap(null);
		this.setMyProfileAct(null);
	}

	/**
	 * Test if the atribute is filled.
	 */
	@Test
	public void testIfTheAtributeIsFilled() {
		myProfileAct.execute();
		assertNotNull("Atribute not filled", myProfileAct.getId());
		assertNotNull("Atribute not filled", myProfileAct.getName());
		assertNotNull("Atribute not filled", myProfileAct.getFirstName());
		assertNotNull("Atribute not filled", myProfileAct.getSecondName());
		assertNotNull("Atribute not filled", myProfileAct.getBirthDate());
		assertNotNull("Atribute not filled", myProfileAct.getDniPassport());
		assertNotNull("Atribute not filled", myProfileAct.getHomeTlf());
		assertNotNull("Atribute not filled", myProfileAct.getMovileTlf());
		assertNotNull("Atribute not filled", myProfileAct.getEmail());
		assertNotNull("Atribute not filled", myProfileAct.getUsername());
		assertNotNull("Atribute not filled", myProfileAct.getPassword());
	}

	/**
	 * Redirection is ok.
	 */
	@Test
	public void redirectionIsOk() {
		String ret;
		ret = myProfileAct.execute();
		assertEquals("The redirection was NOT OK", ret, "myProfileAction");
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
	 * Sets the my profile act.
	 *
	 * @param myProfileAct the new my profile act
	 */
	public void setMyProfileAct(final MyProfileAction myProfileAct) {
		this.myProfileAct = myProfileAct;
	}
}
