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
public class PlanePosition {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer planePositionId;
	
	@NotNull
	private Integer position;
	
	@NotNull
	private Date hour;
	
	@OneToOne
	private Airplane airplane;
	
	@ManyToMany
	private Collection<AirportController> ariportControllerList = new ArrayList<AirportController>();
	
	
	
	

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Collection<AirportController> getAriportControllerList() {
		return ariportControllerList;
	}

	public void setAriportControllerList(Collection<AirportController> ariportControllerList) {
		this.ariportControllerList = ariportControllerList;
	}

	public Integer getPlanePositionId() {
		return planePositionId;
	}

	public void setPlanePositionId(Integer planePositionId) {
		this.planePositionId = planePositionId;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Date getHour() {
		return hour;
	}

	public void setHour(Date hour) {
		this.hour = hour;
	}
	
	

}
