package actions.login;

import domain.dao.DAOPassanger;
import domain.model.Passanger;

public class LoginAction{
	
	//Logeatzeko
	private String username;
	private String password;


	public String execute() { 
		Passanger p= new Passanger();
		if (DAOPassanger.loadPassanger(this.username, this.password)!=null) {			
			System.out.println(p.getFirstName());
			return "success";
		} else if(this.username.equals("123") && this.password.equals("123")){	//TODO
			return "passenger";
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