package com.bac.csd;

import com.bac.csd.strategy.ProcessingDelegator;

/**
 * 
 * @author Shahnawaz
 *
 */
public class RPNCalculator {
	
	public Object processResult(String inputList){
		return ProcessingDelegator.getResult(inputList);
	}
}
