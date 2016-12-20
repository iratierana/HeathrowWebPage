package actions.airlineManager;

import domain.dao.DAOAirplane;
import domain.model.Airplane;

public class AirlineInformationEditAction {
	
	private Integer airplaneId ;
	private Airplane airplane = new Airplane();
	
	private String name;
	private String serialNumber;
	private String route;
	private String numberOfFlights;
	private String numberOfOurs;
	
	public String execute(){
		airplane = DAOAirplane.loadAirplane(airplaneId);
		fillAtributes();
		return "airlineEdit";
	}

	private void fillAtributes(){
		setAirplaneName(this.airplane.getName());
		setSerialNumber(this.airplane.getSerialNumb());
		setRoute("***UNDEFINED***");
		setNumberOfFlights(String.valueOf(this.airplane.getNumberOfFlights()));
		setNumberOfOurs(String.valueOf(this.airplane.getHoursOfFlight()));
	}

	public Integer getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(Integer airplaneId) {
		this.airplaneId = airplaneId;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public String getAirplaneName() {
		return name;
	}

	public void setAirplaneName(String airplaneName) {
		this.name = airplaneName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getNumberOfFlights() {
		return numberOfFlights;
	}

	public void setNumberOfFlights(String numberOfFlights) {
		this.numberOfFlights = numberOfFlights;
	}

	public String getNumberOfOurs() {
		return numberOfOurs;
	}

	public void setNumberOfOurs(String numberOfOurs) {
		this.numberOfOurs = numberOfOurs;
	}
	
	

}
