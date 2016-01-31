package com.bac.dp.composite;

abstract public class BinaryExpression implements Expression {
	
	protected Expression left;
	protected Expression right;
	
	public BinaryExpression(Expression left, Expression right){
		this.left = left;
		this.right = right;
	}

	abstract public double getValue();

}