package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.BoardDto;

public interface BoardDao {
	void insert(BoardDto boardDto);
	List<BoardDto> selectList();
	List<BoardDto> selectList(String type, String keyword);
//	DTO selectOne(PK);
//	boolean update(DTO);
//	boolean delete(PK);
	void clear();
}
