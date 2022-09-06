package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.entity.GuestBookDto;
import com.kh.springhome.repository.GuestBookDao;

@Controller
@RequestMapping("/guestbook")
public class GuestBookController {
	@Autowired
	private GuestBookDao guestBookDao;
	
	@GetMapping("/insert")
	public String insert() {
//		return "/WEB-INF/views/guestbook/insert.jsp";
		return "guestbook/insert";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute GuestBookDto dto) {
		guestBookDao.insert(dto);
		return "redirect:insert_success";//상대경로
//		return "redirect:/guestbook/insert_success";//절대경로
	}
	
	@GetMapping("/insert_success")
	public String insertSuccess() {
//		return "/WEB-INF/views/guestbook/insertSuccess.jsp";
		return "guestbook/insertSuccess";
	}
	
	@GetMapping("/list")
	public String list(Model model, 
					@RequestParam(required = false) String type,
					@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
		if(isSearch) {//검색
			model.addAttribute("list", guestBookDao.selectList(type, keyword));
		}
		else {//목록
			model.addAttribute("list", guestBookDao.selectList());
		}
		return "guestbook/list";
	}
	
}
