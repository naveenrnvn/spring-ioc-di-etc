package com.java.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.java.impl.GoodFortuenService;
import com.java.impl.TrackCoach;
import com.java.interfaces.Coach;
import com.java.interfaces.FortuneService;

@Configuration
@PropertySource("classpath:resource/application.properties")
//@ComponentScan to scan for beans any package
public class Confis {
   // manually creating beans in java class
	@Bean
	public FortuneService goodFortuenService() {
		return new GoodFortuenService();
	}
	
	@Bean
	public Coach trackCoach() {
		return new TrackCoach(goodFortuenService());
	}
}
