package com.springdemo.IOCandDI.beanScope.interfaces;

public interface FortuneService {

	public default  void printFortune() {
		System.out.println("implement this its just default");
	}
}
