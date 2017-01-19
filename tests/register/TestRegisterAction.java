package register;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import actions.register.RegisterAction;
import domain.model.Direction;
import domain.model.Passanger;


/**
 * The Class TestRegisterAction.
 */
public class TestRegisterAction {

	/** The register action. */
	private RegisterAction registerAction;

	/**
	 * Prepare test.
	 */
	@Before
	public void prepareTest() {
		registerAction = Mockito.mock(RegisterAction.class);
		registerAction = Mockito.spy(new RegisterAction());
	}

	/**
	 * Destroy test.
	 */
	@After
	public void destroyTest() {

	}

	/**
	 * Check if the redirection is ok.
	 */
	@Test
	public void checkIfTheRedirectionIsOk() {
		String ret;
		registerAction = new RegisterAction();
		registerAction.setEmail("xabi96@hotmail.es");
		ret = registerAction.execute();

		assertEquals("The redirection was NOT OK", ret, "login");
	}

	/**
	 * Test function create passanger object.
	 */
	@Test
	public void testFunctionCreatePassangerObject() {
		Passanger p = null;
		Method createPassangerObjectFunction;
		try {
			createPassangerObjectFunction = RegisterAction.class.getDeclaredMethod("createPassangerObject", null);
			createPassangerObjectFunction.setAccessible(true);
			p = (Passanger) createPassangerObjectFunction.invoke(registerAction, null);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		assertNotNull("Passenger is null", p);

	}

	/**
	 * Test function create direction object.
	 */
	@Test
	public void testFunctionCreateDirectionObject() {
		Direction d = null;
		Method createPassangerObjectFunction;
		try {
			createPassangerObjectFunction = RegisterAction.class.getDeclaredMethod("createDirectionObject", null);
			createPassangerObjectFunction.setAccessible(true);
			d = (Direction) createPassangerObjectFunction.invoke(registerAction, null);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		assertNotNull("Direction is null", d);
	}

}
