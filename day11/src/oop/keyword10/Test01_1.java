package oop.keyword10;

import java.util.Random;

public class Test01_1 {
	//외부에서 부를 수 있도록 필드로 선언한다.
	//- 객체 없이 편하게 부르라고 static 처리, 변경 없으니 안전하게 쓰라고 final 처리
	//- 접근 제한도 public으로 설정한다.
	//- 상수 (constant)라고 부른다.
	//[약속] (0 : 앞, 1 : 뒤)
	public static final int FRONT = 0, BACK = 1;
	// = 공개된(static) 아무도 접근하지 않는(public) 변하지 않는 값(final)
	
	public static void main(String[] args) {
		
		//동전 던지기
		Random r = new Random();
		int coin = r.nextInt(2); //0부터 2개;(0 : 앞, 1 : 뒤)
		if(coin == FRONT) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
	}
}
