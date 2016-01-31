package com.bac.dp.composite;

public class Constant implements Expression {
	
	private double testValue;

	public Constant(double testValue){
		this.testValue = testValue;
	}

	public double getValue() {
		return this.testValue;
	}

}
