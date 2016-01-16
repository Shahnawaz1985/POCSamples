package com.bac.csd.strategy;

import com.bt.util.EmptyStringException;

/**
 * 
 * @author Shahnawaz
 *
 */
public abstract class AbstractStrategy {
	
	public String[] strArray(String inputString){
		
		String[] stringArray = null;
		if(null!=inputString && inputString.length()>0){
		stringArray= inputString.split(" ");
		}else{
			throw new EmptyStringException("inputString is empty");
		}
		return stringArray;
	}
	
	public abstract Object process(String inputList);

}
