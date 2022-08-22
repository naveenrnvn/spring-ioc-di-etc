package com.springdemo.beanScope.interfaces;

public interface Coach {
	public default void activity() {
		System.out.println("Practice  : Default ");
	}

	public void printForturn();
}
