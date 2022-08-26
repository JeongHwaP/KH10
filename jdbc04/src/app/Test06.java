package app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test06 {
	public static void main(String[] args) {
		// 사용자가 원하는 번호에 해당하는 도서의 정보(이름, 출판사, 저자, 장르)를 변경
		Scanner sc = new Scanner(System.in);
		System.out.print("도서 번호 : ");
		int bookSerial = sc.nextInt();
		sc.nextLine();
		System.out.print("변경할 도서명 : ");
		String bookName = sc.next();
		System.out.print("변경할 저자 : ");
		String bookWriter = sc.next();
		System.out.print("변경할 출판사 : ");
		String bookPublisher = sc.next();
		System.out.print("변경할 장르 : ");
		String bookGenre = sc.next();
		sc.close();
		
		// DB 처리
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "update book " + "set book_name=?, book_writer=?, book_publisher=?, book_genre=?" + "where book_serial=?";
		Object[] param = {bookName, bookWriter, bookPublisher, bookGenre, bookSerial};

		int result = template.update(sql, param);
		if (result > 0) {
			System.out.println("정보 변경 완료");
		} else {
			System.out.println("존재하지 않는 도서 번호입니다");
		}
	}
}
