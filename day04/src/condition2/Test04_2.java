package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test04_2 {
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
		int month = 3;
		
		//계산
		//System.out.println("4로 나눈 나머지 = " + year %4);
		//System.out.println("100으로 나눈 나머지 = " + year %100);
		//System.out.println("400으로 나눈 나머지 = " + year %400);
		boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		int day;
		switch(month) {
		case 2:
			//day = 28 or 29;
			if(leap == true) {
				day = 29;
		}
			else {
				day = 28;
			}
				break;
				case 4: case 6:  case 9: case 11:
					day = 30;
					break;
					default:
						day = 31;
						break;
				}
		
		System.out.println(year+"년 "+month+"월은 "+day+"일까지 있습니다");
	}
}