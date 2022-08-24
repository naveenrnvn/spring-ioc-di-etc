package com.java.annotations.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.interfaces.*;
public class JavaAnnotationBasedConfig {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/java/annotations/IOC/ApplicationConetext.xml");

	FortuneService ft = context.getBean("goodFortuenService",FortuneService.class);
	Coach ch = context.getBean(Coach.class);
	Coach ch1 = context.getBean(Coach.class);
	
	ft.printFortune();
	ch.printForturn();
	
	context.close();
	
			
	
	
	/*used @context annotation so that spring know create a bean optionally you can pass a string to @component("name")  
	 * which acts as a bean id if your not passing class name will be the bean id */
	
	/* added   <context:component-scan base-package="com.java.annotations.IOC.impl"></context:component-scan> so that spring 
	 * search for the components and register the objects as beans in specified location*/
	
	/*use @primary on any one of the class  if you have two or  classes implementing same interface*/
	
	/*@Autowired => to tell spring to inject the dependency
	 * @Primary => Telling spring to give the priority to this annotated bean when there are multiple implementation for same interface
	 * @Qualifier => Telling spring to fetch the bean with specific id */
	
	/* bean init method annotation ==> @postConstruct
	 * bean destroy annotation => @preDestroy
	 */
	
	}

}
