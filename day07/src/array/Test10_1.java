package array;

import java.util.Random;
import java.util.Scanner;

public class Test10_1 {
	public static void main(String[] args) {
		//점심 메뉴 추첨 프로그램
		// 1. 사용자에게 입력할 메뉴의 개수를 입력받아 해당 크기만큼의 배열을 생성
		// 2. 생성된 배열에 점심메뉴를 입력
		// 3. 입력이 완료되면 입력된 메뉴 중에서 랜덤으로 한 개의 메뉴를 추첨한 뒤 출력
		
		//크기 설정
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 개수 : ");
		int size = sc.nextInt();
		
		//배열 생성
		String[] menu = new String[size];
		//menu.lenght == size
		
		//입력
		for(int i = 0; i < size; i++) {//size번 반복
			System.out.print("메뉴 입력 : ");
			menu[i] = sc.next();
		}
		sc.close();
		
		//랜덤위치 생성
		Random r = new Random();
		int index = r.nextInt(size); //0부터 size개
		//System.out.println("index " +index);
		
		//출력
		System.out.println("오늘 점심은 " + menu[index] + "(으)로 갑시다!");
	}
}
