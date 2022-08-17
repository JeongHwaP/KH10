package api.util.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		//이번 주 로또 예상번호 6개를 추첨하여 출력
		//단, 번호는 낮은 것부터 나와야 합니다.
		//Set으로 풀기
		
		Set<Integer>lotto = new TreeSet<>();
		Random r = new Random();
		
		while(lotto.size()<6) {
			//int number = r.nextInt(45까지) + 1부터;
			//lotto.add(1~45);
			int number = r.nextInt(45) + 1;
			lotto.add(number);
		}
		
		System.out.println(lotto);
		
	}
}
