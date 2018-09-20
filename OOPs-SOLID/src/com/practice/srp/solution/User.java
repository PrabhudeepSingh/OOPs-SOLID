package com.practice.srp.solution;

public class User {
	
	private String userName;
	private String userEmail;
	private boolean isVerified;
	
	public User(String userName, String userEmail) {
		this.userName = userName;
		this.userEmail = userEmail;
		isVerified = false;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	
}