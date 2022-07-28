package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		//사용자에게 월을 입력받아 해당 월의 마지막 날짜를 구하여 출력하는 프로그램을 구현하세요.
		// - 2월은 28일까지 있다고 가정합니다.(윤년은 고려하지 않습니다.)
		// - 4, 6, 9, 11월은 30일까지 있습니다.
		// - 1,3 5, 7, 8, 10, 12월은 31일까지 있습니다.
		// 잘못 입력된 경우는 고려하지 않습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇월인지 입력하세요.");
		int month = sc.nextInt();
		
		switch(month) {
		case 2:
			System.out.println("28일");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일");
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일");
			break;
			default:
				System.out.println("잘못된 입력");
		}
	}
}
