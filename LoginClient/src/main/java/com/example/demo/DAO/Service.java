package com.example.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.UsersDetails;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	RestTemplate template;
	
	
	
	public boolean UserExists(UsersDetails user) {
		HttpEntity entity = new HttpEntity(user);
		
		boolean userExists = template.exchange("http://localhost:8080/login", HttpMethod.POST, entity, boolean.class).getBody();		
		
    	return userExists;
	}
	
	
	
}
