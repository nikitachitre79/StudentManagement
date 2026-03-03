package com.fdmgroup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerForGitHUbTrigger {
	@GetMapping("/test-github-trigger")
	public String testGitHubTrigger() {
		return "GitHub trigger test successful!";
	}
}
