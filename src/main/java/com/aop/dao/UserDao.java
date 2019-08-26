package com.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aop.model.Login;
import com.aop.model.User;

@Repository
public class UserDao {
	private static List<User> list = new ArrayList<User>();;

	public void registerUser(User user) {

		System.out.println(user.getUsername());
		list.add(new User(user.getUsername(), user.getPassword(), user.getEmail()));
		System.out.println(list);
		System.out.println(list.size());
	}

	public User validateUser(Login login) {
		System.out.println(login.getUserNameLog());
		for (User userListIterate : list) {
			if (userListIterate.getUsername().equals(login.getUserNameLog())
					&& userListIterate.getPassword().equals(login.getPasswordLog())) {
				// User user=((User) list).getUsername().i;
				return list.get(0);
			}
		}
		return null;
	}


}
