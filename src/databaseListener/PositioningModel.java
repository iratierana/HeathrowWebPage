package databaseListener;

public class PositioningModel {
	
	int planeId;
	float latitude;
	float longitude;
	
	public PositioningModel(int planeId, float latitude, float longitude) {
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
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	
}
