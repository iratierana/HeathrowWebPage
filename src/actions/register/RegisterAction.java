package actions.register;


public class RegisterAction {

	private Integer homeTlf;
	private Integer movileTlf;
	private String email;
	
	
	public String execute(){		
		return "register2";
	}
	
	
	
	//Getters and setters
	public Integer getHomeTlf() {
		return homeTlf;
	}
	public void setHomeTlf(Integer homeTlf) {
		this.homeTlf = homeTlf;
	}
	public Integer getMovileTlf() {
		return movileTlf;
	}
	public void setMovileTlf(Integer movileTlf) {
		this.movileTlf = movileTlf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
