package com.practice.lsp.violation;

public class MakeBirdsFly {
	
	public static void main(String[] args) {
		
		Birds bird = new Birds();
		bird.fly();
		
		bird = new Parrot();
		bird.fly();
		
		bird = new Ostrich();
		bird.fly();
		//Here Ostrich's fly method is throwing an exception.
		//Which is a violation of LSP
	}
}
