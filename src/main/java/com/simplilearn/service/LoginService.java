package com.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.LoginDaoImpl;
import com.simplilearn.model.Login;
@Service
public class LoginService {
	
	@Autowired
	LoginDaoImpl ldi;
	
	
	
	public Login getPassword(String userName) {
		
		Login login = new Login();
		login= ldi.getUserDetails(userName);
		
	
		
		return login;
	}
	
	public boolean validateUser(String userName,String password) {
		
		
		boolean flag = false;
		Login login = getPassword(userName);
		
		if (!(login==null)) {
		String pass = login.getPassword();
		String un = login.getUserName();
		System.out.println(pass);
		System.out.println(un);
		System.out.println("username: "+userName);
		//String un = login.getUserName();
		//System.out.println(pass+"   "+un);
		
		if(pass.equals(password) && un.equals(userName)) {
			flag = true;
		}
		else
			flag = false;
		}
		else 
			flag = false;
		return flag;
	}
	
	public int changePassword(String password) {
		int count = ldi.changePassword(password);
		
		return count;
	}

}
