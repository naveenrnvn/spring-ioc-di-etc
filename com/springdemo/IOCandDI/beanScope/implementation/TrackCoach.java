package com.springdemo.IOCandDI.beanScope.implementation;

import com.springdemo.IOCandDI.beanScope.interfaces.Coach;
import com.springdemo.IOCandDI.beanScope.interfaces.FortuneService;

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
