package com.bac.dp.composite;

/**
 * 
 * @author Shahnawaz
 *
 */
public class Adder extends BinaryExpression {
	
	public Adder(Expression left, Expression right){
		super(left, right);
	}

	public double getValue() {
		return this.left.getValue() + this.right.getValue();
	}

}
