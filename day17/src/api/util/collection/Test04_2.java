package api.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test04_2 {
	public static void main(String[] args) {
		//List에 다음 데이터를 추가하고 무작위로 1개를 추첨하도록 구현하시오.
		// - 자바, 파이썬, 루비, 안드로이드, 자바스크립트
		
		//저장소 생성
		// - 배열처럼 한 번에 데이터까지 초기화하면서 생성
		
		//Java 8+
		//List<String> list = Arrays.asList("자바", "파이썬", "루비", "안드로이드", "자바스크립트");
		
		//Java 9+
		List<String>list = List.of("자바", "파이썬", "루비", "안드로이드", "자바스크립트");
		
		//System.out.prinltn(list);
		Random r = new Random();
		//int index = r.nextInt(5);
		int index = r.nextInt(list.size());
		
		System.out.println(list.get(index));
		
	}
}
