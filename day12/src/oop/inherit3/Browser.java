package oop.inherit3;

public class Browser {
	private String url;
	private String refresh;
	private String move;
	
	public void url() {
		System.out.println();
		System.out.println("주소를 저장합니다.");
	}
	public void refresh() {
		System.out.println("새로고침을 실행합니다.");
	}
	public void move() {
		System.out.println("페이지를 이동합니다.");
	}
}
