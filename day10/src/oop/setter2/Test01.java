package oop.setter2;

public class Test01 {
	public static void main(String[] args) {
		Study a = new Study("자바 마스터과정", 90, 1000000, "온라인");
		Study b = new Study("파이썬 기초", 60, 600000, "온라인");
		Study c = new Study("웹 개발자 단기완성", 120, 1200000, "오프라인");
		
		a.print();
		b.print();
		c.print();
	}
}
