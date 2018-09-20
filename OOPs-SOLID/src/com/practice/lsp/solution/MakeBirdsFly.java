package com.practice.lsp.solution;

public class MakeBirdsFly {
	public static void main(String[] args) {
		
		FlyingBirds flyingBirds = new FlyingBirds();
		flyingBirds.fly();
		
		flyingBirds = new Parrot();
		flyingBirds.fly();
	}
}