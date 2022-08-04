package oop.method4_1;

public class Cafe {
	//field(필드)
	String name;
	String type;
	int price;
	boolean event;
	
	//method(메소드)
	
	//method overloading : 같은 이름으로 메소드를 여러개 준비하는 것
	void setting(String name, String type, int price) {
//		this.name = name;
//		this.type = type;
//		this.price = price;
//		this.event = false;
		this.setting(name, type, price, false);
	}
	void setting(String name, String type, int price, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = event;
	}
	
	void print() {
		System.out.println("<메뉴 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("분류 : " + this.type);
		System.out.println("가격 : " + this.price + "원");
		//System.out.println("행사중 : " + this.event);
		if(this.event == true) {
			System.out.println("( 행사 상품 )");
		}
		System.out.println();
	}
}
