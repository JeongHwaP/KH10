package oop.poly2_1;

public class GalaxyFold3 extends Phone{
	
	@Override
	public void camera() {
		System.out.println("갤럭시폴드3 사진촬영 기능 실행");
	}

	@Override
	public void gallery() {
		System.out.println("갤럭시폴드3 갤러리보기 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시폴드3 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시폴드3 문자 기능 실행");
	}
}
