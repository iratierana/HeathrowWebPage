package actions.airportController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

import org.apache.struts2.ServletActionContext;

import domain.dao.DAOAirplane;
import domain.dao.DAOFlight;
import domain.model.Airplane;
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
	@NotNull
	private Integer arrivalGate;
	
	/** The arrival terminal. */
	@NotNull
	private Integer arrivalTerminal;
	
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String id =  request.getParameter("airplaneId");
		String idFlight = request.getParameter("flightId");
		System.out.println(id);
		
		airplane = DAOAirplane.loadAirplane(Integer.parseInt(id));
		
		fillAtributesAirplane();
		
		flight = DAOFlight.loadFlight(Integer.parseInt(id), Integer.parseInt(idFlight));
		
		fillAtributesFlight();
		
		return "airportController";
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
