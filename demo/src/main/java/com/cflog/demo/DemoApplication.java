package com.cflog.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {

	private static String APP_START_UP = "Application Start-Up";
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	private static final Marker MARKER = MarkerFactory.getMarker(APP_START_UP);

	public static void main(String[] args) {
		LOGGER.info(MARKER, "In the main method");
		SpringApplication.run(DemoApplication.class, args);
	}

}
