package actions.airportController;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import domain.dao.DAOAirplane;
import domain.dao.DAOAirplanePhoto;
import domain.dao.DAOFlight;
import domain.model.Airplane;
import domain.model.AirplanePhoto;
import domain.model.Flight;

/**
 * The Class AirportControllerAction.
 */
public class AirportControllerAction {

	/** The airplane. */
	private Airplane airplane = new Airplane();

	/** The airplane. */
	private Flight flight = new Flight();

	/** The airplane id. */
	private Integer airplaneId;

	/** The airplane name. */
	private String airplaneName;

	/** The serial number. */
	private String serialNumber;

	/** The route. */
	private String route;

	/** The arrival gate. */
	private Integer arrivalGate;

	/** The arrival terminal. */
	private Integer arrivalTerminal;

	/** The photo. */
	private AirplanePhoto photo;

	/** The p. */
	private byte[] p;

	/** The p string. */
	private String pString;

	/**
	 * Execute.
	 *
	 * @return the string
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	public String execute() throws UnsupportedEncodingException {
		HttpServletRequest request = ServletActionContext.getRequest();
		String id =  request.getParameter("airplaneId");
		String idFlight = request.getParameter("flightId");

		airplane = DAOAirplane.loadAirplane(Integer.parseInt(id));

		flight = DAOFlight.loadFlight(Integer.parseInt(id), Integer.parseInt(idFlight));

		//loadPhotoFromDatabase(Integer.parseInt(id));
		fillAtributesAirplane();

		flight = DAOFlight.loadFlight(Integer.parseInt(id), Integer.parseInt(idFlight));

		fillAtributesFlight();

		return "airportController";
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
	 * Fill atributes airplane.
	 */
	private void fillAtributesAirplane() {
		setAirplaneName(this.airplane.getName());
		setSerialNumber(this.airplane.getSerialNumb());
		setRoute("***UNDEFINED***");
	}

	/**
	 * Fill atributes flight.
	 */
	private void fillAtributesFlight() {
		setArrivalGate(this.flight.getArrivalGate());
		setArrivalTerminal(this.flight.getArrivalTerminal());
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
	 * Gets the flight.
	 *
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}

	/**
	 * Sets the flight.
	 *
	 * @param flight the new flight
	 */
	public void setFlight(final Flight flight) {
		this.flight = flight;
	}

	/**
	 * Gets the arrival gate.
	 *
	 * @return the arrival gate
	 */
	public Integer getArrivalGate() {
		return arrivalGate;
	}

	/**
	 * Sets the arrival gate.
	 *
	 * @param arrivalGate the new arrival gate
	 */
	public void setArrivalGate(final Integer arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	/**
	 * Gets the arrival terminal.
	 *
	 * @return the arrival terminal
	 */
	public Integer getArrivalTerminal() {
		return arrivalTerminal;
	}

	/**
	 * Sets the arrival terminal.
	 *
	 * @param arrivalTerminal the new arrival terminal
	 */
	public void setArrivalTerminal(final Integer arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

}
