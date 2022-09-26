package com.kh.spring13.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring13.entity.AttachmentDto;

@Repository
public class AttachmentDaoImpl implements AttachmentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<AttachmentDto> mapper = new RowMapper<>() {
		@Override
		public AttachmentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			return AttachmentDto.builder()
						.attachmentNo(rs.getInt("attachment_no"))
						.attachmentName(rs.getString("attachment_name"))
						.attachmentType(rs.getString("attachment_type"))
						.attachmentSize(rs.getLong("attachment_size"))
						.attachmentTime(rs.getDate("attachment_time"))
					.build();
		}
	};
	
	private ResultSetExtractor<AttachmentDto> extractor = new ResultSetExtractor<AttachmentDto>() {
		
		@Override
		public AttachmentDto extractData(ResultSet rs) throws SQLException, DataAccessException {
			if(rs.next()) {
				return AttachmentDto.builder()
						.attachmentNo(rs.getInt("attachment_no"))
						.attachmentName(rs.getString("attachment_name"))
						.attachmentType(rs.getString("attachment_type"))
						.attachmentSize(rs.getLong("attachment_size"))
						.attachmentTime(rs.getDate("attachment_time"))
					.build();
			}
			else {
				return null;
			}
		}
	};
	
	@Override
	public void insert(AttachmentDto attachmentDto) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<AttachmentDto> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public AttachmentDto selectOne(int attachmentNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean delete(int attachmentNo) {
		// TODO Auto-generated method stub
		return false;
	}
}

