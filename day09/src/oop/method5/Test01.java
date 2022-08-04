package oop.method5;

public class Test01 {
	public static void main(String[] args) {
		Phone a = new Phone();
		Phone b = new Phone();
		Phone c = new Phone();
		Phone d = new Phone();
		
		a.setting("갤럭시22s", "SK", 1800000);
		b.setting("갤럭시22s", "KT", 1750000, 24);
		c.setting("아이폰13", "LG", 2000000, 30);
		d.setting("아이폰13", "SK", 1990000);
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
