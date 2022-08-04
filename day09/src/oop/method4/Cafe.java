package oop.method4;

public class Cafe {
	String name;
	String type;
	int price;
	String event;
	
	void setting(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = event;
	}
	
	void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("분류 : " + this.type);
		System.out.println("가격 : " + this.price + "원");
		System.out.println("행사여부 : " + this.event);
		System.out.println();
	}
}
