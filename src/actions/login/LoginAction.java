package actions.login;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String execute() { 
		Map session = ActionContext.getContext().getSession();	
		
		loggedPassanger = DAOPassanger.loadPassanger(this.username, this.password);
		loggedAirportController = DAOAirportController.loadAirportController(this.username, this.password);
		loggedAirlineManager = DAOAirlineManager.loadAirportController(this.username, this.password);
		
		clearAllLoggedUsers();
		
		if (loggedPassanger != null) {	
			 session.put("loggedPassanger", this.loggedPassanger);
			 session.put("loggedAirportController", null);
			 session.put("loggedAirlineManager", null);
			 return "passenger";
			
		} else if(loggedAirportController != null){
			session.put("loggedPassanger", null);
			session.put("loggedAirportController", this.loggedAirportController);
			session.put("loggedAirlineManager", null);
			return "airportController";
			
		}else if(loggedAirlineManager != null){
			session.put("loggedPassanger", null);
			session.put("loggedAirportController", null);
			session.put("loggedAirlineManager", this.loggedAirlineManager);
			return "airlineManager"; //TODO airlineManager.jsp faltada itxia
		}else{
			return "error";
		}
	}
	
	
	
	@SuppressWarnings("rawtypes")
	private void clearAllLoggedUsers() {
		Map session = ActionContext.getContext().getSession();
		session.remove("loggedPassanger");
		session.remove("loggedAirportController");
		session.remove("loggedAirlineManager");
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