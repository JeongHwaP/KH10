package app;

import java.sql.Date;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		// 등록 프로그램
		// 사용자에게 필요한 정보를 입력받아 등록하도록 구현
		// 사용자에게 입력 받을 데이터 - 타이틀, 가수, 앨범명, 발매일
		String musicTitle = "Attention";
		String musicArtist = "NewJeans";
		String musicAlbum = "NewJeans 1st";
		String releaseTime = "2022-08-26";

		Date releaseTimeDate = Date.valueOf(releaseTime);

		// DB 처리
		JdbcTemplate template = JdbcUtil.getTemplate();

		String sql = "insert into music(" + "music_no, music_title, music_artist, "
				+ "music_album, music_play, release_time" + ") " + "values(music_seq.nextval, ?, ?, ?, 0, ?)";
		Object[] param = { musicTitle, musicArtist, musicAlbum, releaseTimeDate };

		template.update(sql, param);
		System.out.println("등록 완료");
	}
}
