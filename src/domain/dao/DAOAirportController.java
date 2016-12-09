package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.AirportController;

public class DAOAirportController {
	
private static Session session;
	
	
	public static boolean insertAirportController(AirportController aController){
		try {
			
			ConnectHibernate.before(); 
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(aController); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
			session.getTransaction().commit();
			ConnectHibernate.after();
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;		
		}
	}

	
	public static boolean deleteAirportController(AirportController aController){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(aController);
			ConnectHibernate.after();
			return true;
			
		}catch(Exception e){
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;
		}
	}
	
	public static List<AirportController> loadAllAirportControllers() {
		List<AirportController> cotrollerList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<AirportController> query = session.createQuery("from AirportController");
			cotrollerList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return cotrollerList;
	}

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
