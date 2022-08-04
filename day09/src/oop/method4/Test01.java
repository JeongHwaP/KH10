package oop.method4;

public class Test01 {
	public static void main(String[] args) {
		Cafe a = new Cafe();
		Cafe b = new Cafe();
		Cafe c = new Cafe();
		Cafe d = new Cafe();
		
		a.setting("아메리카노", "음료", 2500);
		b.setting("모카라떼", "음료", 3400);
		c.setting("치즈케이크", "디저트", 5000);
		d.setting("마카롱", "디저트", 3000);
		
		a.event = "행사중";
		b.event = "ㅡ";
		c.event = "행사중";
		d.event = "ㅡ";
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
