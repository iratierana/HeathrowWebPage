package actions.passengerMenu;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.model.Passanger;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads for charge the profile page.
 *  
 */
public class MyProfileAction {
	
	//User data
	private Integer id;
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
	 * This function load all the data of the 
	 * user logger in session and save it in.
	 * the private parameters to auto complete the jsp file
	 * 
	 * @return the page where we want to go
	 */
	public String execute(){
		loadLoggedPassangerAtributes();
		return "myProfileAction";
	}
	
	@SuppressWarnings("rawtypes")
	/**
	 * This function charge the session passenger in local parameters
	 */
	private void loadLoggedPassangerAtributes(){
		Map session = ActionContext.getContext().getSession();	
		
		Passanger p = (Passanger) session.get("loggedPassanger");
		
		this.setId(p.getPassangerId());
		this.setName(p.getFirstName());
		this.setFirstName(p.getLastName1());
		this.setSecondName(p.getLastName2());
		this.setDniPassport(p.getDni_passport());
		this.setBirthDate(p.getBirthDate());
		this.setHomeTlf(p.getHomeTlf());
		this.setMovileTlf(p.getMovileTlf());
		this.setEmail(p.getEmail());
		this.setUsername(p.getUsername());
		this.setPassword(p.getPassword());
		
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
