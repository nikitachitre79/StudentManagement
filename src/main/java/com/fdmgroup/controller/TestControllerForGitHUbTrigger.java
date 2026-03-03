package com.fdmgroup.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "https://react-app1-79505229087.northamerica-northeast2.run.app")
@RestController
public class TestControllerForGitHUbTrigger {
	@GetMapping("/test-github-trigger")
	public String testGitHubTrigger() {
		return "GitHub trigger test successful!";
	}
}
