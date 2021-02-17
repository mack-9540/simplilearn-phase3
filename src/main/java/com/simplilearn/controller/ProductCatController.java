package com.simplilearn.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.model.Product;
import com.simplilearn.service.ProductCatService;

@Controller
public class ProductCatController {
	
	@Autowired
	ProductCatService pcs;
	@RequestMapping(value="/productCat",method = RequestMethod.GET)
	public String product()
	{
		return "product";
	}
	
	@RequestMapping(value="/productCatAdd",method=RequestMethod.GET)
	public String addProductcat(@RequestParam int isModify,@RequestParam int pid1,ModelMap model)
	{
		
		if(isModify==1) {
			Product p = pcs.fetchDataFromId(pid1);
			model.put("al", p);
		}
		
		
		return "productAdd";
	}
	
	@RequestMapping(value="/productCatView",method=RequestMethod.GET)
	public String productCatdelete(ModelMap model)
	{
		ArrayList<Product> al = pcs.viewProduct();
		
		model.put("al", al);
		
		
		return "productView";
	}
	
	@RequestMapping(value="/backCat",method=RequestMethod.GET)
	public String backCat()
	{
		return "product";
	}
	
	@RequestMapping(value="/productAdd",method=RequestMethod.POST)
	public String addProduct(@RequestParam String pName,@RequestParam String pCategory,@RequestParam String pCompany,@RequestParam int pSize,@RequestParam int pAmount,ModelMap model,@RequestParam int isModify,@RequestParam int pid1)
	
	{
		String name=pName.trim();
		String company=pCompany.trim();
		String category=pCategory.trim();
		if(isModify == 0)
		{
			if(name==null || name.length()==0 || company==null || company.length()==0 || category==null || category.length()==0) {
				model.put("errorMessage", "INVALID FIELDS");
				return "productAdd";
			}
		
		pcs.addProduct(pName, pCompany, pCategory, pSize, pAmount);
		}
		else {
			pcs.updateProduct(pName, pCompany, pCategory, pSize, pAmount,pid1);
		}
		return "productAddForm";
		
	}
	
	@RequestMapping(value="/delete")
	public String delete(@RequestParam int pid1)
	{
		
		
		System.out.println(pid1);
		boolean flag=pcs.delete(pid1);
		if(flag)
		return "productAddForm";
		else 
			return "index";
	}
}
