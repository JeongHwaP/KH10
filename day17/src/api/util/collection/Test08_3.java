package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08_3 {
	public static void main(String[] args) {
		//네이버 사다리 만들기
		//네이버에서 '사다리타기'를 검색하여 나오는 프로그램을 그래픽 제외하고 구현
		
		Scanner sc = new Scanner(System.in);
		
		int people = 2;//인원수(반복횟수)
		
		List<String> names = new ArrayList<>();
		
		for(int i=0; i < people; i++) {
			System.out.print("이름 : ");
			names.add(sc.nextLine());
		}
		
		List<String> actions = new ArrayList<>();
		
		for(int i=0; i < people; i++) {
			System.out.print("항목 : ");
			actions.add(sc.nextLine());
		}

		sc.close();
		
		Collections.shuffle(actions);//위치 변경
		
		for(int i=0; i < people; i++) {
			System.out.println(names.get(i) + " -> " + actions.get(i));
		}
	}
}
