package com.kh.springhome.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(BoardDto boardDto) {
		String sql = "insert into board("
							+ "board_no, board_title, board_writer,"
							+ "board_content, board_head"
						+ ") values(board_seq.nextval, ?, ?, ?, ?)";
		Object[] param = {
			boardDto.getBoardTitle(), boardDto.getBoardWriter(),
			boardDto.getBoardContent(), boardDto.getBoardHead()
		};
		jdbcTemplate.update(sql, param);
	}
	
	@Override
	public void clear() {
		String sql = "delete board";
		jdbcTemplate.update(sql);
	}
	
	private RowMapper<BoardDto> mapper = new RowMapper<BoardDto>() {
		@Override
		public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			return BoardDto.builder()
							.boardNo(rs.getInt("board_no"))
							.boardTitle(rs.getString("board_title"))
							.boardContent(rs.getString("board_content"))
							.boardWriter(rs.getString("board_writer"))
							.boardHead(rs.getString("board_head"))
							.boardRead(rs.getInt("board_read"))
							.boardLike(rs.getInt("board_like"))
							.boardWritetime(rs.getDate("board_writetime"))
							.boardUpdatetime(rs.getDate("board_updatetime"))
						.build();
		}
	};

	@Override
	public List<BoardDto> selectList() {
		String sql = "select * from board order by board_no desc";
		return jdbcTemplate.query(sql, mapper);
	}

	@Override
	public List<BoardDto> selectList(String type, String keyword) {
		String sql = "select * from board "
						+ "where instr(#1, ?) > 0 "
						+ "order by board_no desc";
		sql = sql.replace("#1", type);
		Object[] param = {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}
}
