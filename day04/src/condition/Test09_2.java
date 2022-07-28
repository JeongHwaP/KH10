package condition;
import java.lang.*;
import java.util.Calendar;
public class Test09_2 {
	public static void main(String[] args) {
		//지하철 요금은 다음과 같습니다.
		// - 어르신(65세~) : 무료, 성인(20~64세)	: 1250원
		// - 청소년(14~19세) : 720원, 어린이(8~13세) : 450원
		// - 영유아(~7세) : 무료
		// 출생년도 4자리가 주어졌을 때 지하철 요금을 계산하여 출력하는 프로그램을 구현
		
		//준비
		int now = Calendar.getInstance().get(Calendar.YEAR);
		//int year = 1995;
		int birth = 19950629;
		int year = birth / 10000;
		
		//계산
		int age = now - year + 1;
		
		//출력
		if(age < 8 || age >= 65) {
			System.out.println("요금 : 0원 입니다.");
		}
		else if(age >= 20) {
			System.out.println("요금 1250원 입니다.");
		}
		else if(age >= 14) {
			System.out.println("요금 720원 입니다.");
		}
		else {
			System.out.println("요금 450원 입니다.");
		}
	}
}
