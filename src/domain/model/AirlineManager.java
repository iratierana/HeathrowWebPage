package domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * The Class AirlineManager.
 */
@Entity
public class AirlineManager {

	/**
	 * The airline manager id.
	 *
	 * @author Xabier Jauregi
	 * @author Irati Erana
	 * @author Mikel Arizmendiarrieta
	 * @version 1.0
	 * @since   2016-12-13
	 *
	 * General Entity of Airline Manager class.
	 * Is connected with hibernate to generate the
	 * table Airline Manager and the needed relationshihps.
	 * Is used to save and work with the information
	 * of the user Airline Manager.
	 */

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer airlineManagerId;

	/** The first name. */
	@NotNull
	private String firstName;

	/** The last name 1. */
	@NotNull
	private String lastName1;

	/** The last name 2. */
	@NotNull
	private String lastName2;

	/** The dni passport. */
	@NotNull
	private String dni_passport;

	/** The home tlf. */
	@NotNull
	private String homeTlf;

	/** The movile tlf. */
	@NotNull
	private String movileTlf;

	/** The email. */
	@NotNull
	private String email;

	/** The birth date. */
	@NotNull
	private Date birthDate;

	/** The username. */
	@NotNull
	private String username;

	/** The password. */
	@NotNull
	private String password;

	/** The airline. */
	@OneToOne
	private Airline airline;

	/** The direction. */
	@OneToOne
	private Direction direction;

	/**
	 * Gets the airline manager id.
	 *
	 * @return the airline manager id
	 */
	public Integer getAirlineManagerId() {
		return airlineManagerId;
	}

	/**
	 * Sets the airline manager id.
	 *
	 * @param airlineManagerId the new airline manager id
	 */
	public void setAirlineManagerId(final Integer airlineManagerId) {
		this.airlineManagerId = airlineManagerId;
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
	 * Gets the last name 1.
	 *
	 * @return the last name 1
	 */
	public String getLastName1() {
		return lastName1;
	}

	/**
	 * Sets the last name 1.
	 *
	 * @param lastName1 the new last name 1
	 */
	public void setLastName1(final String lastName1) {
		this.lastName1 = lastName1;
	}

	/**
	 * Gets the last name 2.
	 *
	 * @return the last name 2
	 */
	public String getLastName2() {
		return lastName2;
	}

	/**
	 * Sets the last name 2.
	 *
	 * @param lastName2 the new last name 2
	 */
	public void setLastName2(final String lastName2) {
		this.lastName2 = lastName2;
	}

	/**
	 * Gets the dni passport.
	 *
	 * @return the dni passport
	 */
	public String getDni_passport() {
		return dni_passport;
	}

	/**
	 * Sets the dni passport.
	 *
	 * @param dni_passport the new dni passport
	 */
	public void setDni_passport(final String dni_passport) {
		this.dni_passport = dni_passport;
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
	 * Gets the airline.
	 *
	 * @return the airline
	 */
	public Airline getAirline() {
		return airline;
	}

	/**
	 * Sets the airline.
	 *
	 * @param airline the new airline
	 */
	public void setAirline(final Airline airline) {
		this.airline = airline;
	}

	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * Sets the direction.
	 *
	 * @param direction the new direction
	 */
	public void setDirection(final Direction direction) {
		this.direction = direction;
	}
}