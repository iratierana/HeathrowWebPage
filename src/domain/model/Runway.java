package domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Runway {
	
	@Id@GeneratedValue(strategy=GenerationType.SEQUENCE )
	private Integer runwayId;
	
	@NotNull
	private String tipo;
	
	@NotNull
	private boolean state;
	
	@OneToOne
	private Airport airport;
	
	
	
	

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Integer getRunwayId() {
		return runwayId;
	}

	public void setRunwayId(Integer runwayId) {
		this.runwayId = runwayId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	
	

}
