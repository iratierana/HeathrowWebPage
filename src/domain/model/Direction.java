package domain.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Direction {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer directionId;
	
	@NotNull
	private String state;
	
	@NotNull
	private String city;
	
	@NotNull
	private String codPost;
	
	@NotNull
	private String address;
	

	public Integer getDirectionId() {
		return directionId;
	}

	public void setDirectionId(Integer directionId) {
		this.directionId = directionId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCodPost() {
		return codPost;
	}

	public void setCodPost(String codPost) {
		this.codPost = codPost;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
