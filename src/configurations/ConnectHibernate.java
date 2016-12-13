package configurations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * 
 * @author Xabier Jauregi
 * @author Irati Eraña
 * @author Mikel Arizmendiarrieta 
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions related with the connection with the database.
 *  
 */
public class ConnectHibernate {
	
	private static SessionFactory sessionFactory;
	private static Session session;
	private final static String CONFIG_FILE = "configurations/hibernate.cfg.xml";
	
	/**
	 * This function create or opens the remote connection(session) with the database, loading the configuration file
	 */
	public static void before(){
		
		sessionFactory  = new Configuration().
				configure(CONFIG_FILE).buildSessionFactory();
		session= sessionFactory.openSession();
		
	}
	
	/**
	 * This function close or kills the connection(session) with the database
	 */
	public static void after(){
		
		session.close();
		sessionFactory.close();
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		ConnectHibernate.sessionFactory = sessionFactory;
	}

	public static Session getSession() {
		return session;
	}

	public static void setSession(Session session) {
		ConnectHibernate.session = session;
	}

}
