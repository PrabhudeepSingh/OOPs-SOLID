package com.practice.dip.violation;

public class Project {
	BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
	FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
	
	public void writeCode() {
		backEndDeveloper.writeJava();
		frontEndDeveloper.writeJavaScript();
	}
}
