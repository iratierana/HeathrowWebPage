package actions.airportController;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

import org.apache.struts2.ServletActionContext;

import domain.dao.DAOAirplane;
import domain.dao.DAOAirplanePhoto;
import domain.dao.DAOFlight;
import domain.model.Airplane;
import domain.model.AirplanePhoto;
import domain.model.Flight;

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
	private void loadPhotoFromDatabase(int airplaneId) throws UnsupportedEncodingException {
		photo = DAOAirplanePhoto.loadAirplanePhoto(airplaneId); //TODO: Replaced 21 with airplaneId
		p = Base64.getEncoder().encode(photo.getPhoto());
		pString = new String(p, "UTF-8");
		pString = "data:image/jpg;base64," + pString;
		System.out.println(pString);
	}

	private void fillAtributesAirplane() {
		setAirplaneName(this.airplane.getName());
		setSerialNumber(this.airplane.getSerialNumb());
		setRoute("***UNDEFINED***");
	}
	
	private void fillAtributesFlight(){
		setArrivalGate(this.flight.getArrivalGate());
		setArrivalTerminal(this.flight.getArrivalTerminal());
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

	public Integer getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(Integer airplaneId) {
		this.airplaneId = airplaneId;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Integer getArrivalGate() {
		return arrivalGate;
	}

	public void setArrivalGate(Integer arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	public Integer getArrivalTerminal() {
		return arrivalTerminal;
	}

	public void setArrivalTerminal(Integer arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

}
