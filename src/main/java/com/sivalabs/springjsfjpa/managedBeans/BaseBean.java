package com.sivalabs.springjsfjpa.managedBeans;

/**
 * @author kesho
 *
 */

public class BaseBean {

	public static synchronized final Class getCurrentClassName() {
		return ClassLoader.getSystemClassLoader().getClass();
	}
}
