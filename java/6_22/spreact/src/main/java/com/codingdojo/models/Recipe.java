package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

@Entity
public class Recipe
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Size(min=1,max=255,message="Recipe name must be between 1-255 characters.")
	private String name;

	@DecimalMin(value="1.00",message="Recipe must be at least worth a dollar.")
	@DecimalMax(value="100.00",message="Recipe must cost than 100 dollars.")
	private Double cost;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Recipe()
	{
		
	}
};