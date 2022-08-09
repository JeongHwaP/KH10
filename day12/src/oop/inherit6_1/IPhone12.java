package oop.inherit6_1;

public class IPhone12 extends IPhone{
	//고유 필드
	
	//고유 메소드
	public void itunes() {
		System.out.println("IPhone12 아이튠즈 기능 실행");
	}
	
	@Override //annotation, 명찰 역할(바로 아래 있는 대상의 역할을 정의)
	public void siri() {
		System.out.println("IPhone12 음성인식 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("IPhone12 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("IPhone12 문자 기능 실행");
	}
	
	//생성자
	public IPhone12(String number, String color) {
		super(number, color);
	}
}
