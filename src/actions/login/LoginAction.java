package actions.login;

import java.util.List; 
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import databaseListener.MyNotifyListener;
import domain.dao.DAOAirlineManager;
import domain.dao.DAOAirplane;
import domain.dao.DAOAirportController;
import domain.dao.DAOPassanger;
import domain.model.AirlineManager;
import domain.model.Airplane;
import domain.model.AirportController;
import domain.model.Passanger;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginAction.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads of the login process.
 */
public class LoginAction {
	
	/** The username. */
	//Login paginatik jasotako username eta passaword 
	private String username;
	
	/** The password. */
	private String password;
	
	/** The logged passanger. */
	private Passanger loggedPassanger = null;
	
	/** The logged airport controller. */
	private AirportController loggedAirportController = null;
	
	/** The logged airline manager. */
	private AirlineManager loggedAirlineManager = null;
	
	/** The airplane list. */
	private List<Airplane> airplaneList = null;
	
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
			
		} else if(loggedAirportController != null) {
			session.put("loggedPassanger", null);
			session.put("loggedAirportController", this.loggedAirportController);
			session.put("loggedAirlineManager", null);
			//Thear bat sortu eta listenerra aktibau airplane tablan
			MyNotifyListener listener = new MyNotifyListener();
			listener.start();
			return "airportController";
			
		} else if (loggedAirlineManager != null) {
			session.put("loggedPassanger", null);
			session.put("loggedAirportController", null);
			session.put("loggedAirlineManager", this.loggedAirlineManager);
						
			airplaneList = DAOAirplane.loadAirplanesOfAirline(loggedAirlineManager.getAirlineManagerId());
			return "airlineManager"; 
		} else {
			return "error";
		}
	}
	
	
	/**
	 * This function clears the user that was previously loaded in the session.
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
	 * This function redirects the flow to the 
	 * register page, when the register button in clicked.
	 * 
	 * @return the name of the page we want to go
	 */
	public String register() {
		return "register";
	}	
	
	
	
	/**
	 * Gets the airplane list.
	 *
	 * @return the airplane list
	 */
	public List<Airplane> getAirplaneList() {
		return airplaneList;
	}


	/**
	 * Sets the airplane list.
	 *
	 * @param airplaneList the new airplane list
	 */
	public void setAirplaneList(final List<Airplane> airplaneList) {
		this.airplaneList = airplaneList;
	}


	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}