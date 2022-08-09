package oop.inherit6_1;

public class IPhone13 extends IPhone{
	//고유 필드
	
	//고유 메소드
	public void faceTime() {
		System.out.println("IPhone13 영상통화 기능 실행");
	}
	
	@Override //annotation, 명찰 역할(바로 아래 있는 대상의 역할을 정의)
	public void siri() {
		System.out.println("IPhone13 음성인식 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("IPhone13 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("IPhone13 문자 기능 실행");
	}
	
	//생성자
	public IPhone13(String number, String color) {
		super(number, color);
	}
}
