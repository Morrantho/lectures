package com.codingdojo.repositories;

import com.codingdojo.models.Project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long>
{
	
}