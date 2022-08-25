package update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test03 {
	public static void main(String[] args) {
		// customer 테이블의 정보를 수정하도록 프로그램을 구현
		// - 번호를 입력받아 해당하는 회원에게 원하는 만큼의 포인트를 증정
		// update customer
		// set customer_mileage=customer_mileage+?
		// where customer_no=?;

		// 데이터 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("고객 번호 : ");
		int customer_no = sc.nextInt();
		System.out.print("증정 포인트 : ");
		int customer_mileage = sc.nextInt();
		sc.close();

		// DB 처리
		JdbcTemplate jdbcTemplate = JdbcUtil.getTemplate();

		String sql = "update customer " + "set customer_mileage = customer_mileage + ? " + "where customer_no = ?";
		Object[] param = { customer_mileage, customer_no };

		int result = jdbcTemplate.update(sql, param);
		if (result > 0) {
			System.out.println("포인트 증정 완료");
		} else {
			System.out.println("존재하지 않는 고객 번호");
		}
	}
}