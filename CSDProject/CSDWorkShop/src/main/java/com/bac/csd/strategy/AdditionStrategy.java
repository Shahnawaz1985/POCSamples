package com.bac.csd.strategy;

import java.util.Stack;
/**
 * 
 * @author Shahnawaz
 *
 */
public class AdditionStrategy extends AbstractStrategy{
	
	@Override
	public Object process(String inputList) {
		return add(inputList);		
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private int add(String inputString){
		int sum = 0;
		String[] stringArray = strArray(inputString);
			Stack stack = new Stack();
			for(int i=0; i<stringArray.length; i++){
				if(!OperationalConstant.getOperatorsList().contains(stringArray[i])){
				stack.push(stringArray[i]);
				}else{
					if(!stack.isEmpty() && stack.size()==2){
						String element1 = (String)stack.pop();
						String element2 = (String)stack.pop();
					if(stringArray[i].equals("+")){
						sum  = sum + Integer.parseInt(element1);
						sum = sum + Integer.parseInt(element2);
					}
					}
				}
			}		
		return sum;
	}
}
