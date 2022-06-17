package com.codingdojo.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.repositories.UserRepository;
import com.codingdojo.models.TempUser;
import com.codingdojo.models.User;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepository;

	public void login(TempUser tempUser)
	{
		
	}
	
	public void register()
	{
		
	}
	
	public User findByEmail(String email)
	{
		return userRepository.findByEmail(email);
	}
};