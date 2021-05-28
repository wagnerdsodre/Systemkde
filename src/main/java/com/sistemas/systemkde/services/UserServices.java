package com.sistemas.systemkde.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.systemkde.entities.User;
import com.sistemas.systemkde.repositories.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	//method
	public List<User> findAll(){
		return repository.findAll();
	}
	
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	

}
