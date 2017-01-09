package airlineManager;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import actions.airlineManager.AirlineInformationEditAction;

public class TestAirlineInformationEditAction {
	
	AirlineInformationEditAction airInfoEditActi;
	
	@Before
	public void prepareTest(){
		airInfoEditActi = Mockito.mock(AirlineInformationEditAction.class);
		airInfoEditActi = Mockito.spy(new AirlineInformationEditAction());
	}
	
	@After
	public void destroyTest(){
		this.setAirInfoEditActi(null);
	}

	@Test
	public void checkIfTheFunctionExecuteAndSubfunctionsAreOk(){
		
		int airplaneId = 1;
		String ret;
		
		airInfoEditActi.setAirplaneId(airplaneId);
		ret = airInfoEditActi.execute();
		
		assertEquals("The atribute was not filled in a correct way, test failled", "airlineEdit", ret);
	}

	public void setAirInfoEditActi(AirlineInformationEditAction airInfoEditActi) {
		this.airInfoEditActi = airInfoEditActi;
	}
	
	
}
