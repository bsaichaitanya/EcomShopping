package com.niit.ecomshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homePage(){
		System.out.println("Executing this method homepage");
		return "home";
	}
	
	@RequestMapping("/Login")
	public ModelAndView showLoginPage()
	{
		ModelAndView mv= new ModelAndView("home");
		mv.addObject("msg", "you clicked login link");
	mv.addObject("showLoginPage", "true");
		return mv;
		//in login.jsp-$(msg)
	}
	
	@RequestMapping("/register")
	public ModelAndView registrationpage()
	{
		ModelAndView mv= new ModelAndView("home");
	mv.addObject("msg", "you clicked registration link");
	mv.addObject("showRegistrationPage", "true");
		return mv;
	}
	
	
	
	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("id")String id,@RequestParam("password")String pwd)
	{

		System.out.println("id:" +id);
		System.out.println("pwd" +pwd);
		System.out.println("in validate method");
		ModelAndView mv = new ModelAndView("home");
		UserDao d= new UserDao();
		
		if(d.isvalid(id, pwd)==true)
		{
				mv.addObject("successMsg","logined sucessfully");
		}
		else{
			mv.addObject("errorMsg"," please login with correct credentials");
		}
		return mv;
//		if credentials are correct -- show message welcome---else show message and invalid credetials +login page-should be in home page		
		
	}
	

	

}
