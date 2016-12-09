package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.AirlineManager;

public class DAOAirlineManager {

	private static Session session;
	
	
	public static boolean insertAirlineManager(AirlineManager airlineManager){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(airlineManager); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
			session.getTransaction().commit();
			ConnectHibernate.after();
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;		
		}
	}
	
	public static boolean deleteAirlineManager(AirlineManager airlienManager){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(airlienManager);
			ConnectHibernate.after();
			return true;
			
		}catch(Exception e){
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;
		}
	}
	
	public static List<AirlineManager> loadAllAirlineManagers(){
		List<AirlineManager> airlineManagerList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<AirlineManager> query = session.createQuery("from AirlineManager");
		  	airlineManagerList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return airlineManagerList;	
	}
	
	@SuppressWarnings("unchecked")
	public static AirlineManager loadAirportController(String username, String pass){
		List<AirlineManager> managerList = null;
		AirlineManager aM = new AirlineManager();
		aM = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			TypedQuery<AirlineManager> query = session.createQuery("from AirlineManager where password='"+pass+"' and username='"+username+"'");
			managerList = query.getResultList();
			if(!managerList.isEmpty()){
				aM=managerList.get(0);
			}
			ConnectHibernate.after();
			
		}catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		}
		
		ConnectHibernate.after();
		return aM;
	}
}
