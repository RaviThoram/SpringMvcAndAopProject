package com.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.dao.UserDao;
import com.aop.model.Login;
import com.aop.model.User;


@Service
public class UserService{
	@Autowired
	private UserDao userdao;
	public User validate(Login login) {
		return (User) userdao.validateUser(login);
	}
	public void addUser(User user){
		userdao.registerUser(user);
	}
	}
