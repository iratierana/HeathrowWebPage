package actions.passengerMenu;

import java.util.Date;
import java.util.Random;

import domain.dao.DAOFlight;
import domain.dao.DAOPassanger;
import domain.model.Airport;
import domain.model.Flight;
import domain.model.Passanger;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the processes and loads for the finish of booking.
 *  
 */
public class BookAFlightFinishAction {
	
	//Flight data from Jsp
	private String from;
	private String to;
	private Date departureDay;
	private Date arrivalDay;
	private Integer numberOfPassangers;
	
	//Passenger data from Jsp
	private String name;
	private String firstName;
	private String secondName;
	private String dniPassport;
	private Date birthDate;
	private String homeTlf;
	private String movileTlf;
	private String email;
	private String ca;
		
	
	Passanger passenger;
	Airport controller;
	
	/**
	 * 
	 * Redirects the flow to the page where we want to go.
	 * Checks if the selected fight exists.
	 * Adds the selected flight to the logged passenger
	 * 
	 * @return The page where we want to go.
	 */
	public String execute() {
		Flight f = DAOFlight.checkIfFlightIsBookable(from, to, arrivalDay, departureDay);
		DAOPassanger.addFlightToLoggedPassenger(f);
		return "passenger";
	}
		
	
	/**
	 * Gerarates a random number.
	 * @param min The maximun value of the random number.
	 * @param max The minimun value of the random number.
	 * @return The generated rndom number
	 */
	public int randInt(final int min, final int max) {

	    
	    Random rand = new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
		
	
	
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getDepartureDay() {
		return departureDay;
	}

	public void setDepartureDay(Date departureDay) {
		this.departureDay = departureDay;
	}

	public Date getArrivalDay() {
		return arrivalDay;
	}

	public void setArrivalDay(Date arrivalDay) {
		this.arrivalDay = arrivalDay;
	}

	public Integer getNumberOfPassangers() {
		return numberOfPassangers;
	}

	public void setNumberOfPassangers(Integer numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
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

	public String getCa() {
		return ca;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}



	public Passanger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passanger passenger) {
		this.passenger = passenger;
	}

	public Airport getController() {
		return controller;
	}

	public void setController(Airport controller) {
		this.controller = controller;
	}

}
