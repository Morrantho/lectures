package com.codingdojo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe,Long>
{

};