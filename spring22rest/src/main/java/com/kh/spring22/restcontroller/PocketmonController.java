package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.entity.PocketMonsterDto;
import com.kh.spring22.repository.PocketMonsterDao;

@RestController
@RequestMapping("/rest")
public class PocketmonController {
	
	@Autowired
	private PocketMonsterDao dao;
	
	@GetMapping("/pocketmon")
	public List<PocketMonsterDto> list(){
		return dao.list();
	}
	
//	@PostMapping("/pocketmon")
//	@PutMapping("/pocketmon")
//	@DeleteMapping("/pocketmon")
}
