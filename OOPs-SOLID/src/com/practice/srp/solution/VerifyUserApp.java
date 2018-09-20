package com.practice.srp.solution;

public class VerifyUserApp {
	public static void main(String[] args) {
		
		User user = new User("Prabhudeep Singh", "prabhudeepsb@gmail.com");
		VerifyUser verifyUser = new VerifyUser();
		
		System.out.println("isVerified user: "+user.isVerified());
		verifyUser.verifyUser(user);
		System.out.println("isVerified user: "+user.isVerified());
		verifyUser.verifyUser(user);
	}
}
