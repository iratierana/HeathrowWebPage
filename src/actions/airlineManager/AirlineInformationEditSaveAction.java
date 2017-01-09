package actions.airlineManager;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOAirplane;
import domain.model.AirlineManager;
import domain.model.Airplane;

// TODO: Auto-generated Javadoc
/**
 * The Class AirlineInformationEditSaveAction.
 */
public class AirlineInformationEditSaveAction {
	
	/** The airplane id. */
	private Integer airplaneId;
	
	/** The airplane name. */
	private String airplaneName;
	
	/** The serial number. */
	private String serialNumber;
	
	/** The airplane list. */
	private List<Airplane> airplaneList = null;
	
	/** The airplane. */
	private Airplane airplane = new Airplane();
	
	/**
	 * Execute.
	 *
	 * @return the string
	 */
	@SuppressWarnings("rawtypes")
	public String execute() {
		Map session = ActionContext.getContext().getSession();
		AirlineManager aM = (AirlineManager) session.get("loggedAirlineManager");
		DAOAirplane.updateAirplane(createAirplane());
		airplaneList = DAOAirplane.loadAirplanesOfAirline(aM.getAirlineManagerId());
		return "airplanesList";
	}

	/**
	 * Creates the airplane.
	 *
	 * @return the airplane
	 */
	private Airplane createAirplane() {
		Airplane airplane = new Airplane();
		airplane.setAirplaneId(this.airplaneId);
		airplane.setName(this.airplaneName);
		airplane.setSerialNumb(this.serialNumber);
		
		return airplane;
	}

	/**
	 * Gets the airplane.
	 *
	 * @return the airplane
	 */
	public Airplane getAirplane() {
		return airplane;
	}

	/**
	 * Sets the airplane.
	 *
	 * @param airplane the new airplane
	 */
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	/**
	 * Gets the airplane id.
	 *
	 * @return the airplane id
	 */
	public Integer getAirplaneId() {
		return airplaneId;
	}

	/**
	 * Sets the airplane id.
	 *
	 * @param airplaneId the new airplane id
	 */
	public void setAirplaneId(Integer airplaneId) {
		this.airplaneId = airplaneId;
	}

	/**
	 * Gets the airplane name.
	 *
	 * @return the airplane name
	 */
	public String getAirplaneName() {
		return airplaneName;
	}

	/**
	 * Sets the airplane name.
	 *
	 * @param airplaneName the new airplane name
	 */
	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}

	/**
	 * Gets the serial number.
	 *
	 * @return the serial number
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Sets the serial number.
	 *
	 * @param serialNumber the new serial number
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Gets the airplane list.
	 *
	 * @return the airplane list
	 */
	public List<Airplane> getAirplaneList() {
		return airplaneList;
	}

	/**
	 * Sets the airplane list.
	 *
	 * @param airplaneList the new airplane list
	 */
	public void setAirplaneList(List<Airplane> airplaneList) {
		this.airplaneList = airplaneList;
	}
	
}