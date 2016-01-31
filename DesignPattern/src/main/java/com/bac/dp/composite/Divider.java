package com.bac.dp.composite;

public class Divider extends BinaryExpression {
	
	public Divider(Expression left, Expression right){
		super(left, right);
	}

	public double getValue() {
		return this.left.getValue() / this.right.getValue();
	}

}
