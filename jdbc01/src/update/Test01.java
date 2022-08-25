package update;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		//수정(Update)
		// - 조건에 따라 실행 결과 개수가 달라지므로 이를 받아서 성공/실패 판정
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "update FIFA set score = ? where nation = ?";
		Object[]param = {1755.35, "아르헨티나"};
		
		int result = template.update(sql, param);
//		System.out.println("result = " + result);
		
		if(result > 0) {
			System.out.println("변경 성공");
		}
		else {	
			System.out.println("해당하는 나라가 없습니다.");
		}		
	}
}
