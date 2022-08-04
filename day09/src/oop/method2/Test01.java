package oop.method2;

public class Test01 {
	public static void main(String[] args) {
		Player a = new Player();
		Player b = new Player();
		Player c = new Player();
		
		a.setting("진종오", "사격", "하계", 4, 2, 0);
		b.setting("김수녕", "양궁", "하계", 4, 1, 1);
		c.setting("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		a.print();
		b.print();
		c.print();
	}
}
