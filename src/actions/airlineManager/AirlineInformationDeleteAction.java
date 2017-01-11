package actions.airlineManager;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOAirplane;
import domain.model.AirlineManager;
import domain.model.Airplane;

// TODO: Auto-generated Javadoc
/**
 * The Class AirlineInformationDeleteAction.
 */
public class AirlineInformationDeleteAction {
	
	/** The airplane id. */
	private int airplaneId;
	
	/** The airplane to delete. */
	private Airplane airplaneToDelete;
	
	/** The airplane list. */
	private List<Airplane> airplaneList = null;
	
	/**
	 * Execute.
	 *
	 * @return the string
	 */
	@SuppressWarnings("rawtypes")
	public String execute() {
		airplaneToDelete = DAOAirplane.loadAirplane(airplaneId);
		DAOAirplane.deleteAirplane(airplaneToDelete);	
		
		Map session = ActionContext.getContext().getSession();
		AirlineManager aM = (AirlineManager) session.get("loggedAirlineManager");
		airplaneList = DAOAirplane.loadAirplanesOfAirline(aM.getAirlineManagerId());
		
		return "airlineManagerList";
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
	public void setAirplaneList(final List<Airplane> airplaneList) {
		this.airplaneList = airplaneList;
	}

	/**
	 * Gets the airplane id.
	 *
	 * @return the airplane id
	 */
	public int getAirplaneId() {
		return airplaneId;
	}

	/**
	 * Sets the airplane id.
	 *
	 * @param airplaneId the new airplane id
	 */
	public void setAirplaneId(int airplaneId) {
		this.airplaneId = airplaneId;
	}

	/**
	 * Gets the airplane to delete.
	 *
	 * @return the airplane to delete
	 */
	public Airplane getAirplaneToDelete() {
		return airplaneToDelete;
	}

	/**
	 * Sets the airplane to delete.
	 *
	 * @param airplaneToDelete the new airplane to delete
	 */
	public void setAirplaneToDelete(Airplane airplaneToDelete) {
		this.airplaneToDelete = airplaneToDelete;
	}

}
