package com.codingdojo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Food;

public interface FoodRepository extends CrudRepository<Food,Long>
{
	ArrayList<Food> findAll();
};