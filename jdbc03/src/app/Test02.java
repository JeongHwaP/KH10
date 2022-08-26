package app;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) {
		// 사용자에게 음원타이틀, 가수, 앨범명을 변경할 수 있도록 정보를 입력받아서 수정 구현
		int musicNo = 1;
		String musicTitle = "After LIKE";
		String musicArtist = "IVE(아이브)";
		String musicAlbum = "After LIKE";

		// DB 처리
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "update music " + "set music_title=?, music_artist=?, music_album=? " + "where music_no=?";
		Object[] param = { musicTitle, musicArtist, musicAlbum, musicNo };

		int result = template.update(sql, param);
		if (result > 0) {
			System.out.println("정보 변경 완료");
		} else {
			System.out.println("존재하지 않는 음원 번호입니다");
		}
	}
}
