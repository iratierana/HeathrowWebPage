package actions.passengerMenu;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOPassanger;
import domain.model.Flight;
import domain.model.Passanger;

public class MyFlightsAction {
	
	private List<Flight> myFlightList = null;
	@SuppressWarnings("rawtypes")
	Map session = ActionContext.getContext().getSession();	
	
	public String execute(){
		Passanger p = (Passanger) session.get("loggedPassanger");
		myFlightList = DAOPassanger.loadPassangerFlights(p.getPassangerId());
		return "myFlights";
	}

	public List<Flight> getMyFlightList() {
		return myFlightList;
	}

	public void setMyFlightList(List<Flight> myFlightList) {
		this.myFlightList = myFlightList;
	}
	

	
	
}
