package com.simplilearn.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.simplilearn.model.Product;
import com.simplilearn.model.User;

public class CategoryMapper implements RowMapper<String> {
	
	public String mapRow(ResultSet rs,int i) {
		String s = null;
		
		ArrayList<String> al = new ArrayList<String>();
		 try {
			
		 s= rs.getString("category");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return s;
		
	}

	

}
