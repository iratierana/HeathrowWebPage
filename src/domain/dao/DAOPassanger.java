package domain.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import configurations.ConnectHibernate;
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
	
	public static Passanger loadPassanger(Integer id){
		Passanger p = new Passanger();
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			p = (Passanger) session.load(Passanger.class, id);
		
			ConnectHibernate.after();
			
		}catch (Exception e) {
			session.getTransaction().rollback();
			ConnectHibernate.after();
			return null;
		}
		
		ConnectHibernate.after();
		return p;
	}
	
	public static List<Passanger> loadAllPassangers() {
		List<Passanger> passangerList = null;
		try {
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			@SuppressWarnings("unchecked")
			TypedQuery<Passanger> query = session.createQuery("from Passanger");
			passangerList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return passangerList;
	}
}
