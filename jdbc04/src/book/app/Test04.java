package book.app;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import book.dto.BookDto;
import book.util.JdbcUtil;

public class Test04 {
	public static void main(String[] args) {
		// 사용자가 입력한 검색어에 해당하는 도서명/저자/출판사의 도서를 출력(셋 중 하나)
		// 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("도서명이나 저자, 출판사를 입력하세요.");
		String keyword = sc.next();
		sc.close();

		// DB
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "select * from book where instr(upper(book_name), upper(?)) > 0"
				+ "or instr(upper(book_writer), upper(?)) > 0"
				+ "or instr(upper(book_publisher), upper(?)) > 0";
		Object[] param = {keyword, keyword, keyword};

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
		List<BookDto> list = template.query(sql, mapper, param);
		for (BookDto bookDto : list) {
			System.out.println(bookDto);
		}
	}
}
