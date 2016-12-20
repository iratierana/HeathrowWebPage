package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.Airline;
import domain.model.Airplane;
import domain.model.Passanger;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with Airline, in order to work with the database
 *  
 */

public class DAOAirline {
	
	private static Session session;
	
	/**
	 * 
	 * This function insert an Airline in the database
	 * 
	 * @param airline to insert an entire airline in the database
	 * @return true if the insert is correct
	 * @return false if and error occurs during the insert
	 */
	public static boolean insertAirline(Airline airline){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(airline); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
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
	 * Loads all the planes of an specific airline
	 * 
	 * @param airline 
	 * @return listOfPlanes the list of planes of the specified airline
	 */
	public static List<Airplane> loadPlanesOfAirline(Airline airline){
		//TODO loadPlanesOfAirline
		return null;
	}

	/**
	 * 
	 * Deletes the airline from the database
	 * 
	 * @param airline the airline to delete
	 * @return true if the airline is deleted
	 * @return false if an error occurs
	 */
	public static boolean deleteAirline(Airline airline){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(airline);
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
	 * This function loads all the airlines of the database
	 * 
	 * @return a list of all the airlines of the database
	 * @return null if an error occurs during the load
	 */
	@SuppressWarnings("unchecked")
	public static List<Airline> loadAllAirlines() {
		List<Airline> airlineList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			TypedQuery<Airline> query = session.createQuery("from Airline");
			airlineList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return airlineList;
	}
	

}
