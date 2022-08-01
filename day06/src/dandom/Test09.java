package dandom;

import java.util.Random;

public class Test09 {
	public static void main(String[] args) {
		// 풀이 안하고 코드만 올리는 과제
		// 아이템 강화 시뮬레이션
		// 강화 확률은 다음과 같습니다.
		// - 성공 : 25% 확률로 아이템의 레벨이 +1
		// - 실패 : 25% 확률로 아이템의 레벨이 -1
		// - 현상유지 : 50% 확률로 아이템의 레벨이 변하지 않습니다.
		// 0레벨의 아이템을 주어진 확률로 15레벨까지 만들기 위한 강화 횟수 출력
		// 단, 아이템 레벨은 절대로 0보다 작거나 15보다 커지는 일은 없습니다.

		Random r = new Random();
		
		int level = 0;
		
		int count = 0;

		while (true) {
			int a = r.nextInt(100) + 1;
			count++;
//			System.out.println(a);
			if (a <= 25) {
				System.out.println("아이템 강화 성공 = " + level);
				level++;
			} else if (a <= 50) {
				System.out.println("아이템 강화 실패 = " + level);
				level++;
			} else {
				System.out.println("아이템 레벨 유지 = " + level);
			}
			if (level == 15) {
				break;
			}
		}
		System.out.println("아이템 레벨 : " + level);
		System.out.println("강화 횟수 : " + count);
	}
}
