package databaseListener;

// TODO: Auto-generated Javadoc
/**
 * The Class PositionMapper.
 */
public class PositionMapper {
	
	
	/**
	 * Decode position.
	 *
	 * @param planeId the plane id
	 * @param positionId the position id
	 * @return the positioning model
	 */
	public static PositioningModel decodePosition(final int planeId, final int positionId) {
		//TODO tabal baten sartu refactor!!
		PositioningModel posModel = null;
		
		switch (positionId) {
		case 1:			
			posModel = new PositioningModel(planeId, 51.477527, -0.485523);
			break;
		case 2:
			posModel = new PositioningModel(planeId, 51.477626, -0.457006);
			break;
		case 3:
			posModel = new PositioningModel(planeId, 51.476824, -0.433745);
			break;
		case 4:
			posModel = new PositioningModel(planeId, 51.475969, -0.443616);
			break;
		case 5:
			posModel = new PositioningModel(planeId, 51.471352, -0.443122);
			break;
		case 6:
			posModel = new PositioningModel(planeId, 51.473250, -0.444024);
			break;
		case 7:
			posModel = new PositioningModel(planeId, 51.471619, -0.444109);
			break;
		case 8:
			posModel = new PositioningModel(planeId, 51.469534, -0.443938);
			break;
		case 9:
			posModel = new PositioningModel(planeId, 51.473303, -0.442007);
			break;
		case 10:
			posModel = new PositioningModel(planeId, 51.471592, -0.442221);
			break;
		case 11:
			posModel = new PositioningModel(planeId, 51.469962, -0.442135);
			break;
		case 12:
			posModel = new PositioningModel(planeId, 51.475950, -0.464795);
			break;
		case 13:
			posModel = new PositioningModel(planeId, 51.471379, -0.463164);
			break;
		case 14:
			posModel = new PositioningModel(planeId, 51.471165, -0.466125);
			break;
		case 15:
			posModel = new PositioningModel(planeId, 51.469908, -0.464752);
			break;
		case 16:
			posModel = new PositioningModel(planeId, 51.468759, -0.463507);
			break;
		case 17:
			posModel = new PositioningModel(planeId, 51.473464, -0.462348);
			break;
		case 18:
			posModel = new PositioningModel(planeId, 51.472688, -0.461190);
			break;
		case 19:
			posModel = new PositioningModel(planeId, 51.471405, -0.460074);
			break;
		case 20:
			posModel = new PositioningModel(planeId, 51.475843, -0.476210);
			break;
		case 21:
			posModel = new PositioningModel(planeId, 51.471192, -0.476210);
			break;
		case 22:
			posModel = new PositioningModel(planeId, 51.472234, -0.477240);
			break;
		case 23:
			posModel = new PositioningModel(planeId, 51.471272, -0.477154);
			break;
		case 24:
			posModel = new PositioningModel(planeId, 51.470309, -0.477111);
			break;
		case 25:
			posModel = new PositioningModel(planeId, 51.472127, -0.475309);
			break;
		case 26:
			posModel = new PositioningModel(planeId, 51.471165, -0.475395);
			break;
		case 27:
			posModel = new PositioningModel(planeId, 51.470336, -0.475352);
			break;
		case 28:
			posModel = new PositioningModel(planeId, 51.475843, -0.481360);
			break;
		case 29:
			posModel = new PositioningModel(planeId, 51.470897, -0.481403);
			break;
		case 30:
			posModel = new PositioningModel(planeId, 51.472020, -0.482347);
			break;
		case 31:
			posModel = new PositioningModel(planeId, 51.471004, -0.482347);
			break;
		case 32:
			posModel = new PositioningModel(planeId, 51.469855, -0.482390);
			break;
		case 33:
			posModel = new PositioningModel(planeId, 51.472020, -0.480330);
			break;
		case 34:
			posModel = new PositioningModel(planeId, 51.471111, -0.480330);
			break;
		case 35:
			posModel = new PositioningModel(planeId, 51.469935, -0.480244);
			break;
		case 36:
			posModel = new PositioningModel(planeId, 51.466647, -0.442693);
			break;
		case 37:
			posModel = new PositioningModel(planeId, 51.466540, -0.462520);
			break;
		case 38:
			posModel = new PositioningModel(planeId, 51.466540, -0.475910);
			break;
		case 39:
			posModel = new PositioningModel(planeId, 51.465390, -0.487840);
			break;
		case 40:
			posModel = new PositioningModel(planeId, 51.464848, -0.459924);
			break;
		case 41:
			posModel = new PositioningModel(planeId, 51.464936, -0.433209);
			break;
		default:
			break;
		}
		
		return posModel;
	}

}
