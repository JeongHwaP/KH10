package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.repository.BoardDao;
import com.kh.springhome.vo.BoardListSearchVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	
//	참고 : ModelAttribute로 수신한 데이터는 자동으로 Model에 첨부된다
//	- 옵션에 name을 작성하면 해당하는 이름으로 model에 첨부
	@GetMapping("/list")
	public String list(Model model,
			@ModelAttribute(name="vo") BoardListSearchVO vo) {
		if(vo.isSearch()) {
			model.addAttribute("list", boardDao.selectList(vo));
		}
		else{
			model.addAttribute("list", boardDao.selectList());
		}
//		return "/WEB-INF/views/board/list.jsp";
		return "board/list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
		model.addAttribute("boardDto", boardDao.selectOne(boardNo));
		return "board/detail";
	}
	
}
