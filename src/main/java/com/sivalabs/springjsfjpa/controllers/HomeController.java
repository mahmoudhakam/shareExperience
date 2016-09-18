package com.sivalabs.springjsfjpa.controllers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import com.sivalabs.springjsfjpa.managedBeans.BaseBean;
import com.sivalabs.springjsfjpa.utils.LoggerUtil;

/**
 * @author Siva
 *
 */
@ManagedBean
@ViewScoped
public class HomeController extends BaseBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerUtil.getLoggerInstance(getCurrentClassName());

	public HomeController() {
	}

	@PostConstruct
	void init() {

	}

}
