package api.util.collection;

import java.util.Random;

public class Test07 {
	public static void main(String[] args) {
		//이번 주 로또 예상번호 6개를 추첨하여 출력
		//단, 번호는 낮은 것부터 나와야 합니다.
		
		//풀이 방법
		// 1. 1부터 45까지를 6번 추첨하는 방법
		// 2. 1부터 45를 저장하고 섞은 뒤 6개를 추첨하는 방법
		
		Random r = new Random();
		//int number = r.nextInt(45개) + 1부터;
		int number = r.nextInt(45) + 1;
		System.out.println("number = " + number);
	
	}
}
