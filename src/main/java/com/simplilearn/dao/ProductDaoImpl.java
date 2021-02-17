package com.simplilearn.dao;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.simplilearn.dao.mapper.ProductMapper;
import com.simplilearn.model.Product;
import com.simplilearn.service.ProductCatService;

@Component
public class ProductDaoImpl {
	
	
	JdbcTemplate jt;
	private final String ADDQUERY="INSERT INTO SPRINGJPA.PRODUCT(NAME,COMPANY,CATEGORY,SIZE,AMOUNT) VALUES(?,?,?,?,?)";
	private final String VIEWQUERY = "SELECT * FROM SPRINGJPA.PRODUCT";
	private final String DELETEQUERY = "DELETE FROM SPRINGJPA.PRODUCT WHERE ID =?";
	private final String FETCHQUERY = "SELECT * FROM SPRINGJPA.PRODUCT WHERE ID=?";
	private final String UPDATEQUERY = "UPDATE SPRINGJPA.PRODUCT SET NAME=?,COMPANY=?,CATEGORY=?,SIZE=?,AMOUNT=? WHERE ID=?";
	@Autowired
	ProductCatService pcs;
	
	public ProductDaoImpl(DataSource ds) {
		
		jt= new JdbcTemplate(ds);
		
	}
	
	public int productAdd(Product product) {
		try {
			
		return jt.update(ADDQUERY,product.getName(),product.getCompany(),product.getCategory(),product.getSize(),product.getAmount());
		}
		catch (EmptyResultDataAccessException e) {
	        return 0;
	}
	}
	
	public int productUpdate(Product product,int id) {
		try {
			
		return jt.update(UPDATEQUERY,product.getName(),product.getCompany(),product.getCategory(),product.getSize(),product.getAmount(),id);
		}
		catch (EmptyResultDataAccessException e) {
	        return 0;
	}
	}
	
	public ArrayList<Product> productView() {
		try {
			
		return (ArrayList<Product>) jt.query(VIEWQUERY,new ProductMapper());
		}
		catch (EmptyResultDataAccessException e) {
	        return null;
	}
	}
	
	public int  delete(int id) {
		try {
			
		return  jt.update(DELETEQUERY,id);
		}
		catch (EmptyResultDataAccessException e) {
	        return 0;
	}
	}
	
	public Product fetchData(int id) {
		try {
			
		return jt.queryForObject(FETCHQUERY,new Object[]{id},new ProductMapper());
		}
		catch (EmptyResultDataAccessException e) {
	        return null;
	}
	}
	
}
