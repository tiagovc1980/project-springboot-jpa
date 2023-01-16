package com.batuta.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batuta.course.entities.User;
import com.batuta.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll (){
		return repository.findAll();
	}
	
	public User findById (Long Id) {
		Optional<User> obj = repository.findById(Id);
		return obj.get();
	}
	

}