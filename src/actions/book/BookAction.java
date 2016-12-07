package actions.book;

import java.util.Date;

public class BookAction {
	
	private String name;
	private String surname1;
	private String surname2;
	private String dniPassport;
	private Date BirthdayDate;
	private Integer homeTlf;
	private Integer movileTlf;
	private String email;
	
	public String execute(){
		return "book";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname1() {
		return surname1;
	}

	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}

	public String getSurname2() {
		return surname2;
	}

	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}

	public String getDniPassport() {
		return dniPassport;
	}

	public void setDniPassport(String dniPassport) {
		this.dniPassport = dniPassport;
	}

	public Date getBirthdayDate() {
		return BirthdayDate;
	}

	public void setBirthdayDate(Date birthdayDate) {
		BirthdayDate = birthdayDate;
	}

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
