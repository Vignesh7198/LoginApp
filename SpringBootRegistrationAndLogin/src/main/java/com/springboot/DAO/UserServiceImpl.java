package com.springboot.DAO;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Role;
import com.springboot.model.User;
import com.springboot.repo.UserRepository;
import com.springboot.webpackage.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	
	
	
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}




	@Override
	public User save(UserRegistrationDto registrationDto) {

		User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepo.save(user);
	}

	
}
