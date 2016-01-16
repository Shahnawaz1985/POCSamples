package com.bt.util;

public class EmptyStringException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6316353322058011133L;

	public EmptyStringException(String errorMessage){
		super(errorMessage); 
	}

}
