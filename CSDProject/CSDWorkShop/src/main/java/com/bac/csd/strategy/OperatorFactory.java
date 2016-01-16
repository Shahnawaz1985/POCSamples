package com.bac.csd.strategy;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author Shahnawaz
 *
 */
public class OperatorFactory {
	
	private static Map<String, Object> calculatorFactoryMap = new HashMap<String, Object>();
	
	static{
		calculatorFactoryMap.put("+", new AdditionStrategy());
		calculatorFactoryMap.put("-", new SubstractionStrategy());
		calculatorFactoryMap.put("*", new MultiplicationStrategy());
		calculatorFactoryMap.put("/", new DivisionStrategy());
		calculatorFactoryMap.put("++", new IncrementStrategy());
		calculatorFactoryMap.put("--", new DecrementStrategy());
	}
	
	public static AbstractStrategy getCalculator(String operator){
		return (AbstractStrategy) calculatorFactoryMap.get(operator);
		
	}

}
