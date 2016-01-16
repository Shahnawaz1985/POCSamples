package com.bac.csd.strategy;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Shahnawaz
 *
 */
public class OperationalConstant {
	
	public static List<String> getOperatorsList(){
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("+");
		arrayList.add("-");
		arrayList.add("*");
		arrayList.add("/");
		arrayList.add("++");
		arrayList.add("--");
		return arrayList;
	}	
}
