package oop.method6;

public class Test01 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		p1.setting("참이슬 후레쉬", "주류", 1200, true, true);
		p2.setting("클라우드 맥주", "주류", 3000, false, true);
		p3.setting("바나나킥", "과자", 1500, false, true);
		p4.setting("허니버터칩", "과자", 2000, true, false);
		
		p1.print();
		p2.print();
		p3.print();
		p4.print();;
	}
}
