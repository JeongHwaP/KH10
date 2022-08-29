package book.app;

import org.springframework.jdbc.core.JdbcTemplate;

import book.dto.BookDto;
import book.util.JdbcUtil;

public class Test06_2 {
	public static void main(String[] args) {
		// 사용자가 원하는 번호에 해당하는 도서의 정보(이름, 출판사, 저자, 장르)를 변경
		// 1. 도서번호를 이용하여 도서를 조회
		// 2. 사용자에게 정보를 입력받아 입력되지 않은 항목은 기존 정보로 변경
		
		// 준비
		int bookSerial = 5;

		// 단일조회 코드(Test05)
		JdbcTemplate template = JdbcUtil.getTemplate();
		String sql = "select * from book where book_serial = ?";
		Object[] param = { bookSerial };

		BookDto bookDto = template.query(sql, BookDto.getExtractor(), param);
		if (bookDto == null) {
			System.out.println("존재하지 않는 도서번호 입니다");
			System.exit(-1);// 비정상 종료
		}

		String bookName = "테스트";
		String bookWriter = "테스트";
		String bookPublisher = "";
		String bookGenre = "";

		if (!bookName.isEmpty()) {// 바꿀 bookName이 있다면
			bookDto.setBookName(bookName);// 원래정보를 교체
		}
		if (!bookWriter.isEmpty()) {
			bookDto.setBookWriter(bookWriter);
		}
		if (!bookPublisher.isEmpty()) {
			bookDto.setBookPublisher(bookPublisher);
		}
		if (!bookGenre.isBlank()) {
			bookDto.setBookGenre(bookGenre);
		}

		// 처리
		sql = "update book " + "set " + "book_name = ?, " + "book_writer = ?, " + "book_publisher = ?, "
				+ "book_genre = ? " + "where book_serial = ?";
		Object[] param2 = { bookDto.getBookName(), bookDto.getBookWriter(), bookDto.getBookPublisher(),
				bookDto.getBookGenre(), bookDto.getBookSerial() };
		int result = template.update(sql, param2);
		if (result > 0) {
			System.out.println("정보 변경이 완료되었습니다");
		} else {
			System.out.println("존재하지 않는 도서번호입니다");
		}
	}
}
