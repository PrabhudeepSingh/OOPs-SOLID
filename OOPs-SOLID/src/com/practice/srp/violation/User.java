package com.practice.srp.violation;

public class User {
	
	private String userName;
	private String userEmail;
	private boolean isVerified;
	
	public User(String userName, String userEmail) {
		this.userName = userName;
		this.userEmail = userEmail;
		isVerified = false;
	}

	//It is not a user's responsibility to verify
	public void verifyUser() {
		isVerified = true;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
