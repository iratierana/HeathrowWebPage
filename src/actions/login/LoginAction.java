package actions.login;

import domain.dao.DAOPassanger;
import domain.model.Passanger;

public class LoginAction{
	
	//Logeatzeko
	private String username;
	private String password;
	
	//Registerrerako
	private String firstName;
	private String lastName1;
	private String lastName2;
	private String dni_passport;
	private String birthday_date;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName1() {
		return lastName1;
	}

	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getDni_passport() {
		return dni_passport;
	}

	public void setDni_passport(String dni_passport) {
		this.dni_passport = dni_passport;
	}

	public String getBirthday_date() {
		return birthday_date;
	}

	public void setBirthday_date(String birthday_date) {
		this.birthday_date = birthday_date;
	}
	
	
}

