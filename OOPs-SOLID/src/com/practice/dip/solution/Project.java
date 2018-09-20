package com.practice.dip.solution;

public class Project {
	
	public static void main(String[] args) {
		Developer developer;
		
		developer = new BackEndDeveloper();
		developer.develop();
		
		developer = new FrontEndDeveloper();
		developer.develop();
	}

}
