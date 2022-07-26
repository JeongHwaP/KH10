package book.app;

import org.springframework.jdbc.core.JdbcTemplate;

import book.util.JdbcUtil;

public class Test07_1 {
	public static void main(String[] args) {
		// 사용자가 원하는 번호에 해당하는 도서의 판매가를 변경

		// 준비
		int bookSerial = 3;
		int bookPrice = 50000;

		// 처리
		JdbcTemplate template = JdbcUtil.getTemplate();
		String sql = "update book " + "set book_price = ? " + "where book_serial = ?";
		Object[] param = { bookPrice, bookSerial };

		int result = template.update(sql, param);
		if (result > 0) {
			System.out.println("가격 설정 완료");
		} else {
			System.out.println("존재하지 않는 도서번호입니다");
		}
	}
}
