package com.cflog.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		LOGGER.info("In the main method");
		SpringApplication.run(DemoApplication.class, args);
	}

}
