package actions.login;

import domain.dao.DAOAirlineManager;
import domain.dao.DAOAirportController;
import domain.dao.DAOPassanger;

public class LoginAction{
	
	//Logeatzeko
	private String username;
	private String password;


	public String execute() { 
		
		if (DAOPassanger.loadPassanger(this.username, this.password)!=null) {	
			return "passenger";
		} else if(DAOAirportController.loadAirportController(this.username, this.password)!=null){
			return "airportController";
		}else if(DAOAirlineManager.loadAirportController(this.username, this.password)!=null){
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