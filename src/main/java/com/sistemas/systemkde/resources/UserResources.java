package com.sistemas.systemkde.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemas.systemkde.entities.User;

@RestController	
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u  = new User(1L,"Wagner","wagnerdsodre@gmail.com","999999","123456");
		return ResponseEntity.ok().body(u);
		
	}

}
