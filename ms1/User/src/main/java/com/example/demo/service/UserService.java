package com.example.demo.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {
	Hashtable<String, User> user = new Hashtable<String, User>();
	public UserService() {
		User u = new User();
		u.setFirstName("Julian");
		u.setLastName("Thaler");
		user.put("Name:", u);
	}
	
	public Hashtable<String, User> getAll() {
		return user;
	}
	
}
