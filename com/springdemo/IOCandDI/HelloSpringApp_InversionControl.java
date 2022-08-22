package com.springdemo.IOCandDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.IOCandDI.interfaces.Coach;

public class HelloSpringApp_InversionControl {

	public static void main(String[] args) {
		
		//inversion of control

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springdemo/IOCandDI/applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}







