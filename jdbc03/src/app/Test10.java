package app;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.MusicDto;
import util.JdbcUtil;

public class Test10 {
	public static void main(String[] args) {
		// 원하는 노래 한곡에 대한 정보만 출력(비추천 방식 : 목록에서 추출)

		// 준비
		int musicNo = 5;

		// DB
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "select * from music where music_no = ?";
		Object[] param = { musicNo };

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
//		MusicDto musicDto = list.get(0) or null;
		MusicDto musicDto;
		if (list.isEmpty()) {
			musicDto = null;
		} else {
			musicDto = list.get(0);
		}
		System.out.println(musicDto);
	}
}
