package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Recipe;
import com.codingdojo.repositories.RecipeRepository;

@Service
public class RecipeService
{
	@Autowired
	private RecipeRepository recipeRepository;

	public void create(Recipe recipe)
	{
		recipeRepository.save(recipe);
	}
	
	public Recipe findById(Long id)
	{
		return recipeRepository.findById(id).orElse(null);
	}
	
	public ArrayList<Recipe> findAll()
	{
		return (ArrayList<Recipe>) recipeRepository.findAll();
	}
	
	public void update(Recipe recipe)
	{
		recipeRepository.save(recipe);
	}

	public void deleteById(Long id)
	{
		recipeRepository.deleteById(id);
	}
};