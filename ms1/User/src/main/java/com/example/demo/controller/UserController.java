package com.example.demo.controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService us;
	
	@RequestMapping("/all")
	public Hashtable<String, User> getAll() {
		return us.getAll();
	} 
	
}
