package com.kh.spring09.repository;

import java.util.List;

import com.kh.spring09.entity.GuestBookDto;

//DAO (Data Access Object)의 목차(추상체)
public interface GuestBookDao {
	//등록기능의 형태
	//insert into guest_book(no, name, memo) values(시퀀스, ?, ?)
	//void insert(String name, String memo);
	void insert(GuestBookDto dto);//등록기능
	
	boolean update(GuestBookDto dto);//수정 기능
	
//	반환형 이름(매개변수);//삭제 기능
	boolean delete(int no);
	
//	반환형 이름(매개변수);//목록 기능
	List<GuestBookDto> selectList();
	
	List<GuestBookDto> selectList(String type, String keyword);//검색 기능
	
	GuestBookDto selectOne(int no);//상세 기능
}
