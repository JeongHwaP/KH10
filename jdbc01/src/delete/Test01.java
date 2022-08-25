package delete;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		//삭제(delete)
		//delete FIFA where nation = ?
		
		//데이터 준비
		String nation = "스페인";
		
		//DB처리
		JdbcTemplate template = JdbcUtil.getTemplate();
		String sql = "delete FIFA where nation = ?";
		Object[]param = {nation};
		
		int result = template.update(sql, param);
		if(result>0) {
			System.out.println("삭제가 완료되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 나라 이름입니다.");
		}
	}
}
