package databaseListener;


import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestPositionFileUpdater.
 */
public class TestPositionFileUpdater {

	private static final int _41 = 41;
	private static final int _20 = 20;
	private static final int _1 = 1;
	private static final int _335 = 335;

	/**
	 * Test to check if the position is changed
	 *  in the database after reading from file.
	 */
	@Test
	public void testToCheckIfThePositionIsChangedInTheDatabaseAfterReadingFromFile() {
		
		PositionFileUpdater.updatePlanePositionFromFile(_335, _1);
		PositionFileUpdater.updatePlanePositionFromFile(_335, _20);
		PositionFileUpdater.updatePlanePositionFromFile(_335, _41);

	}

}
