package app;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.MusicDto;
import util.JdbcUtil;

public class Test06 {
	public static void main(String[] args) {
		// 사용자에게 검색어를 입력받아 제목, 가수, 앨범에 대한 유사검색을 수행한 뒤 결과를 구하여 출력
		// 준비
		String keyword = "e";

		// DB
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "select * from music where instr(upper(music_title), upper(?)) > 0 " + "union "
				+ "select * from music where instr(upper(music_artist), upper(?)) > 0 " + "union "
				+ "select * from music where instr(upper(music_album), upper(?)) > 0";
		Object[] param = { keyword, keyword, keyword };

		RowMapper<MusicDto> mapper = (rs, idx) -> {
			MusicDto musicDto = new MusicDto();
			musicDto.setMusicNo(rs.getInt("music_no"));
			musicDto.setMusicTitle(rs.getString("music_title"));
			musicDto.setMusicArtist(rs.getString("music_artist"));
			musicDto.setMusicAlbum(rs.getString("music_album"));
			musicDto.setMusicPlay(rs.getInt("music_play"));
			musicDto.setReleaseTime(rs.getDate("release_time"));
			return musicDto;
		};

		List<MusicDto> list = template.query(sql, mapper, param);
		for (MusicDto musicDto : list) {
			System.out.println(musicDto);
		}
	}
}
