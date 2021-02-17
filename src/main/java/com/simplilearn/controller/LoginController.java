package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simplilearn.service.LoginService;

@Controller

public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		
		
		return "index";
		
		
		
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	
    public String showWelcomePage(ModelMap model, @RequestParam String username, @RequestParam String password){
		
		 model.put("name", username);
	        model.put("password", password);
		

        boolean isValidUser = ls.validateUser(username,password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "index";
        }
 
       

        return "welcome";
    }
	
	
	@RequestMapping(value = "/changePassword", method = RequestMethod.GET)
	public String changePassword(ModelMap model) {
		
		return "changePassword";
		
	}
	
	
	@RequestMapping(value = "/home")
	public String home(ModelMap model) {
		
		return "welcome";
		
	}
	
	
	@RequestMapping(value = "/password", method = RequestMethod.POST)
	public String changePassword(ModelMap model,@RequestParam String newPass) {
		
		
		if(newPass==null || newPass.contains(" ") || newPass.length()==0)
		{
			model.put("errorMessage","Please enter valid password without space");
			return "changePassword";
		
		}
		else {
			int count = ls.changePassword(newPass);
			
			if (count>0)
				return "password";
			else 
			return "index";
			
		}
			
	}
	
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public String error() {
		return "error";
	}


}
