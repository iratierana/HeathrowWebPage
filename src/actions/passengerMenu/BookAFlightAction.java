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
 * Class where are made all the processes and loads for the start of booking.
 *  
 */
public class BookAFlightAction {
	
	private String name;
	private String firstName;
	private String secondName;
	private String dniPassport;
	private Date birthDate;
	private String homeTlf;
	private String movileTlf;
	private String email;
	private String ca;
	
	/**
	 * 
	 * This function redirect the flow to a booking page and
	 * before doing this auto fills some values.
	 * 
	 * @return the page where we want to go
	 */
	public String execute(){
		fillDataWithSessionPassanger();
		return "bookAFlight";
	}

	@SuppressWarnings("rawtypes")
	public void fillDataWithSessionPassanger(){
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

	
}
