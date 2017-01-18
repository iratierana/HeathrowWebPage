package switTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import airlineManager.TestAirlineInformationActionController;
import airlineManager.TestAirlineInformationDeleteAction;
import airlineManager.TestAirlineInformationEditAction;
import airlineManager.TestAirlineInformationEditSaveAction;
import configurations.TestConnectHibernate;
import hibernateDAOtests.TestDAOAirlineManager;
import hibernateDAOtests.TestDAOAirplane;
import hibernateDAOtests.TestDAOAirportController;
import hibernateDAOtests.TestDAOPassanger;
import login.TestLoginActionController;
import passengerMenu.TestAllFlightsAction;
import passengerMenu.TestBookAFlightAction;
import passengerMenu.TestBookAFlightFinishAction;
import passengerMenu.TestMyFightsAction;
import passengerMenu.TestMyProfileAction;
import passengerMenu.TestMyProfileSaveChangesAction;
import register.TestRegisterAction;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestAirlineInformationActionController.class,
	TestAirlineInformationDeleteAction.class,
	TestAirlineInformationEditAction.class,
	TestAirlineInformationEditSaveAction.class,
	TestConnectHibernate.class,
	TestDAOAirlineManager.class,
	TestDAOAirplane.class,
	TestDAOAirportController.class,
	TestDAOPassanger.class,
	TestLoginActionController.class,
	TestAllFlightsAction.class,
	TestBookAFlightAction.class,
	TestBookAFlightFinishAction.class,
	TestMyFightsAction.class,
	TestMyProfileAction.class,
	TestMyProfileSaveChangesAction.class,
	TestRegisterAction.class,
	
	
})
public class JUnitSwitTest {
	/*Hemen hasieraketa generalak in ahal dia, adibidez serbitzarixa martxan ipini test bakoitzian ez ipintzeko martxan.
	Baiña guk test bakoitzan hasieran biharrezkua bada bertan hasieratzen dou, orduan hau utzik jungozan*/
}
