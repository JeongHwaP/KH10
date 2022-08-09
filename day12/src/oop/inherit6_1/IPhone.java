package oop.inherit6_1;

public class IPhone extends Phone{
	//공용 필드
	
	//공용 메소드
	public void siri() {
		System.out.println("음성인식 기능 실행");
	}
	
	//생성자
	public IPhone(String number, String color) {
		super(number, color);
	}
}
