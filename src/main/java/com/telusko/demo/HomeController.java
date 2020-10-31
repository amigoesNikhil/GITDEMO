package com.telusko.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home1")
	public ModelAndView home(@RequestParam("name")String myname) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", myname);
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("input")
	public ModelAndView input1() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("input1");
		return mv;
	}
	
	@RequestMapping("home")
	public ModelAndView home1(Alien a){
		ModelAndView mv=new ModelAndView();
		mv.addObject("alien", a);
		System.out.println(a.getAid()+":"+a.getAname());
		mv.setViewName("home");
		return mv;
	}

}
