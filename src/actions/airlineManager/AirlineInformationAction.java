package actions.airlineManager;

import domain.dao.DAOAirplane;
import domain.model.Airplane;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the process and loads of Airline Information.
 *  
 */
public class AirlineInformationAction {
	
	private Integer airplaneId ;
	private Airplane airplane = new Airplane();
	
	private String airplaneName;
	private String serialNumber;
	private String route;
	private String numberOfFlights;
	private String numberOfOurs;

	/**
	 * 
	 * This function redirect the content flow to another page
	 * 
	 * @return airlineInfo the page(jsp) where we want to redirect
	 */
	public String execute() {
		airplane = DAOAirplane.loadAirplane(airplaneId);
		fillAtributes();
		return "airlineInfo";
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
