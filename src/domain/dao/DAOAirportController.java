package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.AirportController;


/**
 * 
 * @author Xabier Jauregi
 * @author Irati Era�a
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with AirportController, in order to work with the database
 *  
 */
public class DAOAirportController {
	
private static Session session;
	
	/**
	 * 
	 * This function loads a specific airport controller
	 * 
	 * @param username the username of the airport controller
	 * @param pass the password of the airport controller
	 * @return th object of the airport controller, else null
	 */
	@SuppressWarnings("unchecked")
	public static AirportController loadAirportController(String username, String pass){
		List<AirportController> controllerList = null;
		AirportController aC = new AirportController();
		aC = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			TypedQuery<AirportController> query = session.createQuery("from AirportController where password='"+pass+"' and username='"+username+"'");
			controllerList = query.getResultList();
			if(!controllerList.isEmpty()){
				aC=controllerList.get(0);
			}
			ConnectHibernate.after();
			
		}catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		}
		
		ConnectHibernate.after();
		return aC;
	}
}
