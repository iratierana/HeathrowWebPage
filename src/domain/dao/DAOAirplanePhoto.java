package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.AirplanePhoto;

public class DAOAirplanePhoto {
	
private static Session session;
	
	
	public static boolean insertAirplanePhoto(AirplanePhoto photo){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(photo); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
			session.getTransaction().commit();
			ConnectHibernate.after();
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;		
		}
	}

	
	public static boolean deleteAirplanePhoto(AirplanePhoto photo){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(photo);
			ConnectHibernate.after();
			return true;
			
		}catch(Exception e){
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;
		}
	}
	
	public static List<AirplanePhoto> loadAllAirplanePhotos() {
		List<AirplanePhoto> photoList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<AirplanePhoto> query = session.createQuery("from AirplanePhoto");
			photoList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return photoList;
	}

}
