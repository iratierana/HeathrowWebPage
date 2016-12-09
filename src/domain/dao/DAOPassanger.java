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
	
	@SuppressWarnings("unchecked")
	public static Passanger loadPassanger(Integer id){
		List<Passanger> passangerList = null;
		Passanger p = new Passanger();
		p = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			
			TypedQuery<Passanger> query = session.createQuery("from Passanger where passangerid="+id);
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
	
	@SuppressWarnings("unchecked")
	public static List<Passanger> loadAllPassangers() {
		List<Passanger> passangerList = null;
		try {
			
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			TypedQuery<Passanger> query = session.createQuery("from Passanger");
			passangerList = query.getResultList();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectHibernate.after();

		
		return passangerList;
	}

	@SuppressWarnings("unchecked")
	public static List<Passanger> loadAllPassangersFromOneCity(String city){
		List<Passanger> passangerList = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();
			TypedQuery<Passanger> query = session.createQuery("from passanger p join direction d on p.direction_directionid=d.directionid where d.city='"+city+"'");
			passangerList = query.getResultList();
		}catch(Exception e){
			
		}
		ConnectHibernate.after();		
		return passangerList;
	}

}
