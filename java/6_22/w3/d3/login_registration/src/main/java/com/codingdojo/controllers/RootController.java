package com.codingdojo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.models.TempUser;
import com.codingdojo.models.User;
import com.codingdojo.services.UserService;

@Controller
public class RootController
{
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public String login_register( Model model )
	{
		model.addAttribute("userRegister",new User());
		model.addAttribute("userLogin",new TempUser());
		return "login_register";
	}
	
	@PostMapping("/register")
	public String register
	(
		@Valid @ModelAttribute("userRegister") User form_user,
		BindingResult res,
		Model model
	)
	{
		if(res.hasErrors())
		{
			model.addAttribute("userLogin",new TempUser());
			return "login_register";
		}
		User db_user=userService.register(form_user,res);
		if(db_user==null)
		{
			model.addAttribute("userLogin",new TempUser());	
			return "login_register";
		}
		return "redirect:/";
	}
	
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
		return "dashboard";
	}
	
	@PostMapping("/login")
	public String login
	(
		@Valid @ModelAttribute("userLogin") TempUser tempUser,
		BindingResult res,
		Model model,
		HttpSession session
	)
	{
		if(res.hasErrors())
		{
			model.addAttribute("userRegister",new User());
			return "login_register";
		}
		User db_user=userService.login(tempUser,res);
		if(db_user==null)
		{
			model.addAttribute("userRegister",new User());
			return "login_register";
		}
		session.setAttribute("user",db_user);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		userService.logout(session);
		return "redirect:/";
	}
};