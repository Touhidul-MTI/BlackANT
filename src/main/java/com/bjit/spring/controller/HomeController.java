package com.bjit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/", "/index", "/home"})
	String home(ModelMap modal) {
		return "index_page";
	}

	@GetMapping(value = "/test")
	public String test() {
		return "test2";
	}
	
	@GetMapping(value = "/test3")
	public String test3() {
		return "test3";
	}

	
	@GetMapping(value = "/login")
	public String userLogin() {
		return "securitytest";
	}

	@GetMapping(value = "/register")
	public String userRegister() {
		return "userRegistrationForm_page";
	}
}
