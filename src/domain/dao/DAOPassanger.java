package domain.dao;

import java.util.List;

import javax.persistence.Query;
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
			session.save(passanger);
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


	@SuppressWarnings({ "unchecked" })
	public static List<Flight> loadPassangerFlights(int id){
		List<Flight> flightList = null;
		try{
			ConnectHibernate.before();
			session = ConnectHibernate.getSession();			
			Query query = session.createQuery("select p.flightList from Passanger as p where p.id ="+id);
			flightList = query.getResultList();
		}catch(Exception e){
			e.printStackTrace();
		}
		ConnectHibernate.after();		
		return flightList;
	}
	
	public static boolean updatePassanger(Passanger passanger){
		try{
			ConnectHibernate.before();			
			session = ConnectHibernate.getSession();
			session.getTransaction().begin();
			String hql="UPDATE Passanger"
					+ " SET firstName = '"+passanger.getFirstName()+"',"
					+ " lastName1 = '"+passanger.getLastName1()+"',"
					+ " lastName2 = '"+ passanger.getLastName2()+"',"
					+ " dni_passport = '"+passanger.getDni_passport()+"',"
					+ " homeTlf = '"+passanger.getHomeTlf()+"',"
					+ " movileTlf = '"+passanger.getMovileTlf()+"',"
					+ " email = '"+ passanger.getEmail()+"',"
					+ " birthDate = '"+passanger.getBirthDate()+"',"
					+ " username = '"+passanger.getUsername()+"',"
					+ " password = '"+passanger.getPassword()+"'"
					+ " WHERE passangerId = "+passanger.getPassangerId();
			Query query = session.createQuery(hql);
			query.executeUpdate();
			session.getTransaction().commit();		
		}catch(Exception e){			
			e.printStackTrace();
			return false;
		}
		ConnectHibernate.after();		
		return true;
	}
}
