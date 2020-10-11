package com.cflog.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

@RestController
public class GreetingController {
    private static String GREETING_READ = "Greetings Read";
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);
    private static final Marker MARKER = MarkerFactory.getMarker(GREETING_READ);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        LOGGER.info(MARKER, "Fetching the greeting for you");
        LOGGER.debug(MARKER, "Counter of the greeting {} ", counter.incrementAndGet());
        LOGGER.debug(MARKER, "Debug log triggered");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
}