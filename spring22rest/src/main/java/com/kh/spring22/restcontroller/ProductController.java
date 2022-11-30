package com.kh.spring22.restcontroller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.entity.ProductDto;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest")
public class ProductController {

	@Autowired
	private SqlSession sqlSession;
	
	@GetMapping("/product")
	public List<ProductDto> productList(){
		return sqlSession.selectList("product.list");
	}
	
}