package databaseListener;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PositionFileUpdater {

	public static void updatePlanePositionFromFile(int planeId, int newPositionId) {
		ArrayList<PositioningModel> posList = null;

		if (newPositionId == 1) {
			
			posList = readCsvFile("WebContent/data/planeMarkerData.csv");
			PositioningModel newPos = PositionMapper.decodePosition(planeId, newPositionId);
			posList.add(newPos);
			writeCsvFile("WebContent/data/planeMarkerData.csv", posList);
			
		} else if ((newPositionId > 1) && (newPositionId < 41)) {
			
			posList = readCsvFile("WebContent/data/planeMarkerData.csv");
			for(int kont=0; kont<posList.size(); kont++){
				if(posList.get(kont).getPlaneId() == planeId){
					posList.remove(kont);
					posList.add(PositionMapper.decodePosition(planeId, newPositionId));
				}
			}
			writeCsvFile("WebContent/data/planeMarkerData.csv", posList);	
			
		} else if (newPositionId == 41) {

			posList = readCsvFile("WebContent/data/planeMarkerData.csv");
			for(int kont=0; kont<posList.size(); kont++){
				if(posList.get(kont).getPlaneId() == planeId){
					posList.remove(kont);
				}
			}
			writeCsvFile("WebContent/data/planeMarkerData.csv", posList);
			
		}

	}

	
	public static ArrayList<PositioningModel> readCsvFile(String fileName){
		
		BufferedReader fileReader = null;

		try{
			ArrayList<PositioningModel> posList = new ArrayList<PositioningModel>();
			String line = "";
			fileReader = new BufferedReader(new FileReader(fileName));
			fileReader.readLine();
			 while ((line = fileReader.readLine()) != null){
				 String[] tokens = line.split(",");
				 if (tokens.length > 0){
					 PositioningModel posMod = new PositioningModel(Integer.valueOf(tokens[0]), Double.valueOf(tokens[1]), Double.valueOf(tokens[2]));
					 posList.add(posMod);
				 }
			 }
			 return posList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				fileReader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

	public static void writeCsvFile(String fileName, ArrayList<PositioningModel> posList){
		FileWriter fileWriter = null;
		String FILE_HEADER = "id,lat,lon";

		
		try{
			fileWriter = new FileWriter(fileName);
			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append("\n");
			for(PositioningModel pM : posList){
				fileWriter.append(String.valueOf(pM.getPlaneId()));
				fileWriter.append(",");
				fileWriter.append(String.valueOf(pM.getLatitude()));
				fileWriter.append(",");
				fileWriter.append(String.valueOf(pM.getLongitude()));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
