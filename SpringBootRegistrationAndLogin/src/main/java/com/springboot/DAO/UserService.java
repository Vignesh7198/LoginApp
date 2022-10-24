package com.springboot.DAO;

import com.springboot.model.User;
import com.springboot.webpackage.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registrationDto);
	
}
