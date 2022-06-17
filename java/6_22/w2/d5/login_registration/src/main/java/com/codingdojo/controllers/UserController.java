package com.codingdojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController
{
	@GetMapping("")
	public String login_register()
	{
		
		return "login_register";
	}
};