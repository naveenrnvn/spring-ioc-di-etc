package com.springdemo.beanScope.impl;

import com.java.interfaces.Coach;
import com.java.interfaces.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuen;
	
	
    public void destroy() {
    	System.out.println("destroy of TrackCoach");
    }
    
	public TrackCoach(FortuneService fortuen) {
		super();
		this.fortuen = fortuen;
	}

	@Override
	public void printForturn() {
		this.fortuen.printFortune();
	}

}
