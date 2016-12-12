package actions.passengerMenu;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOPassanger;
import domain.model.Flight;
import domain.model.Passanger;

public class MyFlightsAction {
	
	private ArrayList<Flight> myFlightList = new ArrayList<Flight>();
	@SuppressWarnings("rawtypes")
	Map session = ActionContext.getContext().getSession();	
	
	public String execute(){
		Passanger p = (Passanger) session.get("loggedPassanger");
		DAOPassanger.loadPassangerFlights(p.getPassangerId());
		return "myFlights";
	}
	
	

	public ArrayList<Flight> getMyFlightList() {
		return myFlightList;
	}

	public void setMyFlightList(ArrayList<Flight> myFlightList) {
		this.myFlightList = myFlightList;
	}
	
	
	
}
