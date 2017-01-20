package actions.airlineManager;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import domain.dao.DAOAirplane;
import domain.dao.DAOAirplanePhoto;
import domain.model.Airplane;
import domain.model.AirplanePhoto;

/**
 * The Class AirlineInformationEditAction.
 */
public class AirlineInformationEditAction {

	/** The airplane id. */
	private Integer airplaneId;

	/** The airplane. */
	private Airplane airplane = new Airplane();

	/** The name. */
	private String name;

	/** The serial number. */
	private String serialNumber;

	/** The route. */
	private String route;

	/** The number of flights. */
	private String numberOfFlights;

	/** The number of ours. */
	private String numberOfOurs;

	/** The photo. */
	private AirplanePhoto photo;

	/** The p. */
	private byte[] p;

	/** The p string. */
	private String pString;

	/**
	 *	Execute.
	 *
	 * @return Airline Edit
	 * @throws UnsupportedEncodingException
	 */
	public String execute() throws UnsupportedEncodingException {
		loadPhotoFromDatabase(airplaneId);
		airplane = DAOAirplane.loadAirplane(airplaneId);
		fillAtributes();
		return "airlineEdit";
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
	private void loadPhotoFromDatabase(final int airplaneId) throws UnsupportedEncodingException {
		photo = DAOAirplanePhoto.loadAirplanePhoto(airplaneId);
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
		return name;
	}

	/**
	 * Sets the airplane name.
	 *
	 * @param airplaneName the new airplane name
	 */
	public void setAirplaneName(final String airplaneName) {
		this.name = airplaneName;
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
	public void setNumberOfOurs(final  String numberOfOurs) {
		this.numberOfOurs = numberOfOurs;
	}


}
