package com.practice.srp.solution;

public class VerifyUser {

	public void verifyUser(User user) {
		
		boolean isVerified = user.isVerified();
		
		if(isVerified) {
			System.out.println("User already verified");
		}
		else {
			user.setVerified(true);
			System.out.println("User Verification Completed");
		}
	}
}