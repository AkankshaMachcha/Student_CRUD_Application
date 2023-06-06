package com.model;

public class Student {
	private String FirstName;
	private String FatherName;
	private String LastName;
	private String email;
	private String password;
	private String telephone;
	private String DateOfBirth;
	private String address;
	private String city;
	private String state;
	private String Zipcode;
	private String stdId;
	public Student(String firstName, String fatherName, String lastName, String email, String password, String telephone,
			String dateOfBirth, String address, String city, String state, String zipcode) {
		super();
		FirstName = firstName;
		FatherName = fatherName;
		LastName = lastName;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		DateOfBirth = dateOfBirth;
		this.address = address;
		this.city = city;
		this.state = state;
		Zipcode = zipcode;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", FatherName=" + FatherName + ", LastName=" + LastName + ", email="
				+ email + ", password=" + password + ", telephone=" + telephone + ", DateOfBirth=" + DateOfBirth
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", Zipcode=" + Zipcode + ", stdId="
				+ stdId + "]";
	}
	
	

}
