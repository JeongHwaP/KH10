package random;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		//부루마블이라는 게임을 하다가 무인도에 갇혔습니다.
		//무인도에서 탈출하려면 주사위 두 개를 던져서 5-5가 나오거나 6-6이 나와야 합니다.
		//무인도에서 탈출할 때까지 주사위를 던지고, 탈출하면 던진 주사위 횟수가 출력되도록 구현
		
		Random r = new Random();
		
		int count = 0;
		
		//주사위 2개 던진 결과를 저장
		while(true) { //(5, 5) 또는 (6, 6)이 나올 때까지 -> while
			int a = r.nextInt(6) + 1;
			int b = r.nextInt(6) + 1;
			System.out.println("a = " + a + ", b = " + b);
			
			count++;
			//if(둘다 5라면 || 둘다 6이라면)
			if((a == 5 && b == 5) || (a == 6 && b == 6)) {
				break;
			}
		}
		System.out.println("총 " + count + "번 던졌습니다.");
	}
}
