package domain.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Airplane {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer airplaneId;
	
	@NotNull
	private String name;
	
	@NotNull
	private String serialNumb;
	
	@NotNull
	private String cnMsn;
	
	@NotNull
	private Integer lineNumber;
	
	@NotNull
	private String currentRegistration;
	
	@NotNull
	private String operatorOwner;
	
	@NotNull
	private Date deliberyDate;
	
	@NotNull
	private String engineModel;
	
	@NotNull
	private Boolean status;
	
	@NotNull
	private Integer numberOfFlights;
	
	@NotNull
	private Integer hoursOfFlight;
	
	@OneToMany
	private Collection<AirplanePhoto> airplanePhotoList = new ArrayList<AirplanePhoto>();
	
	@OneToOne
	private Airline airline;
	
	@OneToOne
	private Airport airport;
	
	@OneToOne
	private PlanePosition planePosition;
	
	@ManyToMany//(mappedBy="airportController")
	private Collection<AirportController> airportControllerList = new ArrayList<AirportController>();
	
	
	
	

	public Collection<AirplanePhoto> getAirplanePhotoList() {
		return airplanePhotoList;
	}

	public void setAirplanePhotoList(Collection<AirplanePhoto> airplanePhotoList) {
		this.airplanePhotoList = airplanePhotoList;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public PlanePosition getPlanePosition() {
		return planePosition;
	}

	public void setPlanePosition(PlanePosition planePosition) {
		this.planePosition = planePosition;
	}

	public Collection<AirportController> getAirportControllerList() {
		return airportControllerList;
	}

	public void setAirportControllerList(Collection<AirportController> airportControllerList) {
		this.airportControllerList = airportControllerList;
	}

	public Integer getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(Integer airplaneId) {
		this.airplaneId = airplaneId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialNumb() {
		return serialNumb;
	}

	public void setSerialNumb(String serialNumb) {
		this.serialNumb = serialNumb;
	}

	public String getCnMsn() {
		return cnMsn;
	}

	public void setCnMsn(String cnMsn) {
		this.cnMsn = cnMsn;
	}

	public Integer getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getCurrentRegistration() {
		return currentRegistration;
	}

	public void setCurrentRegistration(String currentRegistration) {
		this.currentRegistration = currentRegistration;
	}

	public String getOperatorOwner() {
		return operatorOwner;
	}

	public void setOperatorOwner(String operatorOwner) {
		this.operatorOwner = operatorOwner;
	}

	public Date getDeliberyDate() {
		return deliberyDate;
	}

	public void setDeliberyDate(Date deliberyDate) {
		this.deliberyDate = deliberyDate;
	}

	public String getEngineModel() {
		return engineModel;
	}

	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getNumberOfFlights() {
		return numberOfFlights;
	}

	public void setNumberOfFlights(Integer numberOfFlights) {
		this.numberOfFlights = numberOfFlights;
	}

	public Integer getHoursOfFlight() {
		return hoursOfFlight;
	}

	public void setHoursOfFlight(Integer hoursOfFlight) {
		this.hoursOfFlight = hoursOfFlight;
	}
	
	

}
