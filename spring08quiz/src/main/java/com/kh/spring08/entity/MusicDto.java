//package com.kh.spring08.entity;
//
//import org.springframework.jdbc.core.ResultSetExtractor;
//import org.springframework.jdbc.core.RowMapper;
//
//public class MusicDto {
//
//	private int no;
//	private String title;
//	private String artist;
//	private String album;
//	private int play;
//	private String time;
//	public MusicDto() {
//		super();
//	}
//	public int getNo() {
//		return no;
//	}
//	public void setNo(int no) {
//		this.no = no;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getArtist() {
//		return artist;
//	}
//	public void setArtist(String artist) {
//		this.artist = artist;
//	}
//	public String getAlbum() {
//		return album;
//	}
//	public void setAlbum(String album) {
//		this.album = album;
//	}
//	public int getPlay() {
//		return play;
//	}
//	public void setPlay(int play) {
//		this.play = play;
//	}
//	public String getTime() {
//		return time;
//	}
//	public void setTime(String time) {
//		this.time = time;
//	}
//	@Override
//	public String toString() {
//		return "MusicDto [no=" + no + ", title=" + title + ", artist=" + artist + ", album=" + album + ", play=" + play
//				+ ", time=" + time + "]";
//	}
//	private static RowMapper<MusicDto> mapper = (rs, idx)->{
//		MusicDto dto = new MusicDto();
//		dto.setNo(rs.getInt("music_no"));
//		dto.setTitle(rs.getString("music_title"));
//		dto.setArtist(rs.getString("music_artist"));
//		dto.setAlbum(rs.getString("music_album"));
//		dto.setPlay(rs.getInt("music_play"));
//		dto.setTime(rs.getString("release_time"));
//		return dto;
//	};
//	
//	private static ResultSetExtractor<MusicDto> extractor = (rs)->{
//		if(rs.next()) {
//			MusicDto dto = new MusicDto();
//			dto.setNo(rs.getInt("music_no"));
//			dto.setTitle(rs.getString("music_title"));
//			dto.setArtist(rs.getString("music_artist"));
//			dto.setAlbum(rs.getString("music_album"));
//			dto.setPlay(rs.getInt("music_play"));
//			dto.setTime(rs.getString("release_time"));
//			return dto;
//		}
//		else {
//			return null;
//		}
//	};
//	public static RowMapper<MusicDto> getMapper() {
//		return mapper;
//	}
//	public static ResultSetExtractor<MusicDto> getExtractor() {
//		return extractor;
//	}
//	
//}

package com.kh.spring08.entity;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class MusicDto {
	private int musicNo;
	private String musicTitle;
	private String musicArtist;
	private String musicAlbum;
	private int musicPlay;
	private Date releaseTime;

	@Override
	public String toString() {
		return "MusicDto [musicNo=" + musicNo + ", musicTitle=" + musicTitle + ", musicArtist=" + musicArtist
				+ ", musicAlbum=" + musicAlbum + ", musicPlay=" + musicPlay + ", releaseTime=" + releaseTime + "]";
	}

	public int getMusicNo() {
		return musicNo;
	}

	public void setMusicNo(int musicNo) {
		this.musicNo = musicNo;
	}

	public String getMusicTitle() {
		return musicTitle;
	}

	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}

	public String getMusicArtist() {
		return musicArtist;
	}

	public void setMusicArtist(String musicArtist) {
		this.musicArtist = musicArtist;
	}

	public String getMusicAlbum() {
		return musicAlbum;
	}

	public void setMusicAlbum(String musicAlbum) {
		this.musicAlbum = musicAlbum;
	}

	public int getMusicPlay() {
		return musicPlay;
	}

	public void setMusicPlay(int musicPlay) {
		this.musicPlay = musicPlay;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public MusicDto() {
		super();
	}

	private static RowMapper<MusicDto> mapper = new RowMapper<MusicDto>() {
		@Override
		public MusicDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			MusicDto dto = new MusicDto();
			dto.setMusicNo(rs.getInt("music_no"));
			dto.setMusicTitle(rs.getString("music_title"));
			dto.setMusicArtist(rs.getString("music_artist"));
			dto.setMusicAlbum(rs.getString("music_album"));
			dto.setMusicPlay(rs.getInt("music_play"));
			dto.setReleaseTime(rs.getDate("release_time"));
			return dto;
		}
	};
	private static ResultSetExtractor<MusicDto> extractor = new ResultSetExtractor<MusicDto>() {
		@Override
		public MusicDto extractData(ResultSet rs) throws SQLException, DataAccessException {
			if (rs.next()) {
				MusicDto dto = new MusicDto();
				dto.setMusicNo(rs.getInt("music_no"));
				dto.setMusicTitle(rs.getString("music_title"));
				dto.setMusicArtist(rs.getString("music_artist"));
				dto.setMusicAlbum(rs.getString("music_album"));
				dto.setMusicPlay(rs.getInt("music_play"));
				dto.setReleaseTime(rs.getDate("release_time"));
				return dto;
			} else {
				return null;
			}
		}
	};

	public static RowMapper<MusicDto> getMapper() {
		return mapper;
	}

	public static ResultSetExtractor<MusicDto> getExtractor() {
		return extractor;
	}
}
