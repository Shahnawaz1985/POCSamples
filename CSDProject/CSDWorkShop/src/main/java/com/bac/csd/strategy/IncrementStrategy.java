package com.bac.csd.strategy;

import java.util.Stack;
/**
 * 
 * @author Shahnawaz
 *
 */
public class IncrementStrategy extends AbstractStrategy{

	@Override
	public Object process(String inputList) {
		return increment(inputList);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int increment(String inputString){
		int sum = 0;
		Stack stack = new Stack();
		String[] stringArray = strArray(inputString);
		for(int i=0; i<stringArray.length; i++){
				if(!OperationalConstant.getOperatorsList().contains(stringArray[i])){
				stack.push(stringArray[i]);
				}else{
					if(!stack.isEmpty()){
						String element1 = (String)stack.pop();
					if(stringArray[i].equals("++")){
						sum  = sum + Integer.parseInt(element1);
						sum = sum + 1;
						
					}
					}				
			}
			
		}
		
		return sum; 
	}

}
