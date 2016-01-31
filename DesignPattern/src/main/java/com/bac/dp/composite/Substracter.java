package com.bac.dp.composite;

public class Substracter extends  BinaryExpression {
	
	public Substracter(Expression left, Expression right){
		super(left, right);
	}

	public double getValue() {
		return this.left.getValue()-this.right.getValue();
	}

}
