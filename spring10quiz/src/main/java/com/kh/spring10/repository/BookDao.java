package com.kh.spring10.repository;

import java.util.List;

import com.kh.spring10.entity.BookDto;

public interface BookDao {

	void insert(BookDto bookDto); //등록
	boolean update(BookDto bookDto); //수정
	boolean delete(int bookSerial); //삭제
	List<BookDto> selectList(); //조회
	List<BookDto> selectList(String type, String keyword);//검색
	BookDto selectOne(int bookSerial);//상세
}
