package com.codingdojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.models.User;
import com.codingdojo.services.UserService;

@RestController
public class UserController
{
	@Autowired
	private UserService userService;
	
	@PostMapping("/api/register")
	public User register( @RequestBody User user, BindingResult res )
	{
		User db_user=userService.register(user, res);
		if(db_user==null)
		{
			return null;
		}
		return user;
	}
}
