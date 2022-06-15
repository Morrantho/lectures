package com.codingdojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		model.addAttribute("movies",movieService.findAll());
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
	
	@PostMapping("/delete/{id}")
	public String deleteMovie( @PathVariable("id") Long movieId )
	{
		movieService.deleteOne(movieId);
		return "redirect:/movie";
	}
	
	@GetMapping("/show/{id}")
	public String show( @PathVariable("id") Long movieId, Model model )
	{
		model.addAttribute("movie",movieService.findOne(movieId));
		return "show";
	}
	
	@GetMapping("/edit/{id}")
	public String edit( @PathVariable("id") Long movieId, Model model )
	{
		model.addAttribute("movie",movieService.findOne(movieId));
		return "edit";
	}
	
	@PostMapping("/edit/{id}")
	public String update( @Valid @ModelAttribute("movie") Movie movie, BindingResult res )
	{
		if(res.hasErrors())
		{
			return "edit";
		}
		movieService.update(movie);
		return "redirect:/movie";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
};