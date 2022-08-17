package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test07_4 {
	public static void main(String[] args) {
		//이번 주 로또 예상번호 6개를 추첨하여 출력
		//단, 번호는 낮은 것부터 나와야 합니다.
		
		//풀이 방법
		// 1. 1부터 45까지를 6번 추첨하는 방법
		// 2. 1부터 45를 저장하고 섞은 뒤 6개를 추첨하는 방법
		
		Random r = new Random();
		List<Integer>list = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			int number = r.nextInt(45) + 1;
			//if(뽑은적이 없는 숫자라면) {
			//if(list.contains(number)==false) {
			if(!list.contains(number)) {
				list.add(number);
			}
			else {
				i--; //다시 추첨
			}
			System.out.println("number = " + number);
			System.out.println(list);
		}
		
		Collections.sort(list);
		System.out.println(list);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
	}
}
