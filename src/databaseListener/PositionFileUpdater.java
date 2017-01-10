package databaseListener;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class PositionFileUpdater.
 */
public class PositionFileUpdater {
	
	/** The file route. */
	//public static String fileRoute = "D:/Uni3/1Semester/POPBL5/Code Workspace/HeathrowWebPage/WebContent/data/planeMarkerData.csv";
	public static String fileRoute = "http://localhost/HeathrowAirport/data/planeMarkerData.csv";

	/**
	 * Update plane position from file.
	 *
	 * @param planeId the plane id
	 * @param newPositionId the new position id
	 */
	public static void updatePlanePositionFromFile(int planeId, int newPositionId) {
		ArrayList<PositioningModel> posList = null;

		if (newPositionId == 1) {
			posList = readCsvFile(fileRoute);
			PositioningModel newPos = PositionMapper.decodePosition(planeId, newPositionId);
			posList.add(newPos);
			writeCsvFile(fileRoute, posList);
			
		} else if ((newPositionId > 1) && (newPositionId < 41)) {
			
			posList = readCsvFile(fileRoute);
			for (int kont = 0; kont < posList.size(); kont++) {
				if (posList.get(kont).getPlaneId() == planeId) {
					posList.remove(kont);
					posList.add(PositionMapper.decodePosition(planeId, newPositionId));
				}
			}
			writeCsvFile(fileRoute, posList);	
			
		} else if (newPositionId == 41) {

			posList = readCsvFile(fileRoute);
			for (int kont = 0; kont < posList.size(); kont++) {
				if (posList.get(kont).getPlaneId() == planeId) {
					posList.remove(kont);
				}
			}
			writeCsvFile(fileRoute, posList);
			
		}

	}

	
	/**
	 * Read csv file.
	 *
	 * @param fileName the file name
	 * @return the array list
	 */
	public static ArrayList<PositioningModel> readCsvFile(final String fileName) {
		
		BufferedReader fileReader = null;

		try {
			ArrayList<PositioningModel> posList = new ArrayList<PositioningModel>();
			String line = "";
			fileReader = new BufferedReader(new FileReader(fileName));
			fileReader.readLine();
			 while ((line = fileReader.readLine()) != null) {
				 String[] tokens = line.split(",");
				 String aux = tokens[0].substring(1, tokens[0].length() - 1);
				 if (tokens.length > 0) {					 
					 PositioningModel posMod = new PositioningModel(Integer.valueOf(aux), Double.valueOf(tokens[1]), Double.valueOf(tokens[2]));
					 posList.add(posMod);
				 }
			 }
			 return posList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				fileReader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

	/**
	 * Write csv file.
	 *
	 * @param fileName the file name
	 * @param posList the pos list
	 */
	public static void writeCsvFile(String fileName, ArrayList<PositioningModel> posList) {
		FileWriter fileWriter = null;
		String FILE_HEADER = "\"id\",\"lat\",\"lon\"";

		
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append("\n");
			int kont = 0;
			for (PositioningModel pM : posList) {
				kont++;
				fileWriter.append("\"");
				fileWriter.append(String.valueOf(pM.getPlaneId()));
				fileWriter.append("\"");
				fileWriter.append(",");
				fileWriter.append(String.valueOf(pM.getLatitude()));
				fileWriter.append(",");
				fileWriter.append(String.valueOf(pM.getLongitude()));
				if (posList.size() != kont) {
					fileWriter.append("\n");
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
