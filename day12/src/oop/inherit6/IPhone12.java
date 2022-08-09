package oop.inherit6;

public class IPhone12 extends IPhone{
	//고유 필드
	
	//고유 메소드
	public void itunes() {
		System.out.println("IPhone12 아이튠즈 기능 실행");
	}
	
	//생성자
	public IPhone12(String number, String color) {
		super(number, color);
	}
}
