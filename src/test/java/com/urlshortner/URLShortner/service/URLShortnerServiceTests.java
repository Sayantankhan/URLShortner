package com.urlshortner.URLShortner.service;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.urlshortner.URLShortner.bean.URLShortnerBean;

public class URLShortnerServiceTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	URLShortnerService service;
	
	@BeforeClass
	public void assignServiceObjects() {
		logger.info("|| TESTS || initiate Service-module Tests");
	}
	
	@Test
	public void inactiveURL_test() {
		List<URLShortnerBean> shortUrlBeanList = service.getInactiveList();
		logger.info("|| TESTS || inactiveURL(return) : "+shortUrlBeanList.size());
	}
}
