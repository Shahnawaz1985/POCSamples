package com.bac.dp.composite;

/**
 * 
 * @author Shahnawaz
 *
 */
public class Multiplier extends BinaryExpression {
	
	public Multiplier(Expression left, Expression right){
		super(left, right);
	}

	public double getValue() {
		return this.left.getValue() * this.right.getValue();
	}

}
