package select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test05 {
	public static void main(String[] args) {
		// guest_book 테이블의 모든 데이터를 최신순으로 출력
		// 단, 클래스명은 GuestBookDto라고 하세요.
		// - 필드명은 데이터베이스 컬럼명과 동일하게 작성하세요.
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "select * from guest_book order by no desc";

		RowMapper<GuestBookDto> mapper = new RowMapper<GuestBookDto>() {
			@Override
			public GuestBookDto mapRow(ResultSet rs, int idx) throws SQLException {
				GuestBookDto c = new GuestBookDto();
				c.setNo(rs.getInt("no"));
				c.setName(rs.getString("name"));
				c.setMemo(rs.getString("memo"));
				return c;
			}
		};

		List<GuestBookDto>list = template.query(sql, mapper);
		for(GuestBookDto c : list) {
			System.out.println(c.getNo());
			System.out.println(c.getName());
			System.out.println(c.getMemo());
		}
	}
}
