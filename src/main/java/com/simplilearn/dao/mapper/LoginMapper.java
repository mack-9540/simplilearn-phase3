package com.simplilearn.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.simplilearn.model.Login;

public class LoginMapper implements RowMapper<Login> {
	
	public Login mapRow(ResultSet rs,int i) {
		
		Login login = new Login();
		 try {
			login.setPassword(rs.getString("password"));
			login.setUserName(rs.getString("username"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return login;
		
	}

	

}
