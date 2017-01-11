package configurations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestConnectHibernate.
 */
public class TestConnectHibernate {

	/** The connect hibernate. */
	ConnectHibernate connectHibernate;

	
	/**
	 * Test function before.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testFunctionBefore() {
		connectHibernate = new ConnectHibernate();
		connectHibernate.before();
		
		assertNotNull("The sessionFactory was not initilized", connectHibernate.getSessionFactory());
		assertNotNull("The session was not initilized", connectHibernate.getSession());
	}
	
	/**
	 * Test function after.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testFunctionAfter() {
		connectHibernate = new ConnectHibernate();
		connectHibernate.before();
		connectHibernate.after();
		
		Session s = connectHibernate.getSession();
		SessionFactory sf = connectHibernate.getSessionFactory();
				
		assertFalse("The sessionFactory was not closed", s.isOpen());
		assertFalse("The session was not closed", sf.isOpen());
	}

}
