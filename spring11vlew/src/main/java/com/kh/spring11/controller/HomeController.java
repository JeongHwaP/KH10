package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/hello")
	//@ResponseBody //화면을 이제 사용할 예정
	public String hello() {
//		return /*/WEB-INF/views/*/"hello"/*.jsp*/;
		return "hello";
	}
	
	@RequestMapping("/test")
	public String test() {
		//return "/WEB-INF/views/test.jsp";
		return"test";
	}
	
}
