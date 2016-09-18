package com.sivalabs.springjsfjpa.utils;

import org.apache.log4j.Logger;

public class LoggerUtil {

	public synchronized static final Logger getLoggerInstance(Class theClass) {
		return Logger.getLogger(theClass);
	}
}
