package array;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		//점심 메뉴 추첨 프로그램
		// 1. 사용자에게 입력할 메뉴의 개수를 입력받아 해당 크기만큼의 배열을 생성
		// 2. 생성된 배열에 점심메뉴를 입력
		// 3. 입력이 완료되면 입력된 메뉴 중에서 랜덤으로 한 개의 메뉴를 추첨한 뒤 출력
		
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		
		System.out.print("메뉴 개수 : ");
		int user = sc.nextInt();
		
		int[] m = new int[user];
		
		for(int i = 1; i <= m.length; i++) {
			System.out.print(i + "번 메뉴 : ");
			String userM = sc.next();
			
		}
		
		int com = r.nextInt(user) + 1;
		
		sc.close();
		
		System.out.println(com + "번 메뉴를 추천합니다.");
	}
}
