package oop.method5;

public class Phone {
	//field
	String name;
	String telecom;
	int price;
	int month;
	
	//method
	void setting(String name, String telecom, int price) {
//		this.name = name;
//		this.telecom = telecom;
//		this.price = price;
//		this.month = month;
		this.setting(name, telecom, price, 0);
	}
	void setting(String name, String telecom, int price,int month) {
		this.name = name;
		this.telecom = telecom;
//		this.price = price;
//		this.month = month;
		if(price >= 0) {
			this.price = price;
		}
		switch(month){
		case 0:
		case 24:
		case 30:
		case 36:
			this.month = month;
		}
	}
	
	void print() {
		//if(약정기간이 있는 경우) {
		if(this.month > 0) { //약정기간이 있는 경우
			int pricePerMonth = this.price / this.month;
			System.out.println("<휴대폰 정보>");
			System.out.println("이름 : " + this.name);
			System.out.println("통신사 : " + this.telecom);
			System.out.println("가격 : " + this.price + "원 (월 "+pricePerMonth+"원)");
			System.out.println("약정기간 : " + this.month + "개월");
		}
		else { //약정기간이 없는 경우
			int discountPrice = this.price * 95 / 100;			
			System.out.println("<휴대폰 정보>");
			System.out.println("이름 : " + this.name);
			System.out.println("통신사 : " + this.telecom);
			System.out.println("가격 : " + discountPrice + "원 (원 가격 : "+this.price+"원)");
			System.out.println("약정 없음");
		}
		System.out.println();
	}
}
