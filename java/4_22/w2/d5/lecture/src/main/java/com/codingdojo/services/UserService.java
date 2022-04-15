package com.codingdojo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.models.LoginUser;
import com.codingdojo.models.User;
import com.codingdojo.repositories.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}
	
	public void Create(User user)
	{
		userRepository.save(user);
	}

	public User FindByEmail(String email)
	{
		User user = userRepository.findByEmail(email);
		return user;
	}

    public User register(User newUser,BindingResult result)
    {
        // TO-DO: Additional validations!
    	
        return newUser;
    }
    
    public User login(LoginUser newLoginObject,BindingResult result)
    {
        // TO-DO: Additional validations!
    	
    	return null;
    }	
}
