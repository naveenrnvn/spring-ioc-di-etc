package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	String name;
	
	public TrackCoach(String name) {
		this.name = name;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k "+this.name;
	}

}










