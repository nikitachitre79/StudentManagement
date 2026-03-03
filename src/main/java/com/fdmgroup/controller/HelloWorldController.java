package com.fdmgroup.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "https://react-app1-79505229087.northamerica-northeast2.run.app")
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping
	public String sayHello() {
		return "Hello, World!";
	}
}
