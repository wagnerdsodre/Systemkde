package com.sistemas.systemkde.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.systemkde.entities.Order;
import com.sistemas.systemkde.repositories.OrderRepository;

@Service
public class OrderServices {
	
	@Autowired
	private OrderRepository repository;
	
	//method
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	
	public Order findById(Long id){
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	

}
