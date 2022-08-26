package app;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.BookDto;
import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) {
		// 사용자에게 등록된 모든 도서 목록을 출력
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "select * from book";

		RowMapper<BookDto> mapper = (rs, idx) -> {
			BookDto bookDto = new BookDto();
			bookDto.setBookSerial(rs.getInt("book_serial"));
			bookDto.setBookName(rs.getString("book_name"));
			bookDto.setBookWriter(rs.getString("book_writer"));
			bookDto.setBookPublisher(rs.getString("book_publisher"));
			bookDto.setBookPrice(rs.getInt("book_price"));
			bookDto.setBookGenre(rs.getString("book_genre"));
			bookDto.setCreationTime(rs.getDate("creation_time"));
			return bookDto;
		};
		List<BookDto> list = template.query(sql, mapper);
		for (BookDto bookDto : list) {
			System.out.println(bookDto);
		}
	}
}
