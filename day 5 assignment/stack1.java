package day5;

public class stack1 {
	private String firstname;
	private String middleName;
	private String dateOfbirth;
	private String gender;
	private String mobileNumber;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "stack1 [firstname=" + firstname + ", middleName=" + middleName + ", dateOfbirth=" + dateOfbirth
				+ ", gender=" + gender + ", mobileNumber=" + mobileNumber + "]";
	}
	

}
