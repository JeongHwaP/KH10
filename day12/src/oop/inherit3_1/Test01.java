package oop.inherit3_1;

public class Test01 {
	public static void main(String[] args) {
		//상위 클래스는 객체 생성을 하지 않는다. (추상적인 형태)
		//Browser a = new Browser();
		
		Chrome a = new Chrome();
		a.setUrl("https://www.google,com");
		a.refresh();
		a.move();
		a.develop();
		a.chromeStore();
		
		Edge b = new Edge();
		b.setUrl("https://www.kakao.com");
		b.refresh();
		b.move();
		b.fullScreen();
		
		Whale c = new Whale();
		c.setUrl("https://www.naver.com");
		c.refresh();
		c.move();
		c.papago();
		c.naverSearch();
	}
}
