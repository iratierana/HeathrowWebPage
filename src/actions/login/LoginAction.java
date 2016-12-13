package actions.login;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOAirlineManager;
import domain.dao.DAOAirportController;
import domain.dao.DAOPassanger;
import domain.model.AirlineManager;
import domain.model.AirportController;
import domain.model.Passanger;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Era�a
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads of the login process.
 *  
 */
public class LoginAction{
	
	//Login paginatik jasotako username eta passaword 
	private String username;
	private String password;
	
	private Passanger loggedPassanger=null;
	private AirportController loggedAirportController=null;
	private AirlineManager loggedAirlineManager=null;
	
	/**
	 * 
	 * This function verifies the type of the user that has been logged and 
	 * depending on that it redirect to a different pages.
	 * The logged user is loaded to the session
	 * 
	 * @return The name of the page depending on the type of user logged in
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String execute() { 
		Map session = ActionContext.getContext().getSession();	
		
		loggedPassanger = DAOPassanger.loadPassanger(this.username, this.password);
		loggedAirportController = DAOAirportController.loadAirportController(this.username, this.password);
		loggedAirlineManager = DAOAirlineManager.loadAirLineManager(this.username, this.password);
		
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
	
	
	/**
	 * This function clears the user that was previously loaded in the session
	 */
	@SuppressWarnings("rawtypes")
	private void clearAllLoggedUsers() {
		Map session = ActionContext.getContext().getSession();
		session.remove("loggedPassanger");
		session.remove("loggedAirportController");
		session.remove("loggedAirlineManager");
	}


	/**
	 * 
	 * This function redirects the flow to the register page, when the register button in clicked.
	 * 
	 * @return the name of the page we want to go
	 */
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