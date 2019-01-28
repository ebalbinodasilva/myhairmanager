package com.hairmanager.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HairManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HairManagerApplication.class, args);
	}

}

