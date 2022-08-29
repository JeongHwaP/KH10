package book.app;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import book.dto.BookDto;
import book.util.JdbcUtil;

public class Test05 {
	public static void main(String[] args) {
		// 사용자가 입력한 번호에 해당하는 도서의 정보를 출력
		// 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("도서 시리얼 번호 : ");
		int serial = sc.nextInt();
		sc.close();

		// DB
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "select * from book where instr(upper(book_serial), upper(?)) > 0";
		Object[] param = {serial};

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
