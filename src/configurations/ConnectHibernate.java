package configurations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


// TODO: Auto-generated Javadoc
/**
 * The Class ConnectHibernate.
 *
 * @author Xabier Jauregi
 * @author Irati Erana
 * @author Mikel Arizmendiarrieta
 * @version 1.0
 * @since   2016-12-13
 * 
 * Class where are all the needed functions 
 * related with the connection with the database.
 */
public class ConnectHibernate {
	
	/** The session factory. */
	private static SessionFactory sessionFactory;
	
	/** The session. */
	private static Session session;
	
	/** The Constant CONFIG_FILE. */
	private final static String CONFIG_FILE = "configurations/hibernate.cfg.xml";
	
	/**
	 * This function create or opens the remote connection(session) 
	 * with the database, loading the configuration file.
	 */
	public static void before() {
		
		sessionFactory  = new Configuration().
				configure(CONFIG_FILE).buildSessionFactory();
		session = sessionFactory.openSession();
		
	}
	
	/**
	 * This function close or kills the connection(session) with the database.
	 */
	public static void after() {
		
		session.close();
		sessionFactory.close();
		
	}

	/**
	 * Gets the session factory.
	 *
	 * @return the session factory
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Sets the session factory.
	 *
	 * @param sessionFactory the new session factory
	 */
	public static void setSessionFactory(SessionFactory sessionFactory) {
		ConnectHibernate.sessionFactory = sessionFactory;
	}

	/**
	 * Gets the session.
	 *
	 * @return the session
	 */
	public static Session getSession() {
		return session;
	}

	/**
	 * Sets the session.
	 *
	 * @param session the new session
	 */
	public static void setSession(Session session) {
		ConnectHibernate.session = session;
	}

}
