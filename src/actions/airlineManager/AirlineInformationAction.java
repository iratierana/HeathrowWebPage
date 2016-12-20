package actions.airlineManager;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.opensymphony.xwork2.ActionContext;

import domain.dao.DAOAirplane;
import domain.model.AirlineManager;
import domain.model.Airplane;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are made all the process and loads of Airline Information.
 *  
 */
public class AirlineInformationAction {

	private Integer id = null;

	/**
	 * 
	 * This function redirect the content flow to another page
	 * 
	 * @return airlineInfo the page(jsp) where we want to redirect
	 */
	
	public String execute(){
		DAOAirplane.loadAirplane(id);
		return "airlineInfo";
	}
	
	
}
