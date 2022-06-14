package com.codingdojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.models.Movie;
import com.codingdojo.services.MovieService;

@Controller
@RequestMapping("/movie")
public class RootController
{
	@Autowired
	private MovieService movieService;
		
	@GetMapping("")
	public String index(Model model)
	{
		System.out.println("Create Movie Form");
		model.addAttribute("movie",new Movie());
		return "index";
	}

	@PostMapping("")
	public String createMovie( @Valid @ModelAttribute("movie") Movie movie, BindingResult res )
	{
		if(res.hasErrors())
		{
			return "index";
		}
		movieService.create(movie);
		return "redirect:/movie";
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