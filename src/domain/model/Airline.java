package domain.model;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


// TODO: Auto-generated Javadoc
/**
 * The Class Airline.
 */
@Entity
public class Airline {
	
	/**
	 * The airline id.
	 *
	 * @author Xabier Jauregi
	 * @author Irati Erana
	 * @author Mikel Arizmendiarrieta
	 * @version 1.0
	 * @since   2016-12-13
	 * 
	 * General Entity of Airline class.
	 * Is connected with hibernate to generate the
	 * table Airline and the needed relationshihps.
	 * Is used to save and work with the information of a Airline.
	 */
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer airlineId;
	
	/** The name. */
	@NotNull
	private String name;
	
	/** The description. */
	private String description;

//	@OneToMany
//	@JoinColumn(name="AIRLINE_ID", nullable=false)
//	Collection<Airplane> airplaneList = new ArrayList<Airplane>();
	
	
	
	
	
	
	/**
 * Gets the airline id.
 *
 * @return the airline id
 */
public Integer getAirlineId() {
		return airlineId;
	}

	/**
	 * Sets the airline id.
	 *
	 * @param airlineId the new airline id
	 */
	public void setAirlineId(final Integer airlineId) {
		this.airlineId = airlineId;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

//	public Collection<Airplane> getAirplaneList() {
//		return airplaneList;
//	}
//
//	public void setAirplaneList(Collection<Airplane> airplaneList) {
//		this.airplaneList = airplaneList;
//	}


}