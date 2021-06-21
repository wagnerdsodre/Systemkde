package com.sistemas.systemkde.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.systemkde.entities.Category;
import com.sistemas.systemkde.repositories.CategoryRepository;

@Service
public class CategoryServices {
	
	@Autowired
	private CategoryRepository repository;
	
	//method
	public List<Category> findAll(){
		return repository.findAll();
	}
		
	public Category findById(Long id){
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	

}
