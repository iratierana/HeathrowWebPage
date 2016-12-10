package actions.login;

import domain.dao.DAOAirlineManager;
import domain.dao.DAOAirportController;
import domain.dao.DAOPassanger;
import domain.model.AirlineManager;
import domain.model.AirportController;
import domain.model.Passanger;

public class LoginAction{
	
	//Login paginatik jasotako username eta passaword 
	private String username;
	private String password;
	
	private Passanger loggedPassanger=null;
	private AirportController loggedAirportController=null;
	private AirlineManager loggedAirlineManager=null;

	public String execute() { 
		
		loggedPassanger = DAOPassanger.loadPassanger(this.username, this.password);
		loggedAirportController = DAOAirportController.loadAirportController(this.username, this.password);
		loggedAirlineManager = DAOAirlineManager.loadAirportController(this.username, this.password);
		
		if (loggedPassanger != null) {			
//			DAOPassanger.loadPassangerFlights(loggedPassanger.getPassangerId());			
			return "passenger";
			
		} else if(loggedAirportController != null){
			return "airportController";
			
		}else if(loggedAirlineManager != null){
			return "airlineManager"; //TODO airlineManager.jsp faltada itxia
			
		}else{
			return "error";
		}
	}
	
	
	
	public String register(){
		return "register";
	}	
	
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}