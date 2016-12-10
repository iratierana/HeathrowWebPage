package actions.register;

import java.util.Date;

import domain.dao.DAODirection;
import domain.dao.DAOPassanger;
import domain.model.Direction;
import domain.model.Passanger;

public class RegisterAction {

	//User data
	private String name;
	private String firstName;
	private String secondName;
	private String dniPassport;
	private Date birthDate;
	private String homeTlf;
	private String movileTlf;
	private String email;
	private String username;
	private String password;
	private String repPassword;
	
	//Direction data
	private String address;
	private String city;
	private String codPost;
	private String state;
	
	
	
	public String execute(){	
		DAODirection.insertDirection(createDirectionObject());
		DAOPassanger.insertPassanger(createPassangerObject());		
		return "login";
	}

	
	private Passanger createPassangerObject(){
		Passanger passanger=new Passanger();
		
		passanger.setFirstName(this.name);
		passanger.setLastName1(this.firstName);
		passanger.setLastName2(this.secondName);
		passanger.setDni_passport(this.dniPassport);
		passanger.setBirthDate(this.birthDate);
		passanger.setHomeTlf(this.homeTlf);
		passanger.setMovileTlf(this.movileTlf);
		passanger.setEmail(this.email);
		passanger.setUsername(this.username);
		passanger.setPassword(this.password);
		
		return passanger;
	}
	
	private Direction createDirectionObject(){
		Direction direction = new Direction();
		
		direction.setAddress(this.address);
		direction.setCity(this.city);
		direction.setCodPost(this.codPost);
		direction.setState(this.state);
		
		return direction;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getSecondName() {
		return secondName;
	}



	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}



	public String getDniPassport() {
		return dniPassport;
	}



	public void setDniPassport(String dniPassport) {
		this.dniPassport = dniPassport;
	}



	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getHomeTlf() {
		return homeTlf;
	}



	public void setHomeTlf(String homeTlf) {
		this.homeTlf = homeTlf;
	}



	public String getMovileTlf() {
		return movileTlf;
	}



	public void setMovileTlf(String movileTlf) {
		this.movileTlf = movileTlf;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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



	public String getRepPassword() {
		return repPassword;
	}



	public void setRepPassword(String repPassword) {
		this.repPassword = repPassword;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCodPost() {
		return codPost;
	}



	public void setCodPost(String codPost) {
		this.codPost = codPost;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
