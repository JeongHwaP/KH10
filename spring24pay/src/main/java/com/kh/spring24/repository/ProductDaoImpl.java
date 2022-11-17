package com.kh.spring24.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring24.entity.ProductDto;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<ProductDto> list() {
		return sqlSession.selectList("product.complex7");
	}

}
