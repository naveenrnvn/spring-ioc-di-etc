package com.springdemo.beanScope.impl;

import com.springdemo.beanScope.interfaces.Coach;
import com.springdemo.beanScope.interfaces.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuen;

	public TrackCoach(FortuneService fortuen) {
		super();
		this.fortuen = fortuen;
	}

	@Override
	public void printForturn() {
		this.fortuen.printFortune();
	}

}
