package com.bac.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bac.dp.composite.Adder;
import com.bac.dp.composite.Constant;
import com.bac.dp.composite.Divider;
import com.bac.dp.composite.Expression;
import com.bac.dp.composite.Multiplier;
import com.bac.dp.composite.Substracter;

/**
 * 
 * @author Shahnawaz
 *
 */
public class CompositeTest {
	
	@Test
	public void testConstant(){
		double testVal = 3.0;
		Expression expr = new Constant(testVal);
		assertEquals(testVal, expr.getValue(), 0.0);
	}
	
	@Test
	public void testAdder(){
		double testValA = 2.0;
		double testValB = 3.0;
		Expression left = new Constant(testValA);
		Expression right = new Constant(testValB);
		Expression expr = new Adder(left, right);
		assertEquals((testValA+testValB), expr.getValue(), 0.0);
		
	}
	
	@Test
	public void testSubstracter(){
		double testValA = 5.0;
		double testValB = 3.0;
		Expression left = new Constant(testValA);
		Expression right = new Constant(testValB);
		Expression expr = new Substracter(left, right);
		assertEquals((testValA-testValB), expr.getValue(), 0.0);
		
	}
	
	@Test
	public void testMultiplier(){
		double testValA = 5.0;
		double testValB = 3.0;
		Expression left = new Constant(testValA);
		Expression right = new Constant(testValB);
		Expression expr = new Multiplier(left, right);
		assertEquals((testValA*testValB), expr.getValue(), 0.0);
		
	}
	
	@Test
	public void testDivider(){
		double testValA = 5.0;
		double testValB = 3.0;
		Expression left = new Constant(testValA);
		Expression right = new Constant(testValB);
		Expression expr = new Divider(left, right);
		assertEquals((testValA/testValB), expr.getValue(), 0.0);
		
	}
	
	@Test
	public void testComplexExpression(){
		double testExpression = (4.0 + 1.0)*5.0/(3.0+2.0);
		Expression expr = new Divider(new Multiplier(new Adder(new Constant(4.0), new Constant(1.0)), new Constant(5.0)), 
				new Adder(new Constant(3.0), new Constant(2.0)));
		assertEquals(testExpression, expr.getValue(), 0.0);
		
	}

}
