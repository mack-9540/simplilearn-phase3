package com.simplilearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.ProductDaoImpl;
import com.simplilearn.model.Product;

@Service
public class ProductCatService {
	
	@Autowired
	ProductDaoImpl pdi;

	public Product addProduct(String name,String company, String category,int size,int amount) {
		int count = 0;
		Product p = new Product(name,category,company,size,amount);
		count =pdi.productAdd(p);
		
		if(count>0)
		
		return p;
		
		else
			return null;
	}
	
	public Product updateProduct(String name,String company, String category,int size,int amount,int id) {
		int count = 0;
		Product p = new Product(name,category,company,size,amount);
		count =pdi.productUpdate(p,id);
		
		if(count>0)
		
		return p;
		
		else
			return null;
	}
	
	public ArrayList<Product> viewProduct() {
		
		ArrayList<Product> al = new ArrayList<Product>();
		
		al= (ArrayList<Product>)pdi.productView();
		
		return al;
		
		
	}
	
	public boolean delete(int id) {
		
		int count =0;
		
		count=pdi.delete(id);
		
		if (count>0)
			return true;
		else
			return false;
	}
	
	public Product fetchDataFromId(int id){
		Product p= new Product();
		p=pdi.fetchData(id);
		return p;
	}
	
}
