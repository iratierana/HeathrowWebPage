package actions.airlineManager;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOAirplane;
import domain.model.AirlineManager;
import domain.model.Airplane;

public class AirlineInformationEditSaveAction {
	
	private Integer airplaneId ;
	private String airplaneName;
	private String serialNumber;
	
	private List<Airplane> airplaneList = null;
	
	private Airplane airplane = new Airplane();
	
	@SuppressWarnings("rawtypes")
	public String execute(){
		Map session = ActionContext.getContext().getSession();
		AirlineManager aM = (AirlineManager) session.get("loggedAirlineManager");
		DAOAirplane.updateAirplane(createAirplane());
		airplaneList = DAOAirplane.loadAirplanesOfAirline(aM.getAirlineManagerId());
		return "airplanesList";
	}

	private Airplane createAirplane() {
		Airplane airplane = new Airplane();
		airplane.setAirplaneId(this.airplaneId);
		airplane.setName(this.airplaneName);
		airplane.setSerialNumb(this.serialNumber);
		
		return airplane;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Integer getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(Integer airplaneId) {
		this.airplaneId = airplaneId;
	}

	public String getAirplaneName() {
		return airplaneName;
	}

	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public List<Airplane> getAirplaneList() {
		return airplaneList;
	}

	public void setAirplaneList(List<Airplane> airplaneList) {
		this.airplaneList = airplaneList;
	}
	
	

}