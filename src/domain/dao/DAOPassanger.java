package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
import domain.model.Flight;
import domain.model.Passanger;

public class DAOPassanger {

private static Session session;
	
	
	public static boolean insertPassanger(Passanger passanger){
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			session.persist(passanger);
			session.getTransaction().commit();
			ConnectHibernate.after();
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;		
		}
	}

	
	public static boolean deletePassanger(Passanger passanger){
		try{
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			session.delete(passanger);
			ConnectHibernate.after();
			return true;
			
		}catch(Exception e){
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return false;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static Passanger loadPassanger(String username, String pass){
		List<Passanger> passangerList = null;
		Passanger p = new Passanger();
		p = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			TypedQuery<Passanger> query = session.createQuery("from Passanger where password='"+pass+"' and username='"+username+"'");
			passangerList = query.getResultList();
			if(!passangerList.isEmpty()){
				p=passangerList.get(0);
			}
			ConnectHibernate.after();
			
		}catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		}
		
		ConnectHibernate.after();
		return p;
	}


	@SuppressWarnings({ "unchecked", "deprecation" })
	public static List<Flight> loadPassangerFlights(int id){
		List<Flight> flightList = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();			
			flightList=session.createSQLQuery("SELECT * "
											+ " FROM (flight f JOIN booking b ON f.flightid=b.flightlist_flightid)"
											+ " JOIN passanger p ON p.passangerid=b.passangerlist_passangerid"
											+ " WHERE p.passangerid="+id).list();
		}catch(Exception e){
			e.printStackTrace();
		}
		ConnectHibernate.after();		
		return flightList;
	}
}
