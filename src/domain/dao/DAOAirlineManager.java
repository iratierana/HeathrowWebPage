package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.AirlineManager;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with AirlineManager, in order to work with the database
 *  
 */
public class DAOAirlineManager {

	private static Session session;
	
	/**
	 * 
	 * This function insert a airline manager in the database
	 * 
	 * @param airlineManager the manager to insert in the databse
	 * @return true if the insert is correct
	 * @return false if and error occurs during the insert
	 */
	public static boolean insertAirlineManager(AirlineManager airlineManager){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(airlineManager); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
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
	 * This function delete an airline manager from the database
	 * 
	 * @param airlineManager the manager to delete from the databse
	 * @return true if the delete is correct
	 * @return false if and error occurs during the delete
	 */
	public static boolean deleteAirlineManager(AirlineManager airlienManager){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(airlienManager);
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
	 * This function load all the airline managers of the database
	 * 
	 * @param airlineManager the manager to insert in the databse
	 * @return true if the load is correct
	 * @return false if and error occurs during the load
	 */
	public static List<AirlineManager> loadAllAirlineManagers(){
		List<AirlineManager> airlineManagerList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<AirlineManager> query = session.createQuery("from AirlineManager");
		  	airlineManagerList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return airlineManagerList;	
	}
	
	/**
	 * 
	 * This function load an airline manager from the database
	 * 
	 * @param username the usename of the irline manager
	 * @param pass the username of the airline manager
	 * @return the airline manager if the manager exists else null.
	 */
	@SuppressWarnings("unchecked")
	public static AirlineManager loadAirLineManager(String username, String pass){
		List<AirlineManager> managerList = null;
		AirlineManager aM = new AirlineManager();
		aM = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			TypedQuery<AirlineManager> query = session.createQuery("from AirlineManager where password='"+pass+"' and username='"+username+"'");
			managerList = query.getResultList();
			if(!managerList.isEmpty()){
				aM=managerList.get(0);
			}
			ConnectHibernate.after();
			
		}catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		}
		
		ConnectHibernate.after();
		return aM;
	}
}
