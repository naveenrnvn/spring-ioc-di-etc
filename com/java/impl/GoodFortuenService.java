package com.java.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.java.interfaces.*;
@Component()
@Scope("singleton")
public class GoodFortuenService implements FortuneService {

	public void printFortune() {
		System.out.println("updated to Good fortune");
	}
	
	public void init() {
		System.out.println("running init method");
	}
	 public void destroy() {
	    	System.out.println("destroy of GoodFortuenService");
	    }
	
	public GoodFortuenService() {
		System.out.println("GoodFortuenService constructor");
	}
}
