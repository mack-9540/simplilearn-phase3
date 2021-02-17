package com.simplilearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.UserDaoImpl;
import com.simplilearn.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDaoImpl ud;
	
	public ArrayList<User> getAllUserNames(){
	
	ArrayList<User> al = new ArrayList<User>();
	al = (ArrayList<User>) ud.getAllUserDetails();

	return al;
}
	
	
	public ArrayList<User> getUserName(String userName){
		
		ArrayList<User> al = new ArrayList<User>();
		al = (ArrayList<User>) ud.getUserDetail(userName);

		return al;
	}
}
