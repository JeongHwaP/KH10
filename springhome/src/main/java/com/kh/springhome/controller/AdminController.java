package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springhome.repository.PocketMonsterDao;

@Controller
@RequestMapping("/admin")//공용주소
public class AdminController {
	
	@Autowired
	private PocketMonsterDao pocketMonsterDao;

	@GetMapping("/home")
	public String home() {
//		return "/WEB-INF/views/admin/home.jsp";
		return "admin/home";
	}
	
	@GetMapping("/pocketmon")
	public String pocketmon(Model model) {
		model.addAttribute("list", pocketMonsterDao.selectCountList());
//		return "/WEB-INF/views/admin/pocketmon.jsp";
		return "admin/pocketmon";
	}
	
}
