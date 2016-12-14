package domain.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.Flight;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with flight, in order to work with the database
 *  
 */
public class DAOFlight {
	
private static Session session;
	
	/**
	 * 
	 * This function insert aflight in the database
	 * 
	 * @param flight the flight to insert in the database
	 * @return true if the insert is correct
	 * @return false if and error occurs during the insert
	 */
	public static boolean insertFlight(Flight flight){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(flight);
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
	 * This function delete a flight from the database
	 * 
	 * @param flight the flight to delete from the database
	 * @return true if the delete is correct
	 * @return false if and error occurs during the delete
	 */
	public static boolean deleteFlight(Flight flight){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(flight);
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
	 * This function load all the flights of the database
	 * 
	 * @return the list of flights if the load is correct
	 * @return null if an error occurs during the load
	 */
	public static List<Flight> loadAllFlights() {
		List<Flight> flightList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<Flight> query = session.createQuery("from Flight");
			flightList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return flightList;
	}

	/**
	 * This function checks if the flight exist in order to book it
	 * @param from the airport name where the plane will departure
	 * @param to the airport name where the plane will arrive
	 * @param arrivalDate the date when the plane will arrive
	 * @param departureDate the date when the plane will departure
	 * @return f the flight if exist one
	 * @return null if no flight exist
	 */
	public static Flight checkIfFlightIsBookable(String from, String to, Date arrivalDate, Date departureDate){
		List<Flight> flightList = null;
		Flight f = new Flight();
		f = null;
		
		Date end1 = new Date(departureDate.getTime() + (1000 * 60 * 60 * 24));
		Date end2 = new Date(arrivalDate.getTime() + (1000 * 60 * 60 * 24));
		
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			@SuppressWarnings("unchecked")
			TypedQuery<Flight> query = session.createQuery("FROM Flight "
														 + "WHERE departAirport.name='"+from+"' "
															+ " AND arriveAirport.name='"+to+"'"
															+ " AND departureDate between :start1 and :end1"
															+ " AND arrivalDate between :start2 and :end2");
			query.setParameter("start1", departureDate);
			query.setParameter("start2", arrivalDate);
			query.setParameter("end1", end1);
			query.setParameter("end2", end2);
			flightList = query.getResultList();
			if(!flightList.isEmpty()){
				f=flightList.get(0);
			}
			ConnectHibernate.after();
			
		}catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		}
		
		ConnectHibernate.after();
		return f;
	}
}
