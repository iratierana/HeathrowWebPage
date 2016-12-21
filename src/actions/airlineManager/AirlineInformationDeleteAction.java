package actions.airlineManager;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOAirplane;
import domain.model.AirlineManager;
import domain.model.Airplane;

public class AirlineInformationDeleteAction {
	
	private int airplaneId;
	private Airplane airplaneToDelete;
	
	private List<Airplane> airplaneList = null;
	
	@SuppressWarnings("rawtypes")
	public String execute(){
		airplaneToDelete = DAOAirplane.loadAirplane(airplaneId);
		DAOAirplane.deleteAirplane(airplaneToDelete);	
		
		Map session = ActionContext.getContext().getSession();
		AirlineManager aM = (AirlineManager) session.get("loggedAirlineManager");
		airplaneList = DAOAirplane.loadAirplanesOfAirline(aM.getAirlineManagerId());
		
		return "airlineManagerList";
	}

	public List<Airplane> getAirplaneList() {
		return airplaneList;
	}

	public void setAirplaneList(List<Airplane> airplaneList) {
		this.airplaneList = airplaneList;
	}

	public int getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(int airplaneId) {
		this.airplaneId = airplaneId;
	}

	public Airplane getAirplaneToDelete() {
		return airplaneToDelete;
	}

	public void setAirplaneToDelete(Airplane airplaneToDelete) {
		this.airplaneToDelete = airplaneToDelete;
	}
	
	

}
