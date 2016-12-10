package actions.myProfile;


public class MyProfileAction {
	
	private String firstName;
	private String lastName1;
	private String lastName2;
	private String dniPassport;
	private String birthdayDate;
	private String homeTlf;
	private String movileTlf;
	private String email;
	
	
	public String execute(){
		return "myProfile";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName1() {
		return lastName1;
	}
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	public String getLastName2() {
		return lastName2;
	}
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	public String getDniPassport() {
		return dniPassport;
	}
	public void setDniPassport(String dniPassport) {
		this.dniPassport = dniPassport;
	}
	public String getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	public String getHomeTlf() {
		return homeTlf;
	}
	public void setHomeTlf(String homeTlf) {
		this.homeTlf = homeTlf;
	}
	public String getMovileTlf() {
		return movileTlf;
	}
	public void setMovileTlf(String movileTlf) {
		this.movileTlf = movileTlf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
