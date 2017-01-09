package databaseListener;

import java.sql.Statement;

import com.impossibl.postgres.api.jdbc.PGConnection;
import com.impossibl.postgres.api.jdbc.PGNotificationListener;
import com.impossibl.postgres.jdbc.PGDataSource;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving myNotify events.
 * The class that is interested in processing a myNotify
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addMyNotifyListener</code> method. When
 * the myNotify event occurs, that object's appropriate
 * method is invoked.
 *
 * @see MyNotifyEvent
 */
public class MyNotifyListener extends Thread {

	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run() {
		listenToNotifyMessage();
	    }
	
	
	/**
	 * Listen to notify message.
	 */
	private void listenToNotifyMessage() {
	    PGDataSource dataSource = new PGDataSource();
	    PGNotificationListener listener = new PGNotificationListener() {
			
			@Override
			public void notification(int processId, String channelName, String payload) {
				String info[] = payload.split(",");
				System.out.println("The plane with id=" + info[0] + " is now in position=" + info[1]);	
				PositionFileUpdater.updatePlanePositionFromFile(Integer.valueOf(info[0]), Integer.valueOf(info[1]));
			}
		};
	    
	    dataSource.setHost("172.17.100.128");
	    dataSource.setPort(5432);
	    dataSource.setDatabase("HeathrowAirport");
	    dataSource.setUser("postgres");
	    dataSource.setPassword("1234");


	    try (PGConnection connection = (PGConnection) dataSource.getConnection()) {
	        Statement statement = connection.createStatement();
	        statement.execute("LISTEN watchers");
	        connection.addNotificationListener(listener);
	        statement.close();
	        while (true) { }
	        
	    } catch (Exception e) {
	        System.err.println(e);
	    }
	}
}
