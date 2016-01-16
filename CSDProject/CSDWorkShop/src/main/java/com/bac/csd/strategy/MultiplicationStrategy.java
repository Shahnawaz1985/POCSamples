package com.bac.csd.strategy;

import java.util.Stack;
/**
 * 
 * @author Shahnawaz
 *
 */
public class MultiplicationStrategy extends AbstractStrategy{

	@Override
	public Object process(String inputList) {
		return multiply(inputList);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private int multiply(String inputString){
		int sum = 0;
		String element1 = null;
		String element2 = null;
		String[] stringArray = strArray(inputString);
			Stack stack = new Stack();
			for(int i=0; i<stringArray.length; i++){
				if(!OperationalConstant.getOperatorsList().contains(stringArray[i])){
				stack.push(stringArray[i]);
				}else{
					if(!stack.isEmpty() && stack.size()==2){
						element1 = (String)stack.pop();
						element2 = (String)stack.pop();
					}
					if(stringArray[i].equals("*")){
						sum  = sum + Integer.parseInt(element1);
						sum = sum * Integer.parseInt(element2);
					}
				}
			}
			
		
		return sum;
	}
}
