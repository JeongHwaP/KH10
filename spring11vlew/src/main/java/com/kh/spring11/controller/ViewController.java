package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tag")
public class ViewController {

	@RequestMapping("/test01")
	public String test01() {
//		return "/WEB-INF/views/tag/test01.jsp";
		return "tag/test01";
	}
	
	@RequestMapping("/test02")
	public String test02() {
//		return "/WEB-INF/views/tag/test02.jsp";
		return "tag/test02";
	}
	
	@RequestMapping("/test03")
	public String test03() {
//		return"/WEB-INF/views/tag/test03.jsp";
		return "tag/test03";
	}

	@RequestMapping("/test04")
	public String test04() {
//		return"/WEB-INF/views/tag/test04.jsp";
		return "tag/test04";
	}
	
}
