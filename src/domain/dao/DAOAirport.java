package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.Airport;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with Airport, in order to work with the database
 *  
 */
public class DAOAirport {

	private static Session session;
	
	/**
	 * 
	 * This function insert an airport in the database
	 * 
	 * @param a the airport to insert in the database
	 * @return true if the insert is correct
	 * @return false if and error occurs during the insert
	 */
	public static boolean insertAirport(Airport a){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(a); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
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
	 * This function delete an airport from the database
	 * 
	 * @param a the airport to delete from the database
	 * @return true if the delete is correct
	 * @return false if and error occurs during the delete
	 */
	public static boolean deleteAirport(Airport a){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(a);
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
	 * This function load all the airports of the database
	 * 
	 * @return the list of airports if the load is correct
	 * @return null if an error occurs during the load
	 */
	public static List<Airport> loadAllAirports() {
		List<Airport> airportList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<Airport> query = session.createQuery("from Airport");
			airportList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return airportList;
	}
}
