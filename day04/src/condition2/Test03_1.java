package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test03_1 {
	public static void main(String[] args) {
		//사용자에게 월을 입력받아 해당 월의 마지막 날짜를 구하여 출력하는 프로그램을 구현하세요.
		// - 2월은 28일까지 있다고 가정합니다.(윤년은 고려하지 않습니다.)
		// - 4, 6, 9, 11월은 30일까지 있습니다.
		// - 1,3 5, 7, 8, 10, 12월은 31일까지 있습니다.
		// 잘못 입력된 경우는 고려하지 않습니다.
		
		//준비
		int month = 4;
		
		//계산
		
		//case에 변수, 계산식은 못씀
		
		//출력
		switch(month) {
		case 2:
			System.out.println("28일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
			default:
				System.out.println("31");
		}
	}
}
