package com.sivalabs.springjsfjpa.managedBeans;

public class BaseBean {

	public static synchronized final Class getCurrentClassName() {
		return ClassLoader.getSystemClassLoader().getClass();
	}
}
