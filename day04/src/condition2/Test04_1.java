package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test04_1 {
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
		
		
		//(1) 윤년 판정
		
		//준비
		int year = 2000;
		
		//계산
		System.out.println("4로 나눈 나머지 = " + year %4);
		System.out.println("100으로 나눈 나머지 = " + year %100);
		System.out.println("400으로 나눈 나머지 = " + year %400);
		
		//boolean leap = true or false;
		boolean leap;
		if(year % 4 != 0) {//year가 4의 배수가 아니면
			leap = false;
		}
		
		//여기서부터는 4의 배수인 경우
		else if(year % 100 == 0 && year % 400 !=0) {//year가 100의 배수지만 400의 배수가 아닌경우
			leap = false;
		}
		else if(year % 400 == 0) {
			leap = true;
		}
		else {//나머지 4의 배수
			leap = true;
		}
		
		if(leap == true) {
			System.out.println("윤년입니다.");			
		}
		else {
		System.out.println("윤년이 아닙니다.");
		}
		
	}
}
