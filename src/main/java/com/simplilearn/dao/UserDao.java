package com.simplilearn.dao;

import java.util.List;

import com.simplilearn.model.User;

public interface UserDao {
	
	List<User> getAllUserDetails();
	List<User> getUserDetail(String userName);
	

}
