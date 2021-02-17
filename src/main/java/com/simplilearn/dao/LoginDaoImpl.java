package com.simplilearn.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.simplilearn.dao.mapper.LoginMapper;
import com.simplilearn.model.Login;

@Component
public class LoginDaoImpl implements LoginDao {
	
	JdbcTemplate jdbcTemplate;
	
	private final String USERNAME= "SELECT * FROM SPRINGJPA.LOGIN WHERE USERNAME = ?";
	private final String CHANGEPASSWORD = "UPDATE SPRINGJPA.LOGIN SET PASSWORD = ?";
	
	@Autowired
	public LoginDaoImpl(DataSource ds) {
		
		jdbcTemplate = new JdbcTemplate(ds);
		
	}
	
	public Login getUserDetails(String userName) {
		try {
		return jdbcTemplate.queryForObject(USERNAME, new Object[] {userName},new LoginMapper());
		}
		catch (EmptyResultDataAccessException e) {
	        return null;
	}
	}

	@Override
	public int changePassword(String password) {
		try {
			return jdbcTemplate.update(CHANGEPASSWORD, password);
			}
			catch (EmptyResultDataAccessException e) {
		        return 0;
	}

}
}
