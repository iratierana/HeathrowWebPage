package domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}
