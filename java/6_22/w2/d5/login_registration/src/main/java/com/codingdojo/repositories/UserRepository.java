package com.codingdojo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>
{
	public ArrayList<User> findAll();
//	select * from user where user.name=?
	public User findByName(String username);
//	select * form user where user.email=?
	public User findByEmail(String email);
};