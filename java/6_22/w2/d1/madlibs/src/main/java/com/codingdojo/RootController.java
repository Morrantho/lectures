package com.codingdojo;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController
{
	@GetMapping("/")
	public String home
	(
		HttpSession session
	)
	{
		if(session.getAttribute("madlibs")==null)
		{
			session.setAttribute("madlibs",new ArrayList<Madlib>());
		}
		return "index";
	}

	@GetMapping("/reset")
	public String reset(HttpSession session)
	{
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/show")
	public String show(Model model,HttpSession session)
	{
		return "show";
	}
	
	@PostMapping("/submit")
	public String process
	(
		@RequestParam("noun") String noun,
		@RequestParam("adjective") String adjective,
		@RequestParam("verb") String verb,
		HttpSession session
	)
	{
		ArrayList<Madlib> libs=(ArrayList<Madlib>) session.getAttribute("madlibs");
		libs.add(new Madlib(noun,adjective,verb));
		return "redirect:/show";
	}
};