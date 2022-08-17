package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test08_1 {
	public static void main(String[] args) {
		//네이버 사다리 만들기
		//네이버에서 '사다리타기'를 검색하여 나오는 프로그램을 그래픽 제외하고 구현
		
		List<String>names = new ArrayList<>();
		names.add("피카츄");
		names.add("라이츄");
		names.add("파이리");
		List<String>actions = new ArrayList<>();
		actions.add("저녁사기");
		actions.add("술사기");
		actions.add("얻어먹기");
		
		Collections.shuffle(actions); //위치 변경
		
		System.out.println(names.get(0) + " -> " + actions.get(0));
		System.out.println(names.get(1) + " -> " + actions.get(1));
		System.out.println(names.get(2) + " -> " + actions.get(2));
	}
}
