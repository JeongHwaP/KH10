package com.kh.spring22.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MusicDto {
	private int musicNo;
	private String musicTitle, musicArtist, musicAlbum;
	private int musicPlay;
	private Date releaseTime;
}
