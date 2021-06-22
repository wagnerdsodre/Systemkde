package com.sistemas.systemkde.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.systemkde.entities.Product;
import com.sistemas.systemkde.repositories.ProductRepository;

@Service
public class ProductServices {
	
	@Autowired
	private ProductRepository repository;
	
	//method
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	
	public Product findById(Long id){
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	

}
