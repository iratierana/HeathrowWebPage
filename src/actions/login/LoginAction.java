package actions.login;

import domain.dao.DAOPassanger;
import domain.model.Passanger;

public class LoginAction {

	private String username;
	private String password;

	public String execute() { 
		
		if ((this.username.equals("admin")) && (this.password.equals("admin"))) {
			Passanger p= new Passanger();
//			DAOPassanger.loadAllPassangers();
			p=DAOPassanger.loadPassanger(1);
			System.out.println(p.getFirstName());
			return "success";
		} else {		
			return "error";
		}
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

