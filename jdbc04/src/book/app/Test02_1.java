package book.app;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import book.dto.BookDto;
import book.util.JdbcUtil;

public class Test02_1 {
	public static void main(String[] args) {
		//사용자에게 등록된 모든 도서 목록을 출력
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		String sql = "select * from book order by book_serial asc";
		List<BookDto> list = template.query(sql, BookDto.getMapper());
		for(BookDto bookDto : list) {
			System.out.println(bookDto);
		}
	}
}
