package com.codingdojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactController
{
	@GetMapping("/")
	public String react()
	{
		return "forward:/index.html";
	}
};