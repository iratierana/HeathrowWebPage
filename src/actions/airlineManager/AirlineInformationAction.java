package actions.airlineManager;
 
import java.io.UnsupportedEncodingException;
import java.util.Base64;

import domain.dao.DAOAirplane;
import domain.dao.DAOAirplanePhoto;
import domain.model.Airplane;
import domain.model.AirplanePhoto;

// TODO: Auto-generated Javadoc
/**
 * The Class AirlineInformationAction.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the process and loads of Airline Information.
 */
public class AirlineInformationAction {
	
	/** The airplane id. */
	private Integer airplaneId;
	
	/** The airplane. */
	private Airplane airplane = new Airplane();
	
	/** The photo. */
	private AirplanePhoto photo;
	
	/** The p. */
	private byte[] p;
	
	/** The p string. */
	private String pString;
	
	/** The airplane name. */
	private String airplaneName;
	
	/** The serial number. */
	private String serialNumber;
	
	/** The route. */
	private String route;
	
	/** The number of flights. */
	private String numberOfFlights;
	
	/** The number of ours. */
	private String numberOfOurs;

	/**
	 * This function redirect the content flow to another page.
	 *
	 * @return airlineInfo the page(jsp) where we want to redirect
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	public String execute() throws UnsupportedEncodingException {
		airplane = DAOAirplane.loadAirplane(airplaneId);
		loadPhotoFromDatabase(airplaneId);
		fillAtributes();
		return "airlineInfo";
	}

	/**
	 * Fill atributes.
	 */
	private void fillAtributes() {
		setAirplaneName(this.airplane.getName());
		setSerialNumber(this.airplane.getSerialNumb());
		setRoute("***UNDEFINED***");
		setNumberOfFlights(String.valueOf(this.airplane.getNumberOfFlights()));
		setNumberOfOurs(String.valueOf(this.airplane.getHoursOfFlight()));
	}
	
	/**
	 * Load photo from database.
	 *
	 * @param airplaneId the airplane id
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	private void loadPhotoFromDatabase(int airplaneId) throws UnsupportedEncodingException {
		photo = DAOAirplanePhoto.loadAirplanePhoto(airplaneId); //TODO: Replaced 21 with airplaneId
		p = Base64.getEncoder().encode(photo.getPhoto());
		pString = new String(p, "UTF-8");
		pString = "data:image/jpg;base64," + pString;
		System.out.println(pString);
	}


	/**
	 * Gets the airplane id.
	 *
	 * @return the airplane id
	 */
	public Integer getAirplaneId() {
		return airplaneId;
	}



	/**
	 * Sets the airplane id.
	 *
	 * @param airplaneId the new airplane id
	 */
	public void setAirplaneId(final Integer airplaneId) {
		this.airplaneId = airplaneId;
	}


	/**
	 * Gets the p string.
	 *
	 * @return the p string
	 */
	public String getpString() {
		return pString;
	}

	/**
	 * Sets the p string.
	 *
	 * @param pString the new p string
	 */
	public void setpString(final String pString) {
		this.pString = pString;
	}

	/**
	 * Gets the airplane.
	 *
	 * @return the airplane
	 */
	public Airplane getAirplane() {
		return airplane;
	}

	/**
	 * Sets the airplane.
	 *
	 * @param airplane the new airplane
	 */
	public void setAirplane(final Airplane airplane) {
		this.airplane = airplane;
	}



	/**
	 * Gets the airplane name.
	 *
	 * @return the airplane name
	 */
	public String getAirplaneName() {
		return airplaneName;
	}



	/**
	 * Sets the airplane name.
	 *
	 * @param airplaneName the new airplane name
	 */
	public void setAirplaneName(final String airplaneName) {
		this.airplaneName = airplaneName;
	}



	/**
	 * Gets the serial number.
	 *
	 * @return the serial number
	 */
	public String getSerialNumber() {
		return serialNumber;
	}



	/**
	 * Sets the serial number.
	 *
	 * @param serialNumber the new serial number
	 */
	public void setSerialNumber(final String serialNumber) {
		this.serialNumber = serialNumber;
	}



	/**
	 * Gets the route.
	 *
	 * @return the route
	 */
	public String getRoute() {
		return route;
	}



	/**
	 * Sets the route.
	 *
	 * @param route the new route
	 */
	public void setRoute(final String route) {
		this.route = route;
	}



	/**
	 * Gets the number of flights.
	 *
	 * @return the number of flights
	 */
	public String getNumberOfFlights() {
		return numberOfFlights;
	}



	/**
	 * Sets the number of flights.
	 *
	 * @param numberOfFlights the new number of flights
	 */
	public void setNumberOfFlights(final String numberOfFlights) {
		this.numberOfFlights = numberOfFlights;
	}



	/**
	 * Gets the number of ours.
	 *
	 * @return the number of ours
	 */
	public String getNumberOfOurs() {
		return numberOfOurs;
	}



	/**
	 * Sets the number of ours.
	 *
	 * @param numberOfOurs the new number of ours
	 */
	public void setNumberOfOurs(final String numberOfOurs) {
		this.numberOfOurs = numberOfOurs;
	}

}
