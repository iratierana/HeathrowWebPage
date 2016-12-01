package hibernateDAOtests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import domain.dao.DAOAirplanePhoto;
import domain.model.AirplanePhoto;


public class TestDAOAirplanePhoto {
	
	@Test
	public void insertAirplanePhotoWithAllParameters(){
		
		AirplanePhoto aP= new AirplanePhoto();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		boolean result;
		
		Date d;
		try {
			d = sdf.parse("28/08/1996");
			
			aP.setPhoto("thePhotoURL");
			aP.setPhotoDate(d);
			aP.setPhotographer("Irati");
			aP.setPhotoId(1);
			
			result = DAOAirplanePhoto.insertAirplanePhoto(aP);
			
			assertTrue("Error inserting the airplane photo", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void insertAirplanePhotoWithoutAuthor(){
		AirplanePhoto aP= new AirplanePhoto();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		boolean result;
		
		Date d;
		try {
			d = sdf.parse("28/08/1996");
			
			aP.setPhoto("thePhotoURL");
			aP.setPhotoDate(d);
			aP.setPhotographer(null);
			aP.setPhotoId(1);
			
			result = DAOAirplanePhoto.insertAirplanePhoto(aP);
			
			assertFalse("Error inserting the airplane photo", result);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void deleteAirplanePhoto(){
		
		AirplanePhoto aP = new AirplanePhoto();
		boolean result;
		
		aP.setPhotoId(1);
		
		result = DAOAirplanePhoto.deleteAirplanePhoto(aP);
		
		assertTrue("Error deleting the airplane photo", result);
	}
	
	@Test
	public void deleteAirplanePhotoWithNullObject(){
		
		boolean result;
				
		result = DAOAirplanePhoto.deleteAirplanePhoto(null);
		
		assertFalse("Error deleting the airplane photo", result);
		
	}
	
	@Test
	public void loadAllPhotos(){
		assertNotNull("Error loading all the photos", DAOAirplanePhoto.loadAllAirplanePhotos());
	}

}
