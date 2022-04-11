package com.codingdojo.controllers;

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
	public String index(Model model,HttpSession session)
	{
		if(session.getAttribute("num_stories")==null)
		{
			session.setAttribute("num_stories",0);
		}
		if(session.getAttribute("story")!=null)
		{
			model.addAttribute("story",session.getAttribute("story"));			
		}
		model.addAttribute("num_stories",session.getAttribute("num_stories"));
		return "index";
	}
	
	@PostMapping("/madlibs")
	public String make_story
	(
		@RequestParam("verb") String verb,
		@RequestParam("adjective") String adjective,
		@RequestParam("adverb") String adverb,
		HttpSession session
	)
	{
		String story="They said "+adverb+" was "+adjective+" and it made me "+verb+" forever.";
		session.setAttribute("story",story);
		Integer num_stories=(Integer)session.getAttribute("num_stories");
		session.setAttribute("num_stories",num_stories+1);
		return "redirect:/";
	}
};