package domain.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.AirplanePhoto;

/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since 2016-12-13
 * 
 *        Class where are all the needed functions related with AirplanePhoto,
 *        in order to work with the database
 * 
 */
public class DAOAirplanePhoto {

	private static Session session;

	/**
	 * This function loads an airplane photo
	 * @param airplaneId The id of the photo to load
	 * @return The object of the airplane photo
	 */
	@SuppressWarnings("unchecked")
	public static AirplanePhoto loadAirplanePhoto(int airplaneId) {
		List<AirplanePhoto> photoList = null;
		AirplanePhoto photo = new AirplanePhoto();
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			Query query = session.createQuery("select photoList from Airplane where airplaneId =" + airplaneId);
			photoList = query.getResultList();
			for (AirplanePhoto p : photoList) {
				photo = p;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectHibernate.after();
		}
		
		return photo;
	}

}
