package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Food;
import com.codingdojo.repositories.FoodRepository;

@Service
public class FoodService
{
	@Autowired
	private FoodRepository foodRepository;

	public void create(Food food)
	{
		foodRepository.save(food);
	}
	
	public Food findById(Long id)
	{
		return foodRepository.findById(id).orElse(null);
	}
	
	public ArrayList<Food> findAll()
	{
		return foodRepository.findAll();
	}
	
	public void update(Food food)
	{
		foodRepository.save(food);
	}
	
	public void deleteById(Long id)
	{
		foodRepository.deleteById(id);
	}
};