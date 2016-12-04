package domain.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Flight {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
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
	private Collection<AirportController> ariportControllerList = new ArrayList<AirportController>();
	
	@ManyToMany(mappedBy="passanger")
	private Collection<Passanger> passangerList = new ArrayList<Passanger>();
	
	@OneToOne
	private Airline airline;
	
	@OneToOne
	private Airplane airplane;
	
	@OneToOne
	private Airport irtenAirport;

	@OneToOne
	private Airport helduAirport;

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

	public Collection<AirportController> getAriportControllerList() {
		return ariportControllerList;
	}

	public void setAriportControllerList(Collection<AirportController> ariportControllerList) {
		this.ariportControllerList = ariportControllerList;
	}

	public Collection<Passanger> getPassangerList() {
		return passangerList;
	}

	public void setPassangerList(Collection<Passanger> passangerList) {
		this.passangerList = passangerList;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Airport getIrtenAirport() {
		return irtenAirport;
	}

	public void setIrtenAirport(Airport irtenAirport) {
		this.irtenAirport = irtenAirport;
	}

	public Airport getHelduAirport() {
		return helduAirport;
	}

	public void setHelduAirport(Airport helduAirport) {
		this.helduAirport = helduAirport;
	}
	
	
	
	
}
