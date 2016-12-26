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
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with AirplanePhoto, in order to work with the database
 *  
 */
public class DAOAirplanePhoto {


	private static Session session;
	
	@SuppressWarnings("unchecked")
	public static List<AirplanePhoto> loadAirplanePhotoList(int airplaneId){
		List<AirplanePhoto> flightList = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();			
			Query query = session.createQuery("select photoList from Airplane where airplaneId ="+airplaneId);
			flightList = query.getResultList();
//			ImageWrapper imgNew = (ImageWrapper)session.get(ImageWrapper.class, 1);
//			byte[] bAvatar = imgNew.getData();
//			 
//			try{
//			    FileOutputStream fos = new FileOutputStream("C:\temp\test.png"); 
//			    fos.write(bAvatar);
//			    fos.close();
//			}catch(Exception e){
//			    e.printStackTrace();
//			}
		}catch(Exception e){
			e.printStackTrace();
		}
		ConnectHibernate.after();		
		return flightList;
	}

}
