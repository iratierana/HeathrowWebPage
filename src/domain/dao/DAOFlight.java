package domain.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.Airplane;
import domain.model.Flight;

/**
 * The Class DAOFlight.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 *
 * Class where are all the needed functions related
 * with flight, in order to work with the database
 */

public class DAOFlight {

/** The Constant _24. */
private static final int N24 = 24;

/** The Constant _60. */
private static final int N60 = 60;

/** The Constant _1000. */
private static final int N1000 = 1000;
/** The session. */
private static Session session;


	/**
	 * This function load all the flights of the database.
	 *
	 * @return the list of flights if the load is correct
	 * null if an error occurs during the load
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
		} finally {
			ConnectHibernate.after();
		}


		return flightList;
	}

	/**
	 * This function loads and airplane.
	 *
	 * @param id The id of the airplane to load frm the databse
	 * @param idFlight the id flight
	 * @return The object airplane
	 */
	/*public static Flight loadFlight(final int id, final int idFlight) {
		List<Flight> flightList = null;
		Flight f = new Flight();
		f = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();

			@SuppressWarnings("unchecked")
			TypedQuery<Flight> query = session.createQuery("from Flight as f join f.airplane as a where a.airplaneId=" + id + " and f.flightId=" + idFlight);
			flightList = query.getResultList();
			if (!flightList.isEmpty()) {
				f = flightList.get(0);
			}
			ConnectHibernate.after();

		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		} finally {
			ConnectHibernate.after();

		}

		return f;
	}*/

	/**
	 * This function loads and flights.
	 *
	 * @param id The id of the airplane to load frm the databse
	 * @param idFlight the id flight
	 * @return The flight list
	 */

	public static Flight loadFlight(final int id, final int idFlight) {
		List<Flight> flightList = null;
		Flight f = new Flight();
		f = null;
		String sql = "SELECT *"
				+ " FROM Flight JOIN Airplane on Flight.airplane_airplaneid=Airplane.airplaneid"
				+ " WHERE airplane_airplaneid=" + id + " and flightId=" + idFlight;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();

			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Flight.class);
			flightList = query.list();
			flightList = query.getResultList();
			if (!flightList.isEmpty()) {
				f = flightList.get(0);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectHibernate.after();

		}
		return f;
	}

	/**
	 * This function checks if the flight exist in order to book it.
	 *
	 * @param from the airport name where the plane will departure
	 * @param to the airport name where the plane will arrive
	 * @param arrivalDate the date when the plane will arrive
	 * @param departureDate the date when the plane will departure
	 * @return f the flight if exist one
	 * null if no flight exist
	 */
	public static Flight checkIfFlightIsBookable(final String from, final String to, final Date arrivalDate, final Date departureDate) {
		List<Flight> flightList = null;
		Flight f = new Flight();
		f = null;

		Date end1 = new Date(departureDate.getTime() + (N1000 * N60 * N60 * N24));
		Date end2 = new Date(arrivalDate.getTime() + (N1000 * N60 * N60 * N24));

		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();

			@SuppressWarnings("unchecked")
			TypedQuery<Flight> query = session.createQuery("FROM Flight "
			 + "WHERE departAirport.name='" + from + "' "
			+ " AND arriveAirport.name='" + to + "'"
			+ " AND departureDate between :start1 and :end1"
			+ " AND arrivalDate between :start2 and :end2");
			query.setParameter("start1", departureDate);
			query.setParameter("start2", arrivalDate);
			query.setParameter("end1", end1);
			query.setParameter("end2", end2);
			flightList = query.getResultList();
			if (!flightList.isEmpty()) {
				f = flightList.get(0);
			}
			ConnectHibernate.after();

		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		} finally {
			ConnectHibernate.after();

		}
		return f;
	}
}
