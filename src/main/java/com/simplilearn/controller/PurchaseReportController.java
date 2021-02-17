package com.simplilearn.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.model.Purchase;
import com.simplilearn.service.PurchaseService;

@Controller
public class PurchaseReportController {
	
		
	@Autowired
	PurchaseService ps;
	@RequestMapping(value="/purchaseReport",method=RequestMethod.GET)
	public String purchaseReport(ModelMap model) {
		List<Purchase> al = new ArrayList<Purchase>();
		List<String> al2 = new ArrayList<String>();
		al= ps.getPurchaseReport();
		al2=ps.getCategory();
		model.put("al",al);
		model.put("al2",al2);
		return "purchase";
	}
	
	@RequestMapping(value="/filterCategory",method=RequestMethod.GET)
	public String filterCategory(ModelMap model) {
		
		int flag=0;
		List<String> al2 = new ArrayList<String>();
		al2=ps.getCategory();
		
		model.put("al2",al2);
		model.put("flag", flag);
		
		return "categoryFilter";
	}
	
	@RequestMapping(value="/filterDate",method=RequestMethod.GET)
	public String filterDate(ModelMap model) {
		int flag=1;
		List<String> al2 = new ArrayList<String>();
		al2=ps.getCategory();
		
		model.put("al2",al2);
		model.put("flag", flag);
		
		
		return "categoryFilter";
	}
	
	@RequestMapping(value="/filterCategoryFetch",method=RequestMethod.GET)
	public String filterCategoryFetch(@RequestParam String category,ModelMap model)
	{
		ArrayList<Purchase> al=(ArrayList<Purchase>) ps.getPurchaseReportCategory(category);
		model.put("al", al);
		return "purchase";
	}
	
	
	@RequestMapping(value="/filterdateFetch",method=RequestMethod.GET)
	public String filterdateFetch(@RequestParam String fromDate,@RequestParam String toDate,ModelMap model)
	{
		
		
		ArrayList<Purchase> al=(ArrayList<Purchase>) ps.getPurchaseReportDate( fromDate, toDate);
		model.put("al", al);
		
		return "purchase";
	}

}
