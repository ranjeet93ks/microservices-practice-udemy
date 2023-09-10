package com.ranjs.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjs.microservices.limitsservice.bean.Limits;
import com.ranjs.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;

	@Value("${limit-service.minimum}")
	private int min;//from limits-service.properties

	@Value("${limit-service.maximun}")
	private int max;//from limits-service.properties

	@Value("${insurance.provider.url}")
	private String url;//from application.properties

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		System.out.println("url : " + url);
		System.out.println(" min and max value -> " + configuration.getPort() + " : " + configuration.getName());
		return new Limits(min, max);
//		return new Limits(1,1000);
	}
}
