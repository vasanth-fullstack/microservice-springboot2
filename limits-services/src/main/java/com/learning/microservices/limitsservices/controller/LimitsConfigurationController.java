package com.learning.microservices.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservices.limitsservices.bean.LimitConfiguartion;
import com.learning.microservices.limitsservices.config.Configuation;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuation configuation;
	
	@GetMapping("/limits")
	public LimitConfiguartion retriveLimitsFromConfiguation() {
		return new LimitConfiguartion(configuation.getMaximum(), configuation.getMinimum());
	}
	
	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public LimitConfiguartion retrieveConfiguration() {
		throw new RuntimeException("Service not available");
	}
	
	public LimitConfiguartion fallbackRetrieveConfiguration() {
		return new LimitConfiguartion(9, 9999);
	}
}
