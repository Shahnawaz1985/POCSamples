package com.bac.dp.adapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

public class ApacheCommonsLogAdapter extends Logger{
	
	private Log logger  = new Log4JLogger();
	@Override
	public void log(String msg) {
		logger.info(msg);
	}

	@Override
	public void debug(String msg) {
		logger.debug(msg);
	}

	@Override
	public void trace(String msg) {
		logger.trace(msg);
	}

}
