package com.codingdojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController
{
	@GetMapping("")
	public String index()
	{
		return "login_register";
	}
};