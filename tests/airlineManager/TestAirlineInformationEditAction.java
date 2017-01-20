package airlineManager;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import actions.airlineManager.AirlineInformationEditAction;


/**
 * The Class TestAirlineInformationEditAction.
 */
public class TestAirlineInformationEditAction {

	/** The Constant AIRPLANEID9. */
	private static final int AIRPLANEID9 = 9;
	/** The air info edit acti. */
	private AirlineInformationEditAction airInfoEditActi;

	/**
	 * Prepare test.
	 */
	@Before
	public void prepareTest() {
		airInfoEditActi = Mockito.mock(AirlineInformationEditAction.class);
		airInfoEditActi = Mockito.spy(new AirlineInformationEditAction());
	}

	/**
	 * Destroy test.
	 */
	@After
	public void destroyTest() {
		this.setAirInfoEditActi(null);
	}

	/**
	 * Check if the function execute and subfunctions are ok.
	 *
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	@Test
	public void checkIfTheFunctionExecuteAndSubfunctionsAreOk() throws UnsupportedEncodingException {

		int airplaneId = AIRPLANEID9;
		String ret;

		airInfoEditActi.setAirplaneId(airplaneId);
		ret = airInfoEditActi.execute();

		assertEquals("The atribute was not filled in a correct way, test failled", "airlineEdit", ret);
	}

	/**
	 * Sets the air info edit acti.
	 *
	 * @param airInfoEditActi the new air info edit acti
	 */
	public void setAirInfoEditActi(final AirlineInformationEditAction airInfoEditActi) {
		this.airInfoEditActi = airInfoEditActi;
	}

}
