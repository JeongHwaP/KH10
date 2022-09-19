package com.kh.springhome.entity;

import java.sql.Date;

public class BoardDto {
	private int boardNo;
	private String boardWriter, boardTitle, boardContent;
	private Date boardWritetime, boardUpdatetime;
	private int boardRead, boardLike;
	private String boardHead;
	@Override
	public String toString() {
		return "BoardDto [boardNo=" + boardNo + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardWritetime=" + boardWritetime + ", boardUpdatetime="
				+ boardUpdatetime + ", boardRead=" + boardRead + ", boardLike=" + boardLike + ", boardHead=" + boardHead
				+ "]";
	}
	public BoardDto() {
		super();
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public Date getBoardWritetime() {
		return boardWritetime;
	}
	public void setBoardWritetime(Date boardWritetime) {
		this.boardWritetime = boardWritetime;
	}
	public Date getBoardUpdatetime() {
		return boardUpdatetime;
	}
	public void setBoardUpdatetime(Date boardUpdatetime) {
		this.boardUpdatetime = boardUpdatetime;
	}
	public int getBoardRead() {
		return boardRead;
	}
	public void setBoardRead(int boardRead) {
		this.boardRead = boardRead;
	}
	public int getBoardLike() {
		return boardLike;
	}
	public void setBoardLike(int boardLike) {
		this.boardLike = boardLike;
	}
	public String getBoardHead() {
		return boardHead;
	}
	public void setBoardHead(String boardHead) {
		this.boardHead = boardHead;
	}
}
