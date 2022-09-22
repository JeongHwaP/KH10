package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.ReplyDto;

public interface ReplyDao {
	void insert(ReplyDto replyDto);
	List<ReplyDto> selectList(int replyOrigin); //댓글은 전체 목록이 있을수 없다.
	boolean update(ReplyDto replyDto);
	boolean delete(int replyNo);
}
