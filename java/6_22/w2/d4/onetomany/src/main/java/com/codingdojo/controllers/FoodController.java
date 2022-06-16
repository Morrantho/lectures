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

import com.codingdojo.models.Food;
import com.codingdojo.services.FoodService;
import com.codingdojo.services.UserService;

@Controller
@RequestMapping("/food")
public class FoodController
{
	@Autowired
	private FoodService foodService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/new")
	public String createFood(Model model)
	{
		model.addAttribute("food",new Food());
		model.addAttribute("users",userService.findAll());
		return "food";
	}
	
	@PostMapping("/new")
	public String insertFood(@Valid @ModelAttribute("food") Food food, BindingResult res )
	{
		if(res.hasErrors())
		{
			return "food";
		}
		foodService.create(food);
		return "redirect:/food/new";
	}
};