package com.my.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView Index(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("message","welcome to the party!!!!");
		return mv;
	}
}
