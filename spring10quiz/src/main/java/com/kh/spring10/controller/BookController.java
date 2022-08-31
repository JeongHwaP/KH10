package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring10.entity.BookDto;
import com.kh.spring10.repository.BookDao;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookDao bookDao;

	@RequestMapping("/add")
	@ResponseBody
	public String add(@ModelAttribute BookDto bookDto) {
		bookDao.insert(bookDto);
		return "도서 등록 완료";
	}

	@RequestMapping("/edit")
	@ResponseBody
	public String edit(@ModelAttribute BookDto bookDto) {
		if (bookDao.update(bookDto)) { // 성공(실행이 되고 바뀐 데이터가 있는 경우)
			return "도서 정보 변경 완료";
		} else { // 실패(실행은 됐지만 바뀐 데이터가 없는 경우)
			return "등록된 도서가 아닙니다";
		}
	}

	@RequestMapping("/remove")
	@ResponseBody
	public String remove(@RequestParam int bookSerial) {
		if (bookDao.delete(bookSerial)) { // 성공
			return "도서 삭제 성공";
		} else { // 실패
			return "등록된 도서가 아닙니다";
		}
	}

	@RequestMapping("/list")
	@ResponseBody
	public String list(@RequestParam(required = false) String type, @RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
		// boolean isList = type == null || keyword == null;

		List<BookDto> data;
		if (isSearch) { // 검색이면
			data = bookDao.selectList(type, keyword);
		} else { // 아니면(목록이면)
			data = bookDao.selectList();
		}

		return data.toString();
	}

	@RequestMapping("/detail")
	@ResponseBody
	public String detail(@RequestParam int bookSerial) {
		BookDto bookDto = bookDao.selectOne(bookSerial);
		if (bookDto != null) {
			return bookDto.toString();
		} else {
			return "도서가 존재하지 않습니다";
		}
	}
}
