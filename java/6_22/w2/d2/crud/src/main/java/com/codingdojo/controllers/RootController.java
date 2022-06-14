package com.codingdojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController
{
	@GetMapping("/")
	public String index()
	{
		return "index";
	}

	@GetMapping("/show/{id}")
	public String show()
	{
		return "show";
	}
	
	@GetMapping("/edit/{id}")
	public String edit()
	{
		return "edit";
	}
};