package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.PlanePosition;

public class DAOPlanePosition {
	
private static Session session;
	
	
	public static boolean insertPlanePosition(PlanePosition planePosition){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(planePosition); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
			session.getTransaction().commit();
			ConnectHibernate.after();
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;		
		}
	}

	
	public static boolean deletePlanePosition(PlanePosition planePosition){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(planePosition);
			ConnectHibernate.after();
			return true;
			
		}catch(Exception e){
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;
		}
	}
	
	public static List<PlanePosition> loadAllPlanePositions() {
		List<PlanePosition> positionList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<PlanePosition> query = session.createQuery("from PlanePosition");
			positionList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return positionList;
	}

}
