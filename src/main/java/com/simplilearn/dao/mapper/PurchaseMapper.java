package com.simplilearn.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.simplilearn.model.Purchase;


public class PurchaseMapper implements RowMapper<Purchase> {
	
	public Purchase mapRow(ResultSet rs,int i) {
		
		Purchase p = new Purchase();
		 try {
			p.setAmountPaid(rs.getInt("amount_paid"));
			p.setCategory(rs.getString("category"));
			p.setCompany(rs.getString("company"));
			p.setEmail(rs.getString("email"));
			p.setFirstName(rs.getString("first_name"));
			p.setPhoneNumber(rs.getInt("phone_number"));
			p.setProductName(rs.getString("product_name"));
			p.setPurchaseDate(rs.getString("purchase_date"));
			p.setQuantity(rs.getInt("quantity"));
			p.setSecondName(rs.getString("last_name"));
			p.setSize(rs.getInt("size"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return p;
		
	}

	

}
