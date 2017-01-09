package databaseListener;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.dao.DAOAirplane;
import domain.model.Airplane;
import domain.model.PlanePosition;

public class TestPositionFileUpdater {
	
	PositionFileUpdater positionFileUpdater;
	
	@Test
	public void testToCheckIfThePositionIsChengedInTheDatabaseAfterReadingFromFile(){
		Airplane a;
		PlanePosition pp;
		positionFileUpdater = new PositionFileUpdater();
		
		PositionFileUpdater.updatePlanePositionFromFile(335, 1);
		PositionFileUpdater.updatePlanePositionFromFile(335, 20);
		PositionFileUpdater.updatePlanePositionFromFile(335, 41);

	}

}
