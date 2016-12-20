package actions.passengerMenu;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOPassanger;
import domain.model.Passanger;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and 
 * loads for finishing the update of the passenger.
 *  
 */
public class MyProfileSaveChagesAction {
	
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
	
	/**
	 * 
	 * This function update the passenger in the 
	 * database and redirect to the menu page.
	 * 
	 * @return the page where we want to go
	 */
	public String execute() {
		DAOPassanger.updatePassanger(createPassangerObject());
		return "passanger";
	}
	
	
	/**
	 * 
	 * This function get the data from the jsp and creates the passenger object.
	 * 
	 * @return passenger the passenger with the changes made in the jsp file
	 */
	@SuppressWarnings("rawtypes")
	private Passanger createPassangerObject() {
		Passanger passanger = new Passanger();
		
		Map session = ActionContext.getContext().getSession();	
		Passanger auxPass = (Passanger) session.get("loggedPassanger");
		
		passanger.setPassangerId(auxPass.getPassangerId());
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
	
	

}
