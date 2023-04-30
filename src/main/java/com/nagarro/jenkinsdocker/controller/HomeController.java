package com.nagarro.jenkinsdocker.controller;

import java.util.HashMap;
import java.util.Map;

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

	@GetMapping("/user")
	public Map<String, String> getValues() {
		Map<String, String> data = new HashMap<>();
		data.put("Name", "Akash");
		data.put("Technology", "Java");
		data.put("Location", "Delhi");
		return data;
	}
}
