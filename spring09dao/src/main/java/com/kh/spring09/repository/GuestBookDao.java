package com.kh.spring09.repository;

import com.kh.spring09.entity.GuestBookDto;

//DAO (Data Access Object)의 목차(추상체)
public interface GuestBookDao {
	//등록기능의 형태
	//insert into guest_book(no, name, memo) values(시퀀스, ?, ?)
	//void insert(String name, String memo);
	void insert(GuestBookDto dto);//등록기능
	boolean update(GuestBookDto dto);//수정 기능
	
}
