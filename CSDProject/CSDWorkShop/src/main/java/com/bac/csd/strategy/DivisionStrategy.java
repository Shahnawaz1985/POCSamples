package com.bac.csd.strategy;

import java.util.Stack;

import com.bt.util.CustomArithematicException;
/**
 * 
 * @author Shahnawaz
 *
 */
public class DivisionStrategy extends AbstractStrategy{

	@Override
	public Object process(String inputList) {
		return divide(inputList);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private int divide(String inputString){
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
					if(stringArray[i].equals("/")){
						sum  = sum + Integer.parseInt(element2);
						if(!(Integer.parseInt(element1) == 0)){
						sum = sum / Integer.parseInt(element1);
						}else{
							throw new CustomArithematicException("Divide by 0 is not allowed.");
						}
					}
				}
			}
			
		
		return sum;
	}

}
