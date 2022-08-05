package oop.method7_1;

public class Song {
	String name;
	String singer;
	String album;
	int play;
	int good;
	
	void setting(String name, String singer, String album, int play, int good) {
		this.name = name;
		this.singer = singer;
		this.album = album;
		this.play = play;
		this.good = good;
	}
	
	void print() {
		System.out.println("<음원차트>");
		System.out.println();
		
		if(this.play > 100000) {
			System.out.print("★베스트★");			
		}
		if(this.good > 100000) {
			System.out.print("♥인기곡♥");			
		}
		System.out.println();
		
		System.out.println("제목 : " + this.name);
		System.out.println("가수 : " + this.singer);
		System.out.println("앨범 : " + this.album);
		System.out.println("재생 수 : " + this.play);
		System.out.println("좋아요 수 : " + this.good);
		System.out.println();
		
		int rankingPoint = (this.play * 2 + this.good / 2);
		System.out.println("랭킹 점수 : " + rankingPoint);		
	}
}
