package select;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) {
		//조회(SELECT)
		//select * from soccer_ranking
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from FIFA";
		
		int result = template.update(sql);
		
		System.out.println("result = " + result);
	}
}
