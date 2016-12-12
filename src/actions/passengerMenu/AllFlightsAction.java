package actions.passengerMenu;

import java.util.List;

import domain.dao.DAOFlight;
import domain.model.Flight;

public class AllFlightsAction {
	
	List<Flight> flightList = null;

	public String execute(){
		flightList = DAOFlight.loadAllFlights();
		return "allFlights";
	}
	
	

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}
	
	
}
