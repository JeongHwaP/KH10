package com.kh.spring17.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring17.vo.ProductSearchVO;

@Controller
public class TestController {

	@RequestMapping("/")
	public String home(@ModelAttribute ProductSearchVO vo) {
		return "list";
	}
}
