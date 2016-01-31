package com.bac.dp.utility;

/**
 * 
 */
import com.bac.dp.proxy.BusinessObject;

public class ProxyClient {
	
	public static void main(String[] args) {
		BusinessObject businessObjectImpl = BusinessObject.create();
		businessObjectImpl.sayHI();
	}

}
