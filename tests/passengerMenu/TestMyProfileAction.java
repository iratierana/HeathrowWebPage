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

public class TestMyProfileAction {

	ActionContext actionContext;
	Map<String, Object> contextMap;
	MyProfileAction myProfileAct;
	
	@Before
	public void prepareTest(){
		Passanger p = DAOPassanger.loadPassanger("123", "ane95");
		contextMap = new HashMap<String, Object>();
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(contextMap);
		
		contextMap.put("loggedPassanger", p);
		
		
		ActionContext.setContext(actionContext);
		
		myProfileAct = Mockito.mock(MyProfileAction.class);
		myProfileAct = Mockito.spy(new MyProfileAction());
	}
	
	@After
	public void destroyTest(){
		this.setActionContext(null);
		this.setContextMap(null);
		this.setMyProfileAct(null);
	}
	
	@Test
	public void testIfTheAtributeIsFilled(){
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
	
	@Test
	public void redirectionIsOk(){
		String ret;
		ret = myProfileAct.execute();
		assertEquals("The redirection was NOT OK", ret, "myProfileAction");		
	}
	
	

	public void setActionContext(ActionContext actionContext) {
		this.actionContext = actionContext;
	}

	public void setContextMap(Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}

	public void setMyProfileAct(MyProfileAction myProfileAct) {
		this.myProfileAct = myProfileAct;
	}
	
	
	
}
