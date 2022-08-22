package com.springdemo.IOCandDI.implementations;

import com.springdemo.IOCandDI.interfaces.Coach;

public class TrackCoach implements Coach {
	
	String nickName;
	
	private String name;
	
	
	public TrackCoach(String name) {
		this.name = name;
		System.out.println("runing constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k "+this.name;
	}
	
	public void setName(String initial){
		this.name = this.name + " " + initial;
		System.out.println("Running setter method");
		//return this.name;
	}

}










