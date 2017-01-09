package databaseListener;

// TODO: Auto-generated Javadoc
/**
 * The Class PositioningModel.
 */
public class PositioningModel {
	
	/** The plane id. */
	private int planeId;
	
	/** The latitude. */
	private double latitude;
	
	/** The longitude. */
	private double longitude;
	
	/**
	 * Instantiates a new positioning model.
	 *
	 * @param planeId the plane id
	 * @param latitude the latitude
	 * @param longitude the longitude
	 */
	public PositioningModel(final int planeId, final double latitude, final double longitude) {
		this.planeId = planeId;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	/**
	 * Gets the plane id.
	 *
	 * @return the plane id
	 */
	public int getPlaneId() {
		return planeId;
	}
	
	/**
	 * Sets the plane id.
	 *
	 * @param planeId the new plane id
	 */
	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}
	
	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	
	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	
	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	
}
