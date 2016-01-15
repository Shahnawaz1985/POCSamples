package com.bac.csd;

import org.junit.Assert;
import org.junit.Test;
import com.bt.util.CustomArithematicException;
import com.bt.util.EmptyStringException;

public class TDDTest {
	
	@Test
	public void testRPNforAdd(){
		String testString = "5 1 +";
		RPNCalculator rpnCalculator = new RPNCalculator();
		Assert.assertEquals(6, rpnCalculator.processResult(testString));
	}
	
	@Test
	public void testRPNUnary(){
		String inputString = "4 ++";
		RPNCalculator rpnCalculator = new RPNCalculator();
		Assert.assertEquals(5, rpnCalculator.processResult(inputString));
	}
	
	@Test
	public void testRPNforSubstract(){
		//String testString = "5 1 2 + 4 * + 3 -";
		String testString = "5 1 -";
		RPNCalculator rpnCalculator = new RPNCalculator();
		Assert.assertEquals(4, rpnCalculator.processResult(testString));
	}
	
	@Test
	public void testRPNforMultiply(){
		String testString = "5 1 *";
		RPNCalculator rpnCalculator = new RPNCalculator();
		Assert.assertEquals(5, rpnCalculator.processResult(testString));
	}

	@Test
	public void testRPNforDivide(){
		String testString = "6 2 /";
		RPNCalculator rpnCalculator = new RPNCalculator();
		Assert.assertEquals(3, rpnCalculator.processResult(testString));
	}
	
	@Test
	public void testRPNforException() throws CustomArithematicException{
		String testString = "6 0 /";
		try
		{
		RPNCalculator rpnCalculator = new RPNCalculator();
		rpnCalculator.processResult(testString);
		}catch(Exception ex){
			Assert.assertEquals("Divide by 0 is not allowed.", ex.getMessage());
		}
	}
	
	@Test
	public void testRPNForNegativeNumbers(){
		String testString = "-2 -3 -";
		RPNCalculator rpnCalculator = new RPNCalculator();
		Assert.assertEquals(1, rpnCalculator.processResult(testString));
	}
	
	
	@Test
	public void testRPNforEmptyInput() throws EmptyStringException{
		String testString = "";
		try
		{
		RPNCalculator rpnCalculator = new RPNCalculator();
		rpnCalculator.processResult(testString);
		}catch(Exception ex)
		{
			Assert.assertEquals("inputString is empty", ex.getMessage());
		}
	}
}
