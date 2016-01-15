package com.bac.csd.strategy;

import com.bt.util.EmptyStringException;
/**
 * 
 * @author Shahnawaz
 *
 */
public class ProcessingDelegator {
	
	public static Object getResult(String inputList){
		AbstractStrategy abstractCalculator = null;
		String[] stringArray = null;
		validateInputString(inputList);
		stringArray = inputList.split(" ");
		String operator = null;
		for(String str:stringArray){
			if(OperationalConstant.getOperatorsList().contains(str)){
				operator = str;				
				break;
			}
		}
		abstractCalculator = OperatorFactory.getCalculator(operator);
		Object retVal = abstractCalculator.process(inputList);
		return retVal;
	}
	
	private static void validateInputString(String inputList){
		if(null==inputList || inputList.length()==0)
			throw new EmptyStringException("inputString is empty");
	}
}
