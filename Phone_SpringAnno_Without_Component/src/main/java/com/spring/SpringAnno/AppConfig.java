package com.spring.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.phone.MI;
import com.phone.Samsung;
import com.processor.Cynogen;
import com.processor.Snapdragon;

@Configuration
public class AppConfig {
	@Bean
	public Samsung getSamsung() {
		return new Samsung();
	}

	@Bean
	public Cynogen getCynogen() {
		return new Cynogen();
	}
	@Bean
	public MI getMI() { 
		 return new MI(); 
	}  	 
	@Bean 
	public Snapdragon getSnapdragon() {
		return new Snapdragon();
	} 
}
