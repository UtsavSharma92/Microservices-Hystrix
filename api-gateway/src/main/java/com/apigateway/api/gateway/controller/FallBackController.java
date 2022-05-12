package com.apigateway.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {

		return "User service is down";
	}

	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {

		return "Contact service is down";
	}

}
