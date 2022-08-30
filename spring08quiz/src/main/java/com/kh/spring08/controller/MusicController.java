package com.kh.spring08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music")
public class MusicController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
}
