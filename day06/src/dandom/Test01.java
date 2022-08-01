package dandom;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//램덤 (Random)
		// - 무엇이 나올지 예측이 되지 않는 값
		// - 로또, 주사위, 게임아이템뽑기,...
		// - 확률적인 형태가 구현 가능함
		// - 구현 방법은 여러 가지가 있다.
		// (1) Math. random() 명령 사용
		// (2) Random 도구 사용
		// (3) SecureRandom 도구 사용
		
		// (1) Math.random() 명령은 0이상 1미만의 double을 무작위로 만드는 명령
		//System.out.println(Math.random());
		
		//ex : 1부터 10까지의 랜덤 정수
		double a = Math.random();//0.xxx
		System.out.println("a = " + a);
		
		double b = a * 10; //0.xxx ~ 9.xxx
		System.out.println("b = " + b);
		
		int c = (int)b;//0~9
		System.out.println("c = " + c);
		
		int d =  c + 1;//1~10
		System.out.println("d = " + d);

		//공식 유도
		int number = (int)(Math.random() * 10) + 1; // 10은 몇개인지, 1은 1부터로 해석
		System.out.println("number = " + number);
		
		//(2) Random이라는 도구를 만들어서 값 생성
		// - 주의 : Random은 close()가 없다. close는 입출력에서만 나옴
		Random r = new Random();
		
		int number2 = r.nextInt(10) + 1;
		System.out.println("number2 = " + number2);
	}
}
