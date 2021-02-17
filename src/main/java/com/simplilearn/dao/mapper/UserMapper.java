package com.simplilearn.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.simplilearn.model.User;

public class UserMapper implements RowMapper<User> {
	
	public User mapRow(ResultSet rs,int i) {
		
		User u = new User();
		 try {
			u.setId(rs.getInt("id"));
			u.setFirstName(rs.getString("first_name"));
			u.setSecondName(rs.getString("LAST_NAME"));
			u.setPhoneNumber(rs.getInt("PHONE_NUMBER"));
			u.setEmail(rs.getString("EMAIL"));
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return u;
		
	}

	

}
