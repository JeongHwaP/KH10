package app;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.BookDto;
import util.JdbcUtil;

public class Test03 {
	public static void main(String[] args) {
		// 사용자가 입력한 검색어에 해당하는 장르의 도서를 출력
		// 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("장르 : ");
		String keyword = sc.next();
		sc.close();
		
		// DB
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "select * from book where instr(upper(book_genre), upper(?)) > 0";
		Object[] param = {keyword};
		
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
