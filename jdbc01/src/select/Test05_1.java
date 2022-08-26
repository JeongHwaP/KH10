package select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test05_1 {
	public static void main(String[] args) {
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from guest_book order by no desc";
		
		RowMapper<GuestBookDto> mapper = new RowMapper<GuestBookDto>() {
			@Override
			public GuestBookDto mapRow(ResultSet rs, int idx) throws SQLException {
				GuestBookDto guestBookDto = new GuestBookDto();
				guestBookDto.setNo(rs.getInt("no"));//rs.getInt(1)
				guestBookDto.setName(rs.getString("name"));//rs.getString(2)
				guestBookDto.setMemo(rs.getString("memo"));//rs.getString(3)
				return guestBookDto;
			}
		};
		
		List<GuestBookDto> list = template.query(sql, mapper);
		for(GuestBookDto guestBookDto : list) {
			System.out.println(guestBookDto);
		}
	}
}
