package com.springdemo.IOCandDI.implementations;

import com.springdemo.IOCandDI.interfaces.Coach;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}







