package domain.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import configurations.ConnectHibernate;
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
 * Class where are all the needed functions related with Airplane, in order to work with the database
 *  
 */
public class DAOAirplane {
	
private static Session session;
	
/**
 * 
 * This function insert aan airplane in the database
 * 
 * @param airplane the airplane to insert in the database
 * @return true if the insert is correct
 * @return false if and error occurs during the insert
 */
	public static boolean insertAirplane(Airplane airplane){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(airplane); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
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
	 * This function delete an airplane from the database
	 * 
	 * @param airplane the airplane to delete from the database
	 * @return true if the delete is correct
	 * @return false if and error occurs during the delete
	 */
	public static boolean deleteAirplane(Airplane airplane){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(airplane);
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
	 * This function load all the Airplanes of the database
	 * 
	 * @return the list if the load is correct
	 * @return null if and error occurs during the load
	 */
	public static List<Airplane> loadAllAirplanes() {
		List<Airplane> airplaneList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<Airplane> query = session.createQuery("from Airplane");
			airplaneList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return airplaneList;
	}
	
	
	/**
	 * Load all the plains that airline manager manage
	 * @param id The id of the airline manager 
	 * @return airplaneList if the load was OK
	 * @return null if an error occurs
	 */
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static List<Airplane> loadAirplanesOfAirline(int id) {
//		List<Airplane> airplaneList = null;
		List <Airplane> airplaneList = null;
		String sql="SELECT airpl.*"
				+ " FROM (airlinemanager man join airline air on man.airlinemanagerid=air.airlineid)join airplane airpl on airpl.airplaneid=air.airlineid"
				+ " WHERE man.airlinemanagerid="+id;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Airplane.class);
			airplaneList = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return airplaneList;
	}
	
	public static Airplane loadAirplane (int id){
		List<Airplane> airplaneList = null;
		Airplane a = new Airplane();
		a = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			TypedQuery<Airplane> query = session.createQuery("from Airplane where airplaneId="+id);
			airplaneList = query.getResultList();
			if(!airplaneList.isEmpty()){
				a=airplaneList.get(0);
			}
			ConnectHibernate.after();
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		}
		
		ConnectHibernate.after();
		return a;
	}
	
	public static boolean updateAirplane(Airplane airplane){
		Airplane auxAirplane = null;
		try{
			auxAirplane=DAOAirplane.loadAirplane(airplane.getAirplaneId());
			ConnectHibernate.before();			
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			auxAirplane.setName(airplane.getName());
			auxAirplane.setSerialNumb(airplane.getSerialNumb());
			session.saveOrUpdate(auxAirplane);
			session.getTransaction().commit();		
		}catch(Exception e){			
			e.printStackTrace();
			return false;
		}
		ConnectHibernate.after();		
		return true;
	}

}