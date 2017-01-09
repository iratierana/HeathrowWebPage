package databaseListener;


import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestPositionFileUpdater.
 */
public class TestPositionFileUpdater {

	/**
	 * Test to check if the position is changed
	 *  in the database after reading from file.
	 */
	@Test
	public void testToCheckIfThePositionIsChengedInTheDatabaseAfterReadingFromFile() {
		
		PositionFileUpdater.updatePlanePositionFromFile(335, 1);
		PositionFileUpdater.updatePlanePositionFromFile(335, 20);
		PositionFileUpdater.updatePlanePositionFromFile(335, 41);

	}

}
