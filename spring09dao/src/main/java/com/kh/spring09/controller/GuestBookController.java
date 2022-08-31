package com.kh.spring09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring09.entity.GuestBookDto;
import com.kh.spring09.repository.GuestBookDao;

@Controller
public class GuestBookController {

	@Autowired
	private GuestBookDao guestBookDao;
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(@ModelAttribute GuestBookDto dto) {
		guestBookDao.insert(dto);
		return "등록 완료!";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(@ModelAttribute GuestBookDto dto) {
		boolean result = guestBookDao.update(dto);
		if(result) {
			return "변경 성공";
		}
		else {
			return "없는 번호";
		}
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(@RequestParam int no) {
//		boolean result = guestBookDao.delete(no);
		if(guestBookDao.delete(no)) {
			return "삭제 완료";
		}
		else {
			return "없는 번호";
		}
	}
}
