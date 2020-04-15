package com.projectvotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
//	@RequestMapping(value="/login", method=RequestMethod.GET) //similar
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
