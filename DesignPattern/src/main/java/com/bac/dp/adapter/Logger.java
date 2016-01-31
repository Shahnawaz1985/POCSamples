package com.bac.dp.adapter;

abstract public class Logger {
	
	abstract public void log(String msg);
	
	abstract public void debug(String msg);
	
	abstract public void trace(String msg);
	
	public static Logger createLogger(){
		return new ApacheCommonsLogAdapter();
	}

}
