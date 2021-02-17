package com.simplilearn.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.simplilearn.dao.mapper.LoginMapper;
import com.simplilearn.dao.mapper.UserMapper;
import com.simplilearn.model.User;

@Component
public class UserDaoImpl implements UserDao{

	JdbcTemplate jt;
	private final String USERDETAILS = "SELECT * FROM SPRINGJPA.USERDETAILS";
	private final String USER = "SELECT * FROM SPRINGJPA.USERDETAILS WHERE FIRST_NAME = ?";
	@Autowired
	public UserDaoImpl(DataSource ds) {
		jt = new JdbcTemplate(ds);
	}

	@Override
	public List<User> getAllUserDetails() {
		// TODO Auto-generated method stub
		try {
			return jt.query(USERDETAILS,new UserMapper());
			}
			catch (EmptyResultDataAccessException e) {
		        return null;
			}
	}

	@Override
	public List<User> getUserDetail(String userName) {
		try {
			return jt.query(USER,new UserMapper(),new Object[] {userName});
			}
			catch (EmptyResultDataAccessException e) {
		        return null;
			}
		
	}
	
	
	
}
