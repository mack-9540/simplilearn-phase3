package com.simplilearn.dao;

import java.time.LocalDate;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.simplilearn.dao.mapper.CategoryMapper;
import com.simplilearn.dao.mapper.PurchaseMapper;
import com.simplilearn.model.Purchase;

@Component
public class PurchaseDaoImpl {
	
	private final String PURCHASEQUERY="SELECT * FROM springjpa.purchase T1,SPRINGJPA.USERDETAILS T2 WHERE T1.USERID = T2.ID";
	private final String PURCHASEQUERYDATE="SELECT * FROM springjpa.purchase T1,SPRINGJPA.USERDETAILS T2 WHERE T1.USERID = T2.ID AND PURCHASE_DATE>=? AND PURCHASE_DATE<=?";
	private final String PURCHASEQUERYCATEGORY="SELECT * FROM springjpa.purchase T1,SPRINGJPA.USERDETAILS T2 WHERE T1.USERID = T2.ID AND T1.CATEGORY=?";
	private final String CATEGORYQUERY="SELECT DISTINCT CATEGORY FROM SPRINGJPA.PRODUCT";
	
	JdbcTemplate jt;
	
	@Autowired
	public PurchaseDaoImpl(DataSource ds) {
		jt = new JdbcTemplate(ds);
	}
	
	public List<Purchase> getPurchaseReport(){
		return jt.query(PURCHASEQUERY, new PurchaseMapper());
	}
	
	public List<Purchase> getPurchaseReportCategory(String category){
		return jt.query(PURCHASEQUERYCATEGORY, new PurchaseMapper(),category);
	}
	
	
	public List<Purchase> getPurchaseReportDate(String fromDate,String toDate){
		
		return jt.query(PURCHASEQUERYDATE, new PurchaseMapper(),fromDate,toDate);
	}
	public List<String> fetchCategoryList(){
		return jt.query(CATEGORYQUERY, new CategoryMapper());
	}

}
