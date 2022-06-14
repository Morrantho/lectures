package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Title is required!")
	@Size(min=8,max=255,message="Movie title must be between 8-255 characters.")
	private String title;

	private String genre;
	
	@Min(value=1850,message="Release date must be at least the year 1850.")
	@Max(value=2022,message="Release data must be at most the year 2022.")
	private Integer release_date;
	
	private Integer rating;
	
	public Movie()
	{
		
	}
};