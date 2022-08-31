package com.kh.spring10.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring10.entity.BookDto;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<BookDto> mapper = new RowMapper<BookDto>() {
		@Override
		public BookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BookDto bookDto = new BookDto();
			bookDto.setBookSerial(rs.getInt("book_serial"));
			bookDto.setBookName(rs.getString("book_name"));
			bookDto.setBookWriter(rs.getString("book_writer"));
			bookDto.setBookPublisher(rs.getString("book_publisher"));
			bookDto.setBookPrice(rs.getInt("book_price"));
			bookDto.setBookGenre(rs.getString("book_genre"));
			bookDto.setCreationTime(rs.getDate("creation_time"));
			return bookDto;
		}
	};

	private ResultSetExtractor<BookDto> extractor = new ResultSetExtractor<BookDto>() {
		@Override
		public BookDto extractData(ResultSet rs) throws SQLException, DataAccessException {
			if (rs.next()) {
				BookDto bookDto = new BookDto();
				bookDto.setBookSerial(rs.getInt("book_serial"));
				bookDto.setBookName(rs.getString("book_name"));
				bookDto.setBookWriter(rs.getString("book_writer"));
				bookDto.setBookPublisher(rs.getString("book_publisher"));
				bookDto.setBookPrice(rs.getInt("book_price"));
				bookDto.setBookGenre(rs.getString("book_genre"));
				bookDto.setCreationTime(rs.getDate("creation_time"));
				return bookDto;
			} else {
				return null;
			}
		}
	};

	@Override
	public void insert(BookDto bookDto) {
		String sql = "insert into book(" + "book_serial, book_name, book_writer, "
				+ "book_publisher, book_price, book_genre," + "creation_time" + ") values("
				+ "book_seq.nextval, ?, ?, ?, ?, ?, sysdate" + ")";
		Object[] param = { bookDto.getBookName(), bookDto.getBookWriter(), bookDto.getBookPublisher(),
				bookDto.getBookPrice(), bookDto.getBookGenre() };
		jdbcTemplate.update(sql, param);
	}

	@Override
	public boolean update(BookDto bookDto) {
		String sql = "update " + "set " + "book_name=?, book_writer=?, book_publisher=?, "
				+ "book_genre=?, book_price=? " + "where book_serial=?";
		Object[] param = { bookDto.getBookName(), bookDto.getBookWriter(), bookDto.getBookPublisher(),
				bookDto.getBookGenre(), bookDto.getBookPrice(), bookDto.getBookSerial() };
		return jdbcTemplate.update(sql, param) > 0;
	}

	@Override
	public boolean delete(int bookSerial) {
		String sql = "delete book where book_serial = ?";
		Object[] param = { bookSerial };
		return jdbcTemplate.update(sql, param) > 0;
	}

	@Override
	public List<BookDto> selectList() {
		String sql = "select * from book order by book_serial asc";
		return jdbcTemplate.query(sql, mapper);
	}

	@Override
	public List<BookDto> selectList(String type, String keyword) {
		String sql = "select * from book where instr(#1, ?) > 0 " + "order by #1 asc";
		sql = sql.replace("#1", type);
		Object[] param = { keyword };
		return jdbcTemplate.query(sql, mapper, param);
	}

	@Override
	public BookDto selectOne(int bookSerial) {
		String sql = "select * from book where book_serial = ?";
		Object[] param = { bookSerial };
		return jdbcTemplate.query(sql, extractor, param);
	}

}
