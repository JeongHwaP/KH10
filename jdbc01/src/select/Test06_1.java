package select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test06_1 {
	public static void main(String[] args) {
		//customer 테이블의 모든 데이터를 번호순으로 출력
		//단, 클래스명은 CustomerDto라고 하세요.
		// - 필드명은 데이터베이스 컬럼명과 동일하게 작성하세요.
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from customer order by customer_no asc";
		
		RowMapper<CustomerDto> mapper = (rs, idx)->{
			CustomerDto CustomerDto = new CustomerDto();				
			CustomerDto.setCustomer_no(rs.getInt("customer_no"));
			CustomerDto.setCustomer_id(rs.getString("customer_id"));
			CustomerDto.setCustomer_phone(rs.getString("customer_phone"));
			CustomerDto.setCustomer_time(rs.getString("customer_time"));
			CustomerDto.setCustomer_buy_time(rs.getString("customer_buy_time"));
			CustomerDto.setCustomer_mileage(rs.getInt("customer_mileage"));
			CustomerDto.setCustomer_grade(rs.getString("customer_grade"));
			return CustomerDto;
		};
		
		List<CustomerDto> list = template.query(sql, mapper);
		for(CustomerDto customerDto : list) {
			System.out.println(customerDto);
		}
	}
}
