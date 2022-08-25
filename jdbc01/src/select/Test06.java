package select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test06 {
	public static void main(String[] args) {
		//customer 테이블의 모든 데이터를 번호순으로 출력
		//단, 클래스명은 CustomerDto라고 하세요.
		// - 필드명은 데이터베이스 컬럼명과 동일하게 작성하세요.
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from customer order by customer_no asc";
		
		RowMapper<CustomerDto> mapper = new RowMapper<CustomerDto>() {
			@Override
			public CustomerDto mapRow(ResultSet rs, int idx) throws SQLException {
				CustomerDto c = new CustomerDto();
				c.setCustomer_no(rs.getInt("customer_no"));
				c.setCustomer_id(rs.getString("customer_id"));
				c.setCustomer_phone(rs.getString("customer_phone"));
				c.setCustomer_time(rs.getString("customer_time"));
				c.setCustomer_buy_time(rs.getString("customer_buy_time"));
				c.setCustomer_mileage(rs.getInt("customer_mileage"));
				c.setCustomer_grade(rs.getString("customer_grade"));
				return c;
			}
		};
		
		List<CustomerDto> list = template.query(sql, mapper);
		for(CustomerDto c : list) {
			System.out.println(c.getCustomer_no());
			System.out.println(c.getCustomer_id());
			System.out.println(c.getCustomer_phone());
			System.out.println(c.getCustomer_time());
			System.out.println(c.getCustomer_buy_time());
			System.out.println(c.getCustomer_mileage());
			System.out.println(c.getCustomer_grade());
		}
	}
}
