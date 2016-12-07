package domain.model;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Airline {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE  )
	private Integer airlineId;
	
	@NotNull
	private String name;
	
	private String description;
	
	@OneToOne
	private AirlineManager airlineManager;
	
	@OneToMany
	private Collection<Airplane> airplaneList = new ArrayList<Airplane>();
	
	@ManyToMany //(mappedBy="Passanger")
	private Collection<Passanger> passangerList = new ArrayList<Passanger>();
	
	@ManyToMany //(mappedBy="passanger")
	private Collection<Flight> flightList = new ArrayList<Flight>();
	
	
	
	
	
	
	
	public AirlineManager getAirlineManager() {
		return airlineManager;
	}

	public void setAirlineManager(AirlineManager airlineManager) {
		this.airlineManager = airlineManager;
	}

	public Collection<Airplane> getAirplaneList() {
		return airplaneList;
	}

	public void setAirplaneList(Collection<Airplane> airplaneList) {
		this.airplaneList = airplaneList;
	}

	public Collection<Passanger> getPassangerList() {
		return passangerList;
	}

	public void setPassangerList(Collection<Passanger> passangerList) {
		this.passangerList = passangerList;
	}

	public Collection<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(Collection<Flight> flightList) {
		this.flightList = flightList;
	}

	public Integer getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	


}
