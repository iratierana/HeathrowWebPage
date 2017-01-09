package passengerMenu;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import actions.passengerMenu.BookAFlightFinishAction;
import actions.passengerMenu.MyProfileSaveChagesAction;
import domain.dao.DAOPassanger;
import domain.model.Passanger;

public class TestMyProfileSaveChangesAction {

	ActionContext actionContext;
	Map<String, Object> contextMap;
	MyProfileSaveChagesAction myProfileSaveChangeAct;
	
	@Before
	public void prepareTest(){
		Passanger p = DAOPassanger.loadPassanger("123", "ane95");
		contextMap = new HashMap<String, Object>();
		
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(contextMap);
		
		contextMap.put("loggedPassanger", p);
		
		
		ActionContext.setContext(actionContext);
		
		myProfileSaveChangeAct = Mockito.mock(MyProfileSaveChagesAction.class);
		myProfileSaveChangeAct = Mockito.spy(new MyProfileSaveChagesAction());
	}
	
	@After
	public void destroyTest(){
		this.setActionContext(null);
		this.setContextMap(null);
		this.setMyProfileAct(null);
	}
	
	@Test
	public void testIfTheAtributeIsFilled(){
		Passanger p;
		try {
			Method createPassangerObjectFunction = MyProfileSaveChagesAction.class.getDeclaredMethod("createPassangerObject", null);
			createPassangerObjectFunction.setAccessible(true);		
			p = (Passanger) createPassangerObjectFunction.invoke(myProfileSaveChangeAct, null);
			
			assertNotNull("The passenger object is null", p);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void redirectionIsOk(){
		String ret;
		ret = myProfileSaveChangeAct.execute();
		assertEquals("The redirection was NOT OK", ret, "passanger");		
	}
	
	@Test
	public void testGettersAndSetters(){
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		myProfileSaveChangeAct = new MyProfileSaveChagesAction();
		Date d = null;
		
		
		try {
			d = formatter.parse("09/01/2017");
			myProfileSaveChangeAct.setName("a");
			myProfileSaveChangeAct.setFirstName("a");
			myProfileSaveChangeAct.setSecondName("a");
			myProfileSaveChangeAct.setDniPassport("a");
			myProfileSaveChangeAct.setBirthDate(formatter.parse("09/01/2017"));
			myProfileSaveChangeAct.setHomeTlf("a");
			myProfileSaveChangeAct.setMovileTlf("a");
			myProfileSaveChangeAct.setEmail("a");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals("Name not equal", "a", myProfileSaveChangeAct.getName());
		assertEquals("First name not equal", "a", myProfileSaveChangeAct.getFirstName());
		assertEquals("Second name not equal", "a", myProfileSaveChangeAct.getSecondName());
		assertEquals("Dni not equal", "a", myProfileSaveChangeAct.getDniPassport());
		assertEquals("Birth date not equal", d, myProfileSaveChangeAct.getBirthDate());
		assertEquals("Home tlf not equal", "a", myProfileSaveChangeAct.getHomeTlf());
		assertEquals("Movile tlf not equal", "a", myProfileSaveChangeAct.getMovileTlf());
		assertEquals("Email not equal", "a", myProfileSaveChangeAct.getEmail());

	}

	public void setActionContext(ActionContext actionContext) {
		this.actionContext = actionContext;
	}

	public void setContextMap(Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}

	public void setMyProfileAct(MyProfileSaveChagesAction myProfileSaveChangeAct) {
		this.myProfileSaveChangeAct = myProfileSaveChangeAct;
	}
}
