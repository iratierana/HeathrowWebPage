package domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class AirplanePhoto {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer photoId;
	
	@NotNull
	private String photo;
	
	@NotNull
	private Date photoDate;
	
	@NotNull
	private String photographer;
	
	@OneToOne
	private Airplane airplane;
	
	
	

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Integer getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getPhotoDate() {
		return photoDate;
	}

	public void setPhotoDate(Date photoDate) {
		this.photoDate = photoDate;
	}

	public String getPhotographer() {
		return photographer;
	}

	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}

	
}
