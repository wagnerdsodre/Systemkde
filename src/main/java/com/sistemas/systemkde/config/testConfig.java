package com.sistemas.systemkde.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sistemas.systemkde.entities.User;
import com.sistemas.systemkde.repositories.UserRepository;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner {
	
	//Association repository 
	@Autowired
	private UserRepository userRepository;

	//start application
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "Tom purple2", "tompurple@gmail.com", "977777777", "123456"); 
		User u4 = new User(null, "Redull", "reddull@gmail.com", "977777777", "123456");
		User u5 = new User(null, "Paul kramp", "reddull@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
	}

}
