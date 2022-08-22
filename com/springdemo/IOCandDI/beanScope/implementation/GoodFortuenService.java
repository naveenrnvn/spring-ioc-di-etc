package com.springdemo.IOCandDI.beanScope.implementation;

import com.springdemo.IOCandDI.beanScope.interfaces.FortuneService;

public class GoodFortuenService implements FortuneService {

	public void printFortune() {
		System.out.println("updated to Good fortune");
	}
}
