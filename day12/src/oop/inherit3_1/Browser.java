package oop.inherit3_1;

//상위 클래스
public class Browser {
	//공용 필드
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	//공용 메소드
	public void refresh() {
		System.out.println();
		System.out.println("새로고침 기능 실행");
	}
	public void move() {
		System.out.println("이동 기능 실행");
	}
}
