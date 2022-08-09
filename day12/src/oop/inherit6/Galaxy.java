package oop.inherit6;

public class Galaxy extends Phone{
	//공용 필드
	
	//공용 메소드
	public void samsungPay() {
		System.out.println("삼성페이 기능 실행");
	}
	
	//생성자
	public Galaxy(String number, String color) {
		super(number, color);
	}
}
