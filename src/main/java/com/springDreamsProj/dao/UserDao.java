package com.springDreamsProj.dao;

import java.util.List;

import com.springDreamsProj.model.User;

public interface UserDao {

	User findById(int id);
	
	User findByUserName(String userName);
	
	List <User>findUserList();
	
}

