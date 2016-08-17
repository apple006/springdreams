package com.springDreamsProj.service;

import java.util.List;

import com.springDreamsProj.model.User;

public interface UserService {

	User findById(int id);
	
	User findByUserName(String userName);
	
	List<User> getUserList();
	
}