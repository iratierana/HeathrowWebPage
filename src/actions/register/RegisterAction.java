package actions.register;

import java.util.Date;

import domain.dao.DAOPassanger;
import domain.model.Direction;
import domain.model.Passanger;

// TODO: Auto-generated Javadoc
/**
 * The Class RegisterAction.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads for registering a passenger.
 */
public class RegisterAction {

	/** The name. */
	//User data
	private String name;
	
	/** The first name. */
	private String firstName;
	
	/** The second name. */
	private String secondName;
	
	/** The dni passport. */
	private String dniPassport;
	
	/** The birth date. */
	private Date birthDate;
	
	/** The home tlf. */
	private String homeTlf;
	
	/** The movile tlf. */
	private String movileTlf;
	
	/** The email. */
	private String email;
	
	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/** The rep password. */
	private String repPassword;
	
	/** The address. */
	//Direction data
	private String address;
	
	/** The city. */
	private String city;
	
	/** The cod post. */
	private String codPost;
	
	/** The state. */
	private String state;
	
	
	/**
	 * This function insert a new passenger 
	 * and direction and link both of them .
	 *
	 * @return the page where we want to go
	 */
	public String execute() {	
		if (DAOPassanger.checkEmail(email)) {
			DAOPassanger.insertPassanger(createPassangerObject());		
			return "login";
		} else {
			return "emailError"; //TODO bad email error kudeatu
		}
		
	}

	/**
	 * This function creates the passenger object with the data of the jsp.
	 *
	 * @return passenger The passenger created in the jsp
	 */
	private Passanger createPassangerObject() {
		Passanger passanger = new Passanger();
		
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
		passanger.setDirection(createDirectionObject());
		
		return passanger;
	}
	
	/**
	 * 
	 * This function creates the direction with the data in the register.jsp.
	 * 
	 * @return direction The direction with the data of the register.jsp
	 */
	private Direction createDirectionObject() {
		Direction direction = new Direction();
		
		direction.setAddress(this.address);
		direction.setCity(this.city);
		direction.setCodPost(this.codPost);
		direction.setState(this.state);
		
		return direction;
	}


	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}



	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}



	/**
	 * Gets the second name.
	 *
	 * @return the second name
	 */
	public String getSecondName() {
		return secondName;
	}



	/**
	 * Sets the second name.
	 *
	 * @param secondName the new second name
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}



	/**
	 * Gets the dni passport.
	 *
	 * @return the dni passport
	 */
	public String getDniPassport() {
		return dniPassport;
	}



	/**
	 * Sets the dni passport.
	 *
	 * @param dniPassport the new dni passport
	 */
	public void setDniPassport(String dniPassport) {
		this.dniPassport = dniPassport;
	}



	/**
	 * Gets the birth date.
	 *
	 * @return the birth date
	 */
	public Date getBirthDate() {
		return birthDate;
	}


	/**
	 * Sets the birth date.
	 *
	 * @param birthDate the new birth date
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	/**
	 * Gets the home tlf.
	 *
	 * @return the home tlf
	 */
	public String getHomeTlf() {
		return homeTlf;
	}



	/**
	 * Sets the home tlf.
	 *
	 * @param homeTlf the new home tlf
	 */
	public void setHomeTlf(String homeTlf) {
		this.homeTlf = homeTlf;
	}



	/**
	 * Gets the movile tlf.
	 *
	 * @return the movile tlf
	 */
	public String getMovileTlf() {
		return movileTlf;
	}



	/**
	 * Sets the movile tlf.
	 *
	 * @param movileTlf the new movile tlf
	 */
	public void setMovileTlf(String movileTlf) {
		this.movileTlf = movileTlf;
	}



	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
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



	/**
	 * Gets the rep password.
	 *
	 * @return the rep password
	 */
	public String getRepPassword() {
		return repPassword;
	}



	/**
	 * Sets the rep password.
	 *
	 * @param repPassword the new rep password
	 */
	public void setRepPassword(String repPassword) {
		this.repPassword = repPassword;
	}



	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}



	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}



	/**
	 * Gets the cod post.
	 *
	 * @return the cod post
	 */
	public String getCodPost() {
		return codPost;
	}



	/**
	 * Sets the cod post.
	 *
	 * @param codPost the new cod post
	 */
	public void setCodPost(String codPost) {
		this.codPost = codPost;
	}



	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}



	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
