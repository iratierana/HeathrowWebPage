package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.Airplane;


/**
 * The Class DAOAirplane.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 *
 * Class where are all the needed functions related with Airplane,
 *  in order to work with the database
 */

public class DAOAirplane {

/** The session. */
private static Session session;

	/**
	 * This function delete an airplane from the database.
	 *
	 * @param airplane the airplane to delete from the database
	 * @return true if the delete is correct
	 * false if and error occurs during the delete
	 */
	@SuppressWarnings("rawtypes")
	public static boolean deleteAirplane(final Airplane airplane) {
		String sql1 = "DELETE FROM controlairplane WHERE airplanelist_airplaneid = " + airplane.getAirplaneId();
		String sql2 = "DELETE FROM airplanephoto WHERE airplane_id = " + airplane.getAirplaneId();
		String sql3 = "DELETE FROM airplane WHERE airplaneid = " + airplane.getAirplaneId();
		try {

			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
//			session.delete(airplane);
			SQLQuery query1 = session.createSQLQuery(sql1); query1.executeUpdate();
			SQLQuery query2 = session.createSQLQuery(sql2); query2.executeUpdate();
			SQLQuery query3 = session.createSQLQuery(sql3); query3.executeUpdate();

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
	 * Load all the plains that airline manager manage.
	 *
	 * @param id The id of the airline manager
	 * @return airplaneList if the load was OK
	 * null if an error occurs
	 */
	@SuppressWarnings({ "rawtypes",  "unchecked" })
	public static List<Airplane> loadAirplanesOfAirline(final int id) {
		List<Airplane> airplaneList = null;
		String sql = "SELECT airpl.*"
				+ " FROM (airlinemanager man join airline air on man.airline_airlineid=air.airlineid)join airplane airpl on airpl.airline_airlineid=air.airlineid"
				+ " WHERE man.airlinemanagerid=" + id;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();

			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Airplane.class);
			airplaneList = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectHibernate.after();

		}

		return airplaneList;
	}

	/**
	 * This function loads and airplane.
	 * @param id The id of the airplane to load frm the databse
	 * @return The object airplane
	 */
	public static Airplane loadAirplane(final int id) {
		List<Airplane> airplaneList = null;
		Airplane a = new Airplane();
		a = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();

			@SuppressWarnings("unchecked")
			TypedQuery<Airplane> query = session.createQuery("from Airplane where airplaneId=" + id);
			airplaneList = query.getResultList();
			if (!airplaneList.isEmpty()) {
				a = airplaneList.get(0);
			}
			ConnectHibernate.after();

		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		} finally {
			ConnectHibernate.after();

		}

		return a;
	}

	/**
	 * This function updates an airplane in the database.
	 * @param airplane The airplane object to update
	 * @return true if all is OK, else false
	 */
	public static boolean updateAirplane(final Airplane airplane) {
		Airplane auxAirplane = null;
		try {
			auxAirplane = DAOAirplane.loadAirplane(airplane.getAirplaneId());
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			auxAirplane.setName(airplane.getName());
			auxAirplane.setSerialNumb(airplane.getSerialNumb());
			session.saveOrUpdate(auxAirplane);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		ConnectHibernate.after();
		return true;
	}

}