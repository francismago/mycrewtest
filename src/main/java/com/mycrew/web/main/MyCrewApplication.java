package com.mycrew.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MyCrewApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
		return builder.sources(MyCrewApplication.class);
	}


	public static void main(String[] args)  {
		SpringApplication.run(MyCrewApplication.class, args);
	}
}
