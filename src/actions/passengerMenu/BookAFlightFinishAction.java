package actions.passengerMenu;

import java.util.Date;
import java.util.Random;

import domain.dao.DAOFlight;
import domain.dao.DAOPassanger;
import domain.model.Airport;
import domain.model.Flight;
import domain.model.Passanger;

// TODO: Auto-generated Javadoc
/**
 * The Class BookAFlightFinishAction.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads for the finish of booking.
 */
public class BookAFlightFinishAction {
	
	/** The from. */
	//Flight data from Jsp
	private String from;
	
	/** The to. */
	private String to;
	
	/** The departure day. */
	private Date departureDay;
	
	/** The arrival day. */
	private Date arrivalDay;
	
	/** The number of passangers. */
	private Integer numberOfPassangers;
	
	/** The name. */
	//Passenger data from Jsp
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
		
	
	/** The passenger. */
	Passanger passenger;
	
	/** The controller. */
	Airport controller;
	
	/**
	 * Execute.
	 *
	 * @return the string
	 */
	public String execute() {
		Flight f = DAOFlight.checkIfFlightIsBookable(from, to, arrivalDay, departureDay);
		DAOPassanger.addFlightToLoggedPassenger(f);
		return "passenger";
	}
	
	/**
	 * Gets the from.
	 *
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Sets the from.
	 *
	 * @param from the new from
	 */
	public void setFrom(final String from) {
		this.from = from;
	}

	/**
	 * Gets the to.
	 *
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * Sets the to.
	 *
	 * @param to the new to
	 */
	public void setTo(final String to) {
		this.to = to;
	}

	/**
	 * Gets the departure day.
	 *
	 * @return the departure day
	 */
	public Date getDepartureDay() {
		return departureDay;
	}

	/**
	 * Sets the departure day.
	 *
	 * @param departureDay the new departure day
	 */
	public void setDepartureDay(final Date departureDay) {
		this.departureDay = departureDay;
	}

	/**
	 * Gets the arrival day.
	 *
	 * @return the arrival day
	 */
	public Date getArrivalDay() {
		return arrivalDay;
	}

	/**
	 * Sets the arrival day.
	 *
	 * @param arrivalDay the new arrival day
	 */
	public void setArrivalDay(final Date arrivalDay) {
		this.arrivalDay = arrivalDay;
	}

	/**
	 * Gets the number of passangers.
	 *
	 * @return the number of passangers
	 */
	public Integer getNumberOfPassangers() {
		return numberOfPassangers;
	}

	/**
	 * Sets the number of passangers.
	 *
	 * @param numberOfPassangers the new number of passangers
	 */
	public void setNumberOfPassangers(final Integer numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
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
	public void setCa(final String ca) {
		this.ca = ca;
	}



	/**
	 * Gets the passenger.
	 *
	 * @return the passenger
	 */
	public Passanger getPassenger() {
		return passenger;
	}

	/**
	 * Sets the passenger.
	 *
	 * @param passenger the new passenger
	 */
	public void setPassenger(final Passanger passenger) {
		this.passenger = passenger;
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	public Airport getController() {
		return controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	public void setController(final Airport controller) {
		this.controller = controller;
	}

}
