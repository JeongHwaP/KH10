package random;

import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		//주사위를 100번 던졌을 때 홀수와 짝수가 각각 몇 번씩 나오는지 계산하여 출력
		
		Random r = new Random();
		
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i = 1; i <= 100; i ++) {
			int dice = r.nextInt(6) + 1;
			System.out.println(i + "번째 주사위를 던져 " + dice + "가 나왔습니다.");
			if(dice % 2 == 1)
				oddCount++;
			else {
				evenCount++;
			}		
		}
		
		System.out.println("홀수 : " + oddCount + "번");
		System.out.println("짝수 : " + evenCount + "번");
		
	}
}
