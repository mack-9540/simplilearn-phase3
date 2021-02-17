package com.simplilearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.PurchaseDaoImpl;
import com.simplilearn.model.Purchase;

@Service
public class PurchaseService {
	
	
	@Autowired
	PurchaseDaoImpl pd;
	public List<Purchase> getPurchaseReport(){
		List<Purchase> al = new ArrayList<>();
		
		al = pd.getPurchaseReport();
		return al;
	}
	
	public List<Purchase> getPurchaseReportCategory(String category){
		List<Purchase> al = new ArrayList<>();
		
		al = pd.getPurchaseReportCategory(category);
		return al;
	}
	
	public List<Purchase> getPurchaseReportDate(String fromDate,String toDate){
		List<Purchase> al = new ArrayList<>();
		
		al = pd.getPurchaseReportDate(fromDate,toDate);
		return al;
	}
	
	public List<String> getCategory()
	{
		List<String> al = new ArrayList();
		al=pd.fetchCategoryList();
		
		return al;
	}

}
