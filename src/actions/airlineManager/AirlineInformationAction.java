package actions.airlineManager;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import domain.dao.DAOAirplane;
import domain.dao.DAOAirplanePhoto;
import domain.model.Airplane;
import domain.model.AirplanePhoto;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the process and loads of Airline Information.
 *  
 */
public class AirlineInformationAction {
	
	private Integer airplaneId;
	private Airplane airplane = new Airplane();
	private AirplanePhoto photo;
	private byte[] p;
	private String pString;
	private String airplaneName;
	private String serialNumber;
	private String route;
	private String numberOfFlights;
	private String numberOfOurs;

	/**
	 * 
	 * This function redirect the content flow to another page.
	 * 
	 * @return airlineInfo the page(jsp) where we want to redirect
	 * @throws UnsupportedEncodingException 
	 */
	public String execute() throws UnsupportedEncodingException {
		airplane = DAOAirplane.loadAirplane(airplaneId);
		loadPhotoFromDatabase(airplaneId);
		fillAtributes();
		return "airlineInfo";
	}

	private void fillAtributes() {
		setAirplaneName(this.airplane.getName());
		setSerialNumber(this.airplane.getSerialNumb());
		setRoute("***UNDEFINED***");
		setNumberOfFlights(String.valueOf(this.airplane.getNumberOfFlights()));
		setNumberOfOurs(String.valueOf(this.airplane.getHoursOfFlight()));
	}
	
	private void loadPhotoFromDatabase(int airplaneId) throws UnsupportedEncodingException {
		photo = DAOAirplanePhoto.loadAirplanePhoto(airplaneId); //TODO: Replaced 21 with airplaneId
		p = Base64.getEncoder().encode(photo.getPhoto());
		pString = new String(p, "UTF-8");
		pString = "data:image/jpg;base64," + pString;
		System.out.println(pString);
	}


	public Integer getAirplaneId() {
		return airplaneId;
	}



	public void setAirplaneId(final Integer airplaneId) {
		this.airplaneId = airplaneId;
	}


	public String getpString() {
		return pString;
	}

	public void setpString(final String pString) {
		this.pString = pString;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(final Airplane airplane) {
		this.airplane = airplane;
	}



	public String getAirplaneName() {
		return airplaneName;
	}



	public void setAirplaneName(final String airplaneName) {
		this.airplaneName = airplaneName;
	}



	public String getSerialNumber() {
		return serialNumber;
	}



	public void setSerialNumber(final String serialNumber) {
		this.serialNumber = serialNumber;
	}



	public String getRoute() {
		return route;
	}



	public void setRoute(final String route) {
		this.route = route;
	}



	public String getNumberOfFlights() {
		return numberOfFlights;
	}



	public void setNumberOfFlights(final String numberOfFlights) {
		this.numberOfFlights = numberOfFlights;
	}



	public String getNumberOfOurs() {
		return numberOfOurs;
	}



	public void setNumberOfOurs(final String numberOfOurs) {
		this.numberOfOurs = numberOfOurs;
	}

}
