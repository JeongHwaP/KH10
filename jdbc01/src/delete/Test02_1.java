package delete;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02_1 {
	public static void main(String[] args) {
		//guesr_book 테이블의 데이터를 삭제하는 프로그램
		// - primary key인 번호(no)를 이용하여 삭제하도록 구현
		//delete guest_book where name=?
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 : ");
		int no = sc.nextInt();
		sc.close();
		
		//DB처리
		JdbcTemplate template = JdbcUtil.getTemplate();
		String sql = "delete guest_book where no=?";
		Object[]param = {no};
		
		int result = template.update(sql, param);
		if(result>0) {
			System.out.println("삭제되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 번호입니다.");
		}
	}
}
