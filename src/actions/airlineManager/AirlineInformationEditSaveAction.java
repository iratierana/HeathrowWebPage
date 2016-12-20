package actions.airlineManager;

import domain.dao.DAOAirplane;
import domain.model.Airplane;

public class AirlineInformationEditSaveAction {
	
	private Integer airplaneId ;
	private String airplaneName;
	private String serialNumber;
	
	private Airplane airplane = new Airplane();
	
	public String execute(){
		DAOAirplane.updateAirplane(createAirplane());
		//lista kargau
		return "airplanesList";
	}

	private Airplane createAirplane() {
		Airplane airplane = new Airplane();
		airplane.setAirplaneId(this.airplaneId);
		airplane.setName(this.airplaneName);
		airplane.setSerialNumb(this.serialNumber);
		
		return airplane;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Integer getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(Integer airplaneId) {
		this.airplaneId = airplaneId;
	}

	public String getAirplaneName() {
		return airplaneName;
	}

	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	

}