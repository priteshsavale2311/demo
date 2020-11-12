package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String m1() {
		System.out.println("m1 called --");
		return "index";
	}

	@RequestMapping("/welcome")
	 public String m2() {
		 
		 System.out.println("m2 called --");
		 return "welcome";
	 }
	
	
	@RequestMapping("/welcomeform")
		public String m3(@RequestParam("t1") String t1 , @RequestParam("t2") String t2) {
		System.out.println(t1+" "+t2);
		
		return "index";
		
	}
	
	
	
}
