package databaseListener;
import java.sql.Statement;

import com.impossibl.postgres.api.jdbc.PGConnection;
import com.impossibl.postgres.api.jdbc.PGNotificationListener;
import com.impossibl.postgres.jdbc.PGDataSource;

public class MyNotifyListener extends Thread {

	public void run(){
		listenToNotifyMessage();
	    }
	
	
	private void listenToNotifyMessage() {
	    PGDataSource dataSource = new PGDataSource();
	    PGNotificationListener listener = new PGNotificationListener() {
			
			@Override
			public void notification(int processId, String channelName, String payload) {
				String info[] = payload.split(",");
				System.out.println("The plane with id="+info[0]+" is now in position=" + info[1]);				
			}
		};
	    
	    dataSource.setHost("localhost");
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
