package com.java.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.java.interfaces.*;
@Component()
@Primary
public class BadFortuenService implements FortuneService {

	public void printFortune() {
		System.out.println("updated to BAD fortune");
	}
}
