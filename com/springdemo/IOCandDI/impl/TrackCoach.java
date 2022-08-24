package com.springdemo.IOCandDI.impl;

import com.java.interfaces.Coach;

public class TrackCoach implements Coach {

	private String name;

	public TrackCoach(String name) {
		this.name = name;
		System.out.println("runing constructor");
	}

	@Override
	public void getDailyWorkout() {
		System.out.println("Run a hard 5k " + this.name);
	}

	public void setName(String initial) {
		this.name = this.name + " " + initial;
		System.out.println("Running setter method");
		// return this.name;
	}

	@Override
	public void printForturn() {
		// TODO Auto-generated method stub

	}

}
