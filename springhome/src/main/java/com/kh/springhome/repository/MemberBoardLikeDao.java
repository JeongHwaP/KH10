package com.kh.springhome.repository;

import com.kh.springhome.entity.MemberBoardLikeDto;

public interface MemberBoardLikeDao {
	void insert(MemberBoardLikeDto dto);
	void delete(MemberBoardLikeDto dto);
//	MemberBoardLikeDto selectOne(MemberBoardLikeDto dto);
	boolean check(MemberBoardLikeDto dto);
	int count(int boardNo);
	void refresh(int boardNo);
}
