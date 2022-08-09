package oop.inherit6_1;

public class GalaxyFold3 extends Galaxy{
	//고유 필드
	
	//고유 메소드
	public void iris() {
		System.out.println("갤럭시폴드3 홍채인식 기능 실행");
	}
	
	@Override //annotation, 명찰 역할(바로 아래 있는 대상의 역할을 정의)
	public void samsungPay() {
		System.out.println("갤럭시폴드3 삼성페이 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시폴드3 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시폴드3 문자 기능 실행");
	}
	
	//생성자
	public GalaxyFold3(String number, String color) {
		super(number, color);
	}
}
