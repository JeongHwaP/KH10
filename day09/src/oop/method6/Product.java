package oop.method6;

public class Product {
	//field
	String name;
	String type;
	int price;
	boolean early;
	boolean event;
	
	//method
	void setting(String name, String type, int price) {
		this.setting(name, type, price, false, false);
	}
	void setting(String name, String type, int price, boolean early) {
		this.setting(name, type, price, early, false);
	}
//(주의 사항) 메소드 오버로딩은 형태까지 같은 경우는 불가능하다.
	//	void setting(String name, String type, int price, boolean early, boolean event) {
//		this.setting(name, type, price, false, event);
//	}
	void setting(String name, String type, int price, boolean early, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.early = early;
		this.event = event;
	}
	
	void print() {
		//새벽배송과 행사여부는 상품 정보 옆에 추가로 출력
		System.out.println("<상품 정보>");
		if(this.early) {
			System.out.print(" 새벽배송 ");
		}
		if(this.event) {
			System.out.print(" 행사상품 ");
		}
		System.out.println();
		
		System.out.println("이름 : " + this.name);
		System.out.println("분류 : " + this.type);
		
		if(this.event) {
			int discountPrice = this.price * 90 / 100;
			System.out.println("가격 : " + discountPrice + "원 (원래가격 "+this.price+"원)");
		}
		else {
			System.out.println("가격 : " + this.price + "원");
		}
		if(this.early) {
			System.out.println("(배송비 +2500원)");
		}
		System.out.println();
	}
}
