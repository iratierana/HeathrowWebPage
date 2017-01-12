package databaseListener;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.PGConnection;
import org.postgresql.PGNotification;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer; 

// TODO: Auto-generated Javadoc
/**
 * The Class PGSocketIONotify.
 * Class that encapsulates a socketIO server
 */
public class PGSocketIONotify implements Runnable {
	
	/** The Constant LOCALHOST. */
	private static final String LOCALHOST = "localhost";
	
	/** The Constant SPLITTER. */
	private static final String SPLITTER = ">";


	/** The Constant LOOP_TIME. */
	private static final int LOOP_TIME = 500;
	
	/** The Constant PORT_NMBER. */
	private static final int PORT_NMBER = 9092;
	
	/** The pg conn. */
	private PGConnection pgConn;
	
	/** The conf. */
	private static Configuration conf;
	
	/** The server. */
	private static SocketIOServer server;

	/**
	 * Start.
	 */
	public static void start() {
		conf = new Configuration();
		conf.setHostname(LOCALHOST);
		conf.setPort(PORT_NMBER);
		server = new SocketIOServer(conf);
		server.start();

	}

	/**
	 * Stop.
	 */
	public static void stop() {
		server.stop();
	}

	/**
	 * Instantiates a new PG socket IO notify.
	 *
	 * @param conn the conn
	 * @param listenToArray the listen to array
	 * @throws SQLException the SQL exception
	 * @throws InterruptedException the interrupted exception
	 */
	public PGSocketIONotify(Connection conn, String[] listenToArray) throws SQLException, InterruptedException {

		this.pgConn = (PGConnection) conn;
		Statement listenStatement = conn.createStatement();
		// Ze mezu entzun bihar daben esan, nahi beste mezu entzun leike.
		for (String listenTo : listenToArray) {
			listenStatement.execute("LISTEN " + listenTo);

		}
		listenStatement.close();
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		while (true) {
			try {

				PGNotification notifications[] = pgConn.getNotifications();

				if (notifications != null) {
					for (PGNotification pgNotification : notifications) {
						
						String[] tableInfo = pgNotification.getParameter().split(SPLITTER);
						System.out.println(tableInfo[1]);
						server.getBroadcastOperations().sendEvent("database_change", tableInfo[1]);

					}
				}
				Thread.sleep(LOOP_TIME);
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	/**
	 * Send notification.
	 *
	 * @param receivingGroup the receiving group
	 * @param message the message
	 */
	public static void sendNotification(String receivingGroup, String message) {
		server.getBroadcastOperations().sendEvent(receivingGroup, message);
	}



}