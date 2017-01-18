package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.AirlineManager;


/**
 * The Class DAOAirlineManager.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 *
 * Class where are all the needed functions related
 * with AirlineManager, in order to work with the database
 */
public class DAOAirlineManager {

	/** The session. */
	private static Session session;

	/**
	 * This function load an airline manager from the database.
	 *
	 * @param username the usename of the irline manager
	 * @param pass the username of the airline manager
	 * @return the airline manager if the manager exists else null.
	 */
	@SuppressWarnings("unchecked")
	public static AirlineManager loadAirLineManager(final String username, final String pass) {
		List<AirlineManager> managerList = null;
		AirlineManager aM = new AirlineManager();
		aM = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();

			TypedQuery<AirlineManager> query = session.createQuery("from AirlineManager where password='" + pass + "' and username='" + username + "'");
			managerList = query.getResultList();
			if (!managerList.isEmpty()) {
				aM = managerList.get(0);
			}
			ConnectHibernate.after();

		} catch (Exception e) {
			session.getTransaction().rollback();
			return null;
		} finally {
			ConnectHibernate.after();
		}

		ConnectHibernate.after();
		return aM;
	}
}
