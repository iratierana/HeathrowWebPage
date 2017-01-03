package databaseListener;

public class PositioningModel {
	
	int planeId;
	double latitude;
	double longitude;
	
	public PositioningModel(int planeId, double latitude, double longitude) {
		this.planeId = planeId;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	public int getPlaneId() {
		return planeId;
	}
	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	
}
