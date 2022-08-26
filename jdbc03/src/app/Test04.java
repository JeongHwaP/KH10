package app;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test04 {
	public static void main(String[] args) {
		// 사용자에게 음원번호를 입력받아 해당하는 음원을 삭제하는 프로그램 구현
		// 준비
		int musicNo = 5;

		// 처리
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "delete music where music_no = ?";
		Object[] param = { musicNo };

		int result = template.update(sql, param);
		if (result > 0) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("존재하지 않는 음원 번호");
		}
	}
}
