package com.springdemo.beanScope.impl;

import com.java.interfaces.FortuneService;

public class GoodFortuenService implements FortuneService {

	public void printFortune() {
		System.out.println("updated to Good fortune");
	}
	
	public void init() {
		System.out.println("running init method");
	}
	 public void destroy() {
	    	System.out.println("destroy of GoodFortuenService");
	    }
	
	public GoodFortuenService() {
		System.out.println("constructor of GoodFortuenService");
	}
}
