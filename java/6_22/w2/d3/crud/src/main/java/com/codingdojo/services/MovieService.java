package com.codingdojo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Movie;
import com.codingdojo.repositories.MovieRepository;

@Service
public class MovieService
{
	@Autowired
	private MovieRepository movieRepository;

//	insert into movie() values();
	public void create(Movie movie)
	{
		movieRepository.save(movie);
	}
	
//	update table movie(asdasd,asdasd,asdasd) values(asdasd,asdasdasd) where movie.id=movie.getId()
	public void update(Movie movie)
	{
		movieRepository.save(movie);
	}
	
//	select * from movie;
	public ArrayList<Movie> findAll()
	{
		return movieRepository.findAll();
	}
//	select * from movie where movie.id=?;
	public Movie findOne(Long id)
	{
		Optional<Movie> movie=movieRepository.findById(id);
		return movie.isPresent()?movie.get():null;
	}
	
	public void deleteOne(Long id)
	{
		movieRepository.deleteById(id);
	}
};