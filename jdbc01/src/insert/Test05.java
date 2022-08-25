package insert;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		//방명록(guest_book) 테이블에 데이터를 등록할 수 있도록 구현
		
		//insert into guest_book(no, name, memo)
		//values(guest_book_seq.nextval, '테스트', '테스트내용');
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 작성 : ");
		String name = sc.next();
		System.out.print("메모 작성 : ");
		String memo = sc.next();
		sc.close();
		
		//DB처리
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("khacademy");
		dataSource.setPassword("khacademy");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "insert into guest_book(no, name, memo)"
				+ "values(guest_book_seq.nextval, ?, ?)";
		
		Object[] param = {name, memo};
		
		template.update(sql, param);
		
		System.out.println("완료!");
	}
}
