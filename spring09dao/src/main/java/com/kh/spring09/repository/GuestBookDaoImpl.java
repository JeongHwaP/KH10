package com.kh.spring09.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring09.entity.GuestBookDto;

//DAO (data Access Object)의 본문(구현체)
@Repository
public class GuestBookDaoImpl implements GuestBookDao {
	//등록기능의 형태 + 코드

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(GuestBookDto dto) {
		String sql = "insert into guest_book(no, name, memo) "
					+ "values(guest_book_seq.nextval, ?, ?";
		Object[]param= {dto.getName(), dto.getMemo()};
		jdbcTemplate.update(sql, param);
	}

	@Override
	public boolean update(GuestBookDto dto) {
		String sql = "update guest_book set name=?, memo=? where no=?";
		Object[]param= {dto.getName(), dto.getMemo(), dto.getNo()};
		int result = jdbcTemplate.update(sql, param);
//		if(result>0) {
//			return true;
//		}
//		else {			
//			return false;
//		} //rssult가 0보다 크면 true를 반환하고 아니면 false를 반환해라
		return result>0; //result가 0보다 큰지 파악해서 반환해라
	}
	
}
