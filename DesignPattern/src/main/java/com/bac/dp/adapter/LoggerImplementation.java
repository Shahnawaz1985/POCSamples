package com.bac.dp.adapter;

/**
 * 
 * @author Shahnawaz
 *
 */
public class LoggerImplementation extends Logger {

	@Override
	public void log(String msg) {
		System.out.print("LOG : ");
		System.out.println(msg);
	}

	@Override
	public void debug(String msg) {
		System.out.print("DEBUG : ");
		System.out.println(msg);
	}

	@Override
	public void trace(String msg) {
		System.out.print("TRACE : ");
		System.out.println(msg);
	}

}
