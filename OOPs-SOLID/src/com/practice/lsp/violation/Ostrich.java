package com.practice.lsp.violation;

public class Ostrich extends Birds{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Ostrich can't fly");
	}
}
