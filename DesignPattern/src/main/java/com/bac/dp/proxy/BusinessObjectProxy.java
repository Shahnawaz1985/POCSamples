package com.bac.dp.proxy;

public class BusinessObjectProxy extends BusinessObject {
	
	private BusinessObject target;

	public BusinessObjectProxy(BusinessObject target){
		this.target = target;
	}

	public void sayHI() {
		System.out.println("Forwarding to proxy.");
		target.sayHI();
		System.out.println("Returned from proxy.");
	}

}
