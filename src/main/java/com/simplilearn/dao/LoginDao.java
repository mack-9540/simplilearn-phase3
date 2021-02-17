package com.simplilearn.dao;

import com.simplilearn.model.Login;

public interface LoginDao {
	
	Login getUserDetails(String userName);
	int changePassword(String password);

}
