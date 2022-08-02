package random;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		//다음 랜덤값을 구하여 화면에 출력

		Random r = new Random();
		// 1. 주사위 1개를 던진 결과
		//int dice = 1부터 6개;
		int dice = r.nextInt(6) + 1;
		System.out.println("주사위를 던져 " + dice + "가 나왔습니다.");
		
		// 2. 로또번호 1개를 추첨한 결과 (1~45)
		//int lotto = 1부터 45개;
		int lotto = r.nextInt(45) + 1;
		System.out.println("로또 번호 : " + lotto);
		
		// 3. OTP번호 1개를 생성한 결과 (6자리 정수)
		//int otp = 0부터 999999까지;
		//int otp = 100000부터 999999까지;
		int OTP = r.nextInt(1000000);
		System.out.println("OTP 번호 : " + OTP);
			
		// 4. 동전을 던졌을 때 예상되는 결과(앞 또는 뒤 중 하나)
		// - 약속 : 0을 "앞"으로 간주하고, 1을 "뒤"로 간주한다.
		//int coin = 0부터 2개;
		int coin = r.nextInt(2);
		System.out.println("coin = " + coin);
		if(coin ==0) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
	}
}
