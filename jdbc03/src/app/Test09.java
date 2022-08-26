package app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import dto.MusicDto;
import util.JdbcUtil;

public class Test09 {
	public static void main(String[] args) {
		//원하는 노래 한곡에 대한 정보만 출력
		
		//준비
		int musicNo = 1;
		
		
		//DB
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from music where music_no = ?";
		Object[]param = {musicNo};
		
		ResultSetExtractor<MusicDto> extractor = new ResultSetExtractor<MusicDto>() {
			@Override
			public MusicDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				// 데이터가 있는 경우와 없는 경우를 구분해서 처리하는 방법을 알려준다.
				//if(있으면) {
				if(rs.next()) {//rs에 데이터가 있다면
					MusicDto musicDto = new MusicDto();
					musicDto.setMusicNo(rs.getInt("music_no"));
					musicDto.setMusicTitle(rs.getString("music_title"));
					musicDto.setMusicArtist(rs.getString("music_artist"));
					musicDto.setMusicAlbum(rs.getString("music_album"));
					musicDto.setMusicPlay(rs.getInt("music_play"));
					musicDto.setReleaseTime(rs.getDate("release_time"));
					return musicDto;
				}
				else {//rs에 데이터가 없으면
					
				}
				return null;
			}
		};
		
		//sql구문, param, extractor를 이용하여 조회 명령
		//list는 저장소 dto는 실제 데이터
		MusicDto musicDto = template.query(sql, extractor, param);
		if(musicDto == null) {
			System.out.println("존재하지 않는 음원 번호");
		}
		else {
			System.out.println(musicDto);
		}
	}
}
