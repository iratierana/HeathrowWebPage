package domain.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import configurations.ConnectHibernate;
import domain.model.Flight;
import domain.model.Passanger;


// TODO: Auto-generated Javadoc
/**
 * The Class DAOPassanger.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with 
 * passanger, in order to work with the database
 */
public class DAOPassanger {

/** The session. */
private static Session session;
	
	/**
	 * This function insert a passenger in the database.
	 *
	 * @param passanger the passenger to insert in the database
	 * @return true if the insert is correct
	 * false if and error occurs during the insert
	 */
	public static boolean insertPassanger(final Passanger passanger) {
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(passanger);
			session.getTransaction().commit();
			ConnectHibernate.after();
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			return false;		
		} finally {
			ConnectHibernate.after();

		}
	}
	
	/**
	 * This function load a specific passenger.
	 *
	 * @param username the username of the passenger
	 * @param pass the password of the passenger
	 * @return the passenger object if the passenger exists, else null
	 */
	@SuppressWarnings("unchecked")
	public static Passanger loadPassanger(final String username, final String pass) {
		List<Passanger> passangerList = null;
		Passanger p = new Passanger();
		p = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			TypedQuery<Passanger> query = session.createQuery("from Passanger where password='" + pass + "' and username='" + username + "'");
			passangerList = query.getResultList();
			if (!passangerList.isEmpty()) {
				p = passangerList.get(0);
			}
			ConnectHibernate.after();
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		} finally {
			ConnectHibernate.after();

		}
		
		return p;
	}

	/**
	 * This function loads al the fights of a specific passenger.
	 *
	 * @param id the id of the passenger
	 * @return the list of flights if the passanger exists, else null
	 */
	@SuppressWarnings({ "unchecked" })
	public static List<Flight> loadPassangerFlights(final int id) {
		List<Flight> flightList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();			
			Query query = session.createQuery("select p.flightList from Passanger as p where p.id =" + id);
			flightList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectHibernate.after();		
		}
		return flightList;
	}
	
	/**
	 * This function save the changes that have been done in a passenger.
	 *
	 * @param passanger Passenger to update
	 * @return true if the update goes OK
	 * false if an error occurs
	 */
	public static boolean updatePassanger(Passanger passanger) {
		try {
			ConnectHibernate.before();			
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			String hql = "UPDATE Passanger"
					+ " SET firstName = '" + passanger.getFirstName() + "',"
					+ " lastName1 = '" + passanger.getLastName1() + "',"
					+ " lastName2 = '" + passanger.getLastName2() + "',"
					+ " dni_passport = '" + passanger.getDni_passport() + "',"
					+ " homeTlf = '" + passanger.getHomeTlf() + "',"
					+ " movileTlf = '" + passanger.getMovileTlf() + "',"
					+ " email = '" + passanger.getEmail() + "',"
					+ " birthDate = '" + passanger.getBirthDate() + "',"
					+ " username = '" + passanger.getUsername() + "',"
					+ " password = '" + passanger.getPassword() + "'"
					+ " WHERE passangerId = " + passanger.getPassangerId();
			Query query = session.createQuery(hql);
			query.executeUpdate();
			session.getTransaction().commit();		
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		} finally {
			ConnectHibernate.after();		
		}
		return true;
	}
	
	/**
	 * This function adds book a flight for a passenger 
	 * and adds it to the flightList of passenger.
	 *
	 * @param flight The flight to add
	 * @return true if the insert is OK
	 * false if an error occurs during the insert
	 */
	@SuppressWarnings("rawtypes")
	public static boolean addFlightToLoggedPassenger(Flight flight) {
		try {
			ConnectHibernate.before();			
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			
			Map sessio = ActionContext.getContext().getSession();				
			Passanger p = (Passanger) sessio.get("loggedPassanger");
						
			p.getFlightList().add(flight);
			
			session.saveOrUpdate(p);
			
			session.getTransaction().commit();	
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			ConnectHibernate.after();		
		}
		return true;
	}
	
	/**
	 * Check email.
	 *
	 * @param email the email
	 * @return true, if successful
	 */
	public static boolean checkEmail(final String email) {
		boolean ret = false;
		try {
			ConnectHibernate.before();			
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			
			StoredProcedureQuery query = session.createStoredProcedureQuery("checkTheEmail")
					.registerStoredProcedureParameter("email", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("ok", boolean.class, ParameterMode.OUT)
					.setParameter("email", email);
			query.execute();
			ret = (boolean) query.getOutputParameterValue("ok");
			session.getTransaction().commit();	
			return ret;
		} catch (Exception e) {			
			e.printStackTrace();
			return ret;
		} finally {
			ConnectHibernate.after();		
		}
	}
}
