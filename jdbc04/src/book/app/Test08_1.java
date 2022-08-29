package book.app;

import org.springframework.jdbc.core.JdbcTemplate;

import book.util.JdbcUtil;

public class Test08_1 {
	public static void main(String[] args) {
		// 사용자가 원하는 번호에 해당하는 도서의 정보를 삭제

		// 준비
		int bookSerial = 7;

		// 처리
		JdbcTemplate template = JdbcUtil.getTemplate();
		String sql = "delete book where book_serial = ?";
		Object[] param = { bookSerial };

		int result = template.update(sql, param);
		if (result > 0) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("존재하지 않는 도서 번호");
		}
	}
}
