package com.microservices.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting: default tamil}")
	private String greetingMessage;
	
	@Value("${app.description}")
	private String desc;
	
	@Value("${my.list}")
	private List<String> values;
	
	@Value("#{${dbValues}}")
	private Map<String, String> dbValues;
	
	public GreetingController() {
		
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage + " " + values + " "+ dbValues;
	}
}
