package com.kh.springhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.springhome.repository.PocketMonsterDao;
import com.kh.springhome.vo.PocketMonsterCountVO;

@CrossOrigin(origins = {"http://127.0.0.1:5500"})
@RestController
@RequestMapping("/rest/pocketmon")
public class PocketMonsterRestController {
	
	@Autowired
	private PocketMonsterDao pocketMonsterDao;
	
	@GetMapping("/count")
	public List<PocketMonsterCountVO> count(){
		return pocketMonsterDao.selectCountList();
	}

}
