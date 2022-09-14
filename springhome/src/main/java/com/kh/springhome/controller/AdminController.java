package com.kh.springhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")//공용주소
public class AdminController {

	@GetMapping("/home")
	public String home() {
//		return "/WEB-INF/views/admin/home.jsp";
		return "admin/home";
	}
	
}
