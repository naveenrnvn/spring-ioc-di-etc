package com.springdemo.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.beanScope.interfaces.Coach;

public class SpringBeansScopePracrtice {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/beanScope/applicationContext.xml");
		
		context.getBean("myCoach", Coach.class).activity();
		context.getBean("myCoach", Coach.class).printForturn();
	}
}
