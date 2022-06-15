package com.codingdojo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Long>
{
	public ArrayList<Movie> findAll();
};