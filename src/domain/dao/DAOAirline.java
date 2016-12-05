package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.Airline;
import domain.model.Airplane;


public class DAOAirline {
	
	private static Session session;
	
	
	public static boolean insertAirline(Airline airline){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.save(airline); //erlazinuak itxen dianian save kendu eta persist ipinibiada eta eralazinuan cascade cascade type.persist
			session.getTransaction().commit();
			ConnectHibernate.after();
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;		
		}
	}
	
	public static List<Airplane> loadPlanesOfAirline(Airline airline){
		List<Airplane> airplaneList = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			//TODO Erlaziñuak eta datubasia ondo pini hau in baiño lenau
			return airplaneList;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	
	public static boolean deleteAirline(Airline airline){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(airline);
			ConnectHibernate.after();
			return true;
			
		}catch(Exception e){
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Airline> loadAllAirlines() {
		List<Airline> airlineList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			TypedQuery<Airline> query = session.createQuery("from Airline");
			airlineList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return airlineList;
	}
}
