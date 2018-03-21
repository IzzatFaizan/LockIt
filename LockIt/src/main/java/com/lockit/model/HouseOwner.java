package com.lockit.model;

import java.util.List;

public class HouseOwner {
	
	private String userID;
	private String userName;
	private String password;
	private String email;
	private String ic;
	private List<String> phoneNumber;
	private List<String> phoneNumber2;
	
	public HouseOwner() {
	
	}

	public HouseOwner(String userID, String userName, String password, String email, String ic, List<String> phoneNumber) {
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.ic = ic;
		this.phoneNumber = phoneNumber;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIc() {
		return ic;
	}
	
	public void setIc(String ic) {
		this.ic = ic;
	}
	
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "HouseOwner [userID=" + userID + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", ic=" + ic + ", phoneNumber=" + phoneNumber + ", getUserID()=" + getUserID() + ", getUserName()="
				+ getUserName() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + ", getIc()="
				+ getIc() + ", getPhoneNumber()=" + getPhoneNumber() + "]";
	}
}
