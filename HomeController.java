package com.niit.ecomshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	

}
