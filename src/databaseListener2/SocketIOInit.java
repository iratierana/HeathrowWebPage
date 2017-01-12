package databaseListener2;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import databaseListener2.Notification;

// TODO: Auto-generated Javadoc
/**
 * The Class SocketIOInit.
 * Initializer and disposer of the notificatoion service
 */
public class SocketIOInit implements ServletContextListener {

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			Notification.stop();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			Notification.start();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
