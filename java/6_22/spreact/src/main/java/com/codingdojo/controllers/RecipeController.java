package com.codingdojo.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.models.Recipe;
import com.codingdojo.services.RecipeService;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController
{
	@Autowired
	private RecipeService recipeService;
		
	// C
	@PostMapping("")
	public List<ObjectError> create( @Valid @RequestBody Recipe recipe, BindingResult res )
	{
		if(res.hasErrors())
		{
			return res.getAllErrors();
		}
		recipeService.create(recipe);
		return null;
	}
	// R
	@GetMapping("")
	public ArrayList<Recipe> findAll()
	{
		return recipeService.findAll();
	}
	// R
	@GetMapping("/{id}")
	public Recipe findById(@PathVariable("id") Long id)
	{
		return recipeService.findById(id);
	}
	
	// U
	@PutMapping("/{id}")
	public List<ObjectError> update( @Valid @RequestBody Recipe recipe, BindingResult res )
	{
		if(res.hasErrors())
		{
			return res.getAllErrors();
		}
		recipeService.update(recipe);
		return null;
	}
	
	// D
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") Long id)
	{
		recipeService.deleteById(id);
	}
};