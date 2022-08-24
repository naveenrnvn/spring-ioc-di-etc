package com.java.interfaces;

public interface Coach {
	
	public default void activity() {
		System.out.println("Practice  : Default ");
	}
	
	public default void getDailyWorkout() {
		System.out.println("Do some worm up");
	}

	public void printForturn();
}
