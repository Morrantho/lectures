package com.codingdojo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.codingdojo.models.Project;
import com.codingdojo.models.User;
import com.codingdojo.services.ProjectService;
import com.codingdojo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectController
{
	@Autowired
	private ProjectService projectService;
	@Autowired
	private UserService userService;

	public ProjectController
	(
		ProjectService projectService,
		UserService userService
	)
	{
		this.projectService=projectService;
		this.userService=userService;
	}

	@GetMapping("/projects/new")
	public String ProjectNewGet
	(
		Model model,
		HttpSession session
	)
	{
		if(!UserService.IsLoggedIn(session)) return UserService.Deny();
		model.addAttribute("project",new Project());
		return "project_new";
	}

	@PostMapping("/projects")
	public String ProjectNewPost
	(
		@Valid @ModelAttribute("project") Project project,
		BindingResult br,
		HttpSession session
	)
	{
		if(!UserService.IsLoggedIn(session)) return UserService.Deny();
		if(br.hasErrors()) return "project_new";

		User user=(User)session.getAttribute("user_id");
		// User user=userService.FindById(user_id);
		project.setOwner(user);
		projectService.Create(project);
		return "redirect:/dashboard";
	}
}
