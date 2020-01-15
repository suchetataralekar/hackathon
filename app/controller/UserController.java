package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.IUserDao;
import com.app.pojos.Users;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserDao dao;
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("inside myinit..");
	}
	
	@GetMapping("userName/{userName}/password/{password}")
	public Users validate(@PathVariable String userName,@PathVariable String password )
	{
	 Users u =	dao.validate(userName, password);
	 if(u.getName()== null)
	 return null;
	 else 
		 return u;
		
	}
	
	@GetMapping("/{id}")
	public Users getUser(@PathVariable int id)
	{
		return dao.getUser(id);
	}
	
	
}
