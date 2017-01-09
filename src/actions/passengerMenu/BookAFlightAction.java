package actions.passengerMenu;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.model.Passanger;

// TODO: Auto-generated Javadoc
/**
 * The Class BookAFlightAction.
 *
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads for the start of booking.
 */
public class BookAFlightAction {
	
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
	
	/** The ca. */
	private String ca;
	
	/**
	 * 
	 * This function redirect the flow to a booking page and
	 * before doing this auto fills some values.
	 * 
	 * @return the page where we want to go
	 */
	public String execute() {
		fillDataWithSessionPassanger();
		return "bookAFlight";
	}

	/**
	 * Fill data with session passanger.
	 */
	@SuppressWarnings("rawtypes")
	public void fillDataWithSessionPassanger() {
		Map session = ActionContext.getContext().getSession();	
		Passanger p = (Passanger) session.get("loggedPassanger");
		this.setName(p.getFirstName());
		this.setFirstName(p.getLastName1());
		this.setSecondName(p.getLastName2());
		this.setDniPassport(p.getDni_passport());
		this.setBirthDate(p.getBirthDate());
		this.setHomeTlf(p.getHomeTlf());
		this.setMovileTlf(p.getMovileTlf());
		this.setEmail(p.getEmail());
//		this.setCa(ca);
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
	public void setFirstName(String firstName) {
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
	 * Gets the ca.
	 *
	 * @return the ca
	 */
	public String getCa() {
		return ca;
	}

	/**
	 * Sets the ca.
	 *
	 * @param ca the new ca
	 */
	public void setCa(String ca) {
		this.ca = ca;
	}

	
}
