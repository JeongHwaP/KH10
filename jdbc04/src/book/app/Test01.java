package book.app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import book.util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		//사용자에게 필요한 정보를 입력받아 도서를 등록
		//사용자에게 입력받을 데이터 - 도서명, 저자, 출판사, 판매가, 장르
		Scanner sc = new Scanner(System.in);
		System.out.print("도서명 : ");
		String bookName = sc.next();
		sc.nextLine();
		System.out.print("저자 : ");
		String bookWriter = sc.next();
		System.out.print("출판사 : ");
		String bookPublisher = sc.next();
		System.out.print("판매가 : ");
		int bookPrice = sc.nextInt();
		System.out.print("장르 : ");
		String bookGenre = sc.next();
		sc.close();
		
		//DB 처리
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "insert into book(book_serial, book_name, book_writer,"
				+ " book_publisher, book_price, book_genre, creation_time)"
				+ "values(book_seq.nextval, ?, ?, ?, ?, ?, sysdate)";
		Object[]param = {bookName, bookWriter, bookPublisher, bookPrice, bookGenre};
		
		template.update(sql, param);
		System.out.println("등록 완료");
	}
}
