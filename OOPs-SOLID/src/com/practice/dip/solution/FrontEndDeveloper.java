package com.practice.dip.solution;

public class FrontEndDeveloper implements Developer{
	
	@Override
	public void develop() {
		// TODO Auto-generated method stub
		writeJavaScript();
	}
	
	private void writeJavaScript() {
		System.out.println("Write JavaScript");
	}
}
