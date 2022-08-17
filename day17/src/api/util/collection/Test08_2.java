package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08_2 {
	public static void main(String[] args) {
		//네이버 사다리 만들기
		//네이버에서 '사다리타기'를 검색하여 나오는 프로그램을 그래픽 제외하고 구현
		
		Scanner sc = new Scanner(System.in);
		
		List<String> names = new ArrayList<>();
		
		System.out.print("이름 : ");
		names.add(sc.nextLine());
		
		System.out.print("이름 : ");
		names.add(sc.nextLine());
		
		System.out.print("이름 : ");
		names.add(sc.nextLine());
		
		List<String> actions = new ArrayList<>();
		
		System.out.print("항목 : ");
		actions.add(sc.nextLine());

		System.out.print("항목 : ");
		actions.add(sc.nextLine());

		System.out.print("항목 : ");
		actions.add(sc.nextLine());
		
		sc.close();
		
		Collections.shuffle(actions);//위치 변경
		
		System.out.println(names.get(0) + " -> " + actions.get(0));
		System.out.println(names.get(1) + " -> " + actions.get(1));
		System.out.println(names.get(2) + " -> " + actions.get(2));
	}
}
