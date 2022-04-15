package com.codingdojo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>
{
	public User findByEmail(String email);
//	select * from users where users.email=???
};