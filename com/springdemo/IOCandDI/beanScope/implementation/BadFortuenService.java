package com.springdemo.IOCandDI.beanScope.implementation;

import com.springdemo.IOCandDI.beanScope.interfaces.FortuneService;

public class BadFortuenService implements FortuneService {

	public void printFortune() {
		System.out.println("updated to BAD fortune");
	}
}
