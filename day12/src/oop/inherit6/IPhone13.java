package oop.inherit6;

public class IPhone13 extends IPhone{
	//고유 필드
	
	//고유 메소드
	public void faceTime() {
		System.out.println("IPhone13 영상통화 기능 실행");
	}
	
	//생성자
	public IPhone13(String number, String color) {
		super(number, color);
	}
}
