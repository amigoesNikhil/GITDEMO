package com.nikhil.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView input1() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("input1");
		System.out.println("get input file");
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView home1(Alien a){
		System.out.println("in home");
		ModelAndView mv=new ModelAndView();
		mv.addObject("alien", a);
		System.out.println(a.getAid()+":"+a.getAname());
		mv.setViewName("home");
		return mv;
	}
}
