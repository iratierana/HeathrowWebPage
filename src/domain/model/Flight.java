package domain.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Flight {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE )
	private Integer flightId;
	
	@NotNull
	private Date departureDate;
	
	@NotNull
	private Date arrivalDate;
	
	@NotNull
	private Integer departureGate;
	
	@NotNull
	private Integer arrivalGate;
	
	@NotNull
	private Integer arrivalTerminal;
	
	@NotNull
	private Integer departureTerminal;
	
	
	
	@ManyToMany 
	@JoinTable(name="ControlFlight")
	Collection<AirportController> cortrollerList=new ArrayList<AirportController>();
	
	@OneToOne
	Airport departAirport;
	
	@OneToOne
	Airport arriveAirport;
	
	@ManyToMany
	@JoinTable(name="Booking")
	Collection<Passanger> passangerList = new ArrayList<Passanger>();

	
	
	
	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Integer getDepartureGate() {
		return departureGate;
	}

	public void setDepartureGate(Integer departureGate) {
		this.departureGate = departureGate;
	}

	public Integer getArrivalGate() {
		return arrivalGate;
	}

	public void setArrivalGate(Integer arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	public Integer getArrivalTerminal() {
		return arrivalTerminal;
	}

	public void setArrivalTerminal(Integer arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	public Integer getDepartureTerminal() {
		return departureTerminal;
	}

	public void setDepartureTerminal(Integer departureTerminal) {
		this.departureTerminal = departureTerminal;
	}

	public Collection<AirportController> getCortrollerList() {
		return cortrollerList;
	}

	public void setCortrollerList(Collection<AirportController> cortrollerList) {
		this.cortrollerList = cortrollerList;
	}

	public Airport getDepartAirport() {
		return departAirport;
	}

	public void setDepartAirport(Airport departAirport) {
		this.departAirport = departAirport;
	}

	public Airport getArriveAirport() {
		return arriveAirport;
	}

	public void setArriveAirport(Airport arriveAirport) {
		this.arriveAirport = arriveAirport;
	}

	public Collection<Passanger> getPassangerList() {
		return passangerList;
	}

	public void setPassangerList(Collection<Passanger> passangerList) {
		this.passangerList = passangerList;
	}
	
}
