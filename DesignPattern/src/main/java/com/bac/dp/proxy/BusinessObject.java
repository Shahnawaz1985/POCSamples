package com.bac.dp.proxy;

abstract public class BusinessObject {
	
	public static BusinessObject create(){
		return new BusinessObjectProxy(new BusinessObjectImplementation());
	}

	public abstract void sayHI();

}