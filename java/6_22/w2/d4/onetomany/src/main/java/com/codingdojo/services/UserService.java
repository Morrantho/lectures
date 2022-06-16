package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.User;
import com.codingdojo.repositories.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepository;

	public void create(User user)
	{
		userRepository.save(user);
	}
	
	public User findById(Long id)
	{
		return userRepository.findById(id).orElse(null);
	}
	
	public ArrayList<User> findAll()
	{
		return userRepository.findAll();
	}
	
	public void update(User user)
	{
		userRepository.save(user);
	}
	
	public void deleteById(Long id)
	{
		userRepository.deleteById(id);
	}
};