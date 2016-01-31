package com.bac.dp.utility;

import com.bac.dp.adapter.Logger;

public class AdapterClient {
	
	public static void main(String[] args) {
		Logger logger = Logger.createLogger();
		logger.log("LOG level logging.");
		logger.debug("DEBUG level logging.");
		logger.trace("TRACE level logging.");
	}

}
