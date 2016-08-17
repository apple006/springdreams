package com.springDreamsProj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springDreamsProj.dao.UserDao;
import com.springDreamsProj.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	public User findById(int id) {
		return dao.findById(id);
	}

	public User findByUserName(String userName) {
		return dao.findByUserName(userName);
	}

	public List<User> getUserList() {
//		List l=new ArrayList();
//		l.add("apple");
//		l.add("orange");
//		l.add("banana");
//		return l;
		System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
		return dao.findUserList();
	}

}
