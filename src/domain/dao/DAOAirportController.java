package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.AirportController;


/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with AirportController, in order to work with the database
 *  
 */
public class DAOAirportController {
	
private static Session session;
	
/**
 * 
 * This function insert an Airport Controller in the database
 * 
 * @param aController the Airport Controller to insert in the database
 * @return true if the insert is correct
 * @return false if and error occurs during the insert
 */
	public static boolean insertAirportController(AirportController aController){
		try {
			
			ConnectHibernate.before(); 
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(aController); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
			session.getTransaction().commit();
			ConnectHibernate.after();
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;		
		}
	}

	/**
	 * 
	 * This function delete an airport controller from the database
	 * 
	 * @param aController the airport controller to delete from the database
	 * @return true if the delete is correct
	 * @return false if and error occurs during the delete
	 */
	public static boolean deleteAirportController(AirportController aController){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(aController);
			ConnectHibernate.after();
			return true;
			
		}catch(Exception e){
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;
		}
	}
	
	/**
	 * 
	 * This function load all the airport controllers of the database
	 * 
	 * @return the list of airport controllers if the load is correct
	 * @return null if an error occurs during the load
	 */
	public static List<AirportController> loadAllAirportControllers() {
		List<AirportController> cotrollerList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<AirportController> query = session.createQuery("from AirportController");
			cotrollerList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return cotrollerList;
	}

	
	/**
	 * 
	 * This function loads a specific airport controller
	 * 
	 * @param username the username of the airport controller
	 * @param pass the password of the airport controller
	 * @return th object of the airport controller, else null
	 */
	@SuppressWarnings("unchecked")
	public static AirportController loadAirportController(String username, String pass){
		List<AirportController> controllerList = null;
		AirportController aC = new AirportController();
		aC = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			TypedQuery<AirportController> query = session.createQuery("from AirportController where password='"+pass+"' and username='"+username+"'");
			controllerList = query.getResultList();
			if(!controllerList.isEmpty()){
				aC=controllerList.get(0);
			}
			ConnectHibernate.after();
			
		}catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		}
		
		ConnectHibernate.after();
		return aC;
	}
}
