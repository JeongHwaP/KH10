package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		//주요 명령
		List<String> list = new ArrayList<>();
		
		//추가
		list.add("피카츄");
		list.add("파이리");
		list.add("꼬부기");
		list.add("라이츄");
		list.add("또가스");
		
		//검색
		//(Q) 피카츄가 list에 있습니까?
		System.out.println(list.contains("피카츄"));
		System.out.println(list.indexOf("꼬부기"));
		
		//(Q) 2번 위치에 들어있는 것은 무엇입니까?
		System.out.println(list.get(2));
		
		//(Q) 피카츄 제거
		list.remove("피카츄");
		
		System.out.println(list);
		System.out.println(list.isEmpty()); //비어있는가?
		System.out.println(list.size()); //데이터가 몇 개 있어요?
	}
}
