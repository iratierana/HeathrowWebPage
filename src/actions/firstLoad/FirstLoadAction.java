package actions.firstLoad;

import java.util.List;

import domain.dao.DAOFlight;
import domain.model.Flight;

public class FirstLoadAction {

	List<Flight> flightList;
	
	public String execute(){
		System.out.println("Loading first login page...");
		flightList = DAOFlight.loadAllFlights();
		return "goToLogin";
	}

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}
	
	
	
}
