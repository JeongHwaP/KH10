package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.BoardDto;
import com.kh.springhome.vo.BoardListSearchVO;

public interface BoardDao {
	void insert(BoardDto boardDto);
	List<BoardDto> selectList();
	List<BoardDto> selectList(BoardListSearchVO vo);
	BoardDto selectOne(int boardNo);
//	boolean update(DTO);
//	boolean delete(PK);
	void clear();
}
