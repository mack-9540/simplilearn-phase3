package com.simplilearn.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.simplilearn.model.Product;
import com.simplilearn.model.User;

public class ProductMapper implements RowMapper<Product> {
	
	public Product mapRow(ResultSet rs,int i) {
		
		Product p = new Product();
		 try {
			 p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setAmount(rs.getInt("Amount"));
			p.setCategory(rs.getString("category"));
			p.setCompany(rs.getString("company"));
			p.setSize(rs.getInt("size"));
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return p;
		
	}

	

}
