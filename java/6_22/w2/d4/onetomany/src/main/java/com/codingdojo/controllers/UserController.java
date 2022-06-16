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

import com.codingdojo.models.User;
import com.codingdojo.services.FoodService;
import com.codingdojo.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userService;
	@Autowired
	private FoodService foodService;
	
//	@GetMapping("/{id}")
//	public String findUserById(@PathVariable("id") Long id, Model model )
//	{
//		select * from user join food on user.id=food.user_id;
//		 model.addAttribute("user",userService.findById(id));
//		 return "user";
//	}

	@GetMapping("/new")
	public String createUser( Model model )
	{
		model.addAttribute("user",new User());
		return "user";
	}
	
	@PostMapping("/new")
	public String insertUser( @Valid @ModelAttribute("user") User user, BindingResult res )
	{
		if(res.hasErrors())
		{
			return "user";
		}
		userService.create(user);
		return "redirect:/user/new";
	}
}
