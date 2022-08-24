package com.java.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.java.interfaces.*;

@Component
@Scope("prototype")
public class TrackCoach implements Coach {

	@Value("${my.name}")
	private String name;

	// we can use @Autowired here to set the field instead of constructor or setter
	// method
	FortuneService fortuen;

	// @Autowired with constructor
	@Autowired
	public TrackCoach(@Qualifier("goodFortuenService") FortuneService fortuen) {
		super();
		this.fortuen = fortuen;
		System.out.println("TrackCoach consructor");
	}

	// @Autowired methods just run after constructor
	@Autowired
	public void autowirwtestonm() {
		System.out.println("dependency injection using method : TrackCoach");
	}

	@Override
	public void printForturn() {
		this.fortuen.printFortune();
	}

	@PostConstruct
	public void testInitBeanMethod() {
		System.out.println("(TrackCoach) Bean Init Post Construct");
	}

	@PreDestroy
	public void tedestroyBeanMethod() {
		System.out.println("(TrackCoach) Bean destroying :" + (this.name));
	}

}
