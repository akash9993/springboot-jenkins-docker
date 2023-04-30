package com.nagarro.jenkinsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkinsdocker")
public class HomeController {

	@GetMapping("/status")
	public String getStatus() {
		return "Project running successfully | status code: 200 OK";
	}
}
