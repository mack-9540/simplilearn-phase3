package com.simplilearn.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simplilearn.model.User;
import com.simplilearn.service.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	UserService us;
	
	@RequestMapping(value ="/details",method=RequestMethod.GET)
	
	public String showUserDetails(ModelMap model) {
		
		ArrayList<User> al=us.getAllUserNames();
		model.put("al", al);
		
		System.out.println();
		
		return "userdetails";
	}
	
@RequestMapping(value ="/userSearch",method=RequestMethod.GET)
	
	public String showUser(ModelMap model) {
	
	
	
		
		System.out.println();
		
		return "userSearch";
	}
	

@RequestMapping(value ="/searchdetails",method=RequestMethod.POST)

public String showUser1(ModelMap model,@RequestParam String name) {



	ArrayList<User> al=us.getUserName(name);
	model.put("al", al);
	
	System.out.println();
	
	
	
	return "user";
}


}
