package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		//사용자에게 연도와 월을 입력받아서 날짜 수를 구하는 프로그램을 구현
		//윤년은 다음과 같은 규칙에 의해서 정해진다.
		// - 1년은 정확히 365일이 아니라 365.24xxx 일이다.
		// - 대충 4년정도면 하루 약간 모자르게 시간이 늘어난다.
		// - 4년마다 하루를 더 주면 시간이 약간 느려진다.
		// - 100년마다 하루를 덜 주고 400년마다 하루를 더 주면 정확히는 아니어도 날짜가 엇비슷해진다.
		// 정리하면 1. 연도가 4의 배수면 윤년이다. (ex : 2020, 2024, 2028년은 윤년)
		// 2. 4의 배수지만 100의 배수면 윤년이 아니다. (ex : 2100년은 윤년이 아님)
		// 3. 2번에 해당되더라도 400의 배수면 윤년이다. (ex : 2000년은 윤년)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇년도인지 입력하세요.");
		int year = sc.nextInt();
		System.out.println("몇월인지 입력하세요.");
		int month = sc.nextInt();
		
		int max;
		switch(month) {
		case 2:
			max = 28;
			break;
		case 4: case 6: case 9: case 11:
			max = 30;
			break;
			default:
				max = 31;
		}
		
		if(year%4 == 0 || year%400 == 0 && year%100 == 0) {
			System.out.println(max + 1);
		}
		else if(year%4 == 0 && year%100 ==0) {
			System.out.println(max);
		}
		else {
			System.out.println(max);
		}
	}
}
