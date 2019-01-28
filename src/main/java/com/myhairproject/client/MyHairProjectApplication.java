package com.myhairproject.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MyHairProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHairProjectApplication.class, args);
	}
	
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(MyHairProjectApplication.class);
	    }
}

