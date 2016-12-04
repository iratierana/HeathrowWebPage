package domain.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Airport {

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer airportId;
	
	@NotNull
	private String name;
	
	@OneToMany
	private Collection<Runway> runwayList = new ArrayList<Runway>();
	
	@OneToOne
	private AirportController airportController;
	
	
	

	public Collection<Runway> getRunwayList() {
		return runwayList;
	}

	public void setRunwayList(Collection<Runway> runwayList) {
		this.runwayList = runwayList;
	}

	public AirportController getAirportController() {
		return airportController;
	}

	public void setAirportController(AirportController airportController) {
		this.airportController = airportController;
	}

	public Integer getAirportId() {
		return airportId;
	}
	
	public void setAirportId(Integer airportId) {
		this.airportId = airportId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
