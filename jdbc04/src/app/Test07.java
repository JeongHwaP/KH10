package app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test07 {
	public static void main(String[] args) {
		// 사용자가 원하는 번호에 해당하는 도서의 판매가를 변경
		Scanner sc = new Scanner(System.in);
		System.out.print("도서 번호 : ");
		int bookSerial = sc.nextInt();
		System.out.print("변경할 도서 판매가 : ");
		int bookPrice = sc.nextInt();
		sc.close();

		// DB 처리
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "update book " + "set book_price=? " + "where book_serial=?";
		Object[] param = { bookPrice, bookSerial };

		int result = template.update(sql, param);
		if (result > 0) {
			System.out.println("정보 변경 완료");
		} else {
			System.out.println("존재하지 않는 도서 번호입니다");
		}
	}
}
