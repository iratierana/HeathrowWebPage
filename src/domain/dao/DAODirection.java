package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.Direction;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with Direction, in order to work with the database
 *  
 */
public class DAODirection {
	
private static Session session;
	
	/**
	 * 
	 * This function insert a direction in the database
	 * 
	 * @param direction the direction to insert in the database
	 * @return true if the insert is correct
	 * @return false if and error occurs during the insert
	 */
	public static boolean insertDirection(Direction direction){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(direction); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
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
	 * This function delete a direction from the database
	 * 
	 * @param direction the direction to delete from the database
	 * @return true if the delete is correct
	 * @return false if and error occurs during the delete
	 */
	public static boolean deleteDirection(Direction direction){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(direction);
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
	 * This function load all the directions of the database
	 * 
	 * @return the list of directions if the load is correct
	 * @return null if an error occurs during the load
	 */
	public static List<Direction> loadAllDirections() {
		List<Direction> dirList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<Direction> query = session.createQuery("from Direction");
			dirList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return dirList;
	}

}
