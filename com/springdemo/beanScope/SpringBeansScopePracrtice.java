package com.springdemo.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.interfaces.*;


public class SpringBeansScopePracrtice {
	public static void main(String[] args) {
		
		//load brings from spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/beanScope/applicationContext.xml");
		
		
		//retrieve bean from container
		Coach a1 =  context.getBean("myCoach", Coach.class);
		
		Coach a2 =  context.getBean("myCoach", Coach.class);
		System.out.println("beans with scope prototype : " + (a1 == a2));
		
		FortuneService t1 = context.getBean("fortune",FortuneService.class );
		FortuneService t2 = context.getBean("fortune",FortuneService.class );
		
		System.out.println("beans with scope singleton : " + (t1==t2));
		context.close();
		
		/* 
		 * Beans with score singleton creates and uses same object in entire life span of application 
		 * Beans with scope prototype creates new instance of object for every request for the container.
		 * Bean init-method & destroy method also developed (Life cycle methods of bean 
		 */
	}
}
