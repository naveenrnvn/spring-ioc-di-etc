package com.springdemo.beanScope.impl;

import com.java.interfaces.FortuneService;

public class BadFortuenService implements FortuneService {

	public void printFortune() {
		System.out.println("updated to BAD fortune");
	}
}
