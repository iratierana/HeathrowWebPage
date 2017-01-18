package actions.passengerMenu;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOPassanger;
import domain.model.Passanger;


/**
 * The Class MyProfileSaveChagesAction.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 *
 * Class where are made all the processes and loads
 *  for finishing the update of the passenger.
 */
public class MyProfileSaveChagesAction {

	/** The name. */
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

	/**
	 * This function update the passenger in
	 * the database and redirect to the menu page.
	 *
	 * @return the page where we want to go
	 */
	public String execute() {
		DAOPassanger.updatePassanger(createPassangerObject());
		return "passanger";
	}

	/**
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
	public void setSecondName(final String secondName) {
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
	public void setDniPassport(final String dniPassport) {
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
	public void setBirthDate(final Date birthDate) {
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
	public void setHomeTlf(final String homeTlf) {
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
	public void setMovileTlf(final String movileTlf) {
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
	public void setEmail(final String email) {
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
	public void setUsername(final String username) {
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
	public void setPassword(final String password) {
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
	public void setRepPassword(final String repPassword) {
		this.repPassword = repPassword;
	}


}
