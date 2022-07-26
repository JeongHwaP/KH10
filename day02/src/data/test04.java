package data;
//(Q)영화관 요금표는 다음과 같습니다
//성인 : 12000원, 청소년 : 7500원
//성인 2명과 청소년 3명이 영화를 볼 때 이용요금을 출력
import java.lang.*;
public class test04 {
	public static void main(String[] args) {
		//영화관 요금 계산
		//준비
		//(창고) = 는 같다가 아니라 우측의 값을 좌측에 집어넣는 대입 연산 기호
		int adultPrice = 12000;//int 성인 = 12000;
		int teenPrice = 7500;//int 청소년 = 7500;
		int adultCount = 2;//int 성인Count = 2;
		int teenCount = 3;//int 청소년Count = 3;
		
		//계산
		int adultTotal = adultPrice * adultCount;//int 성인Total = 성인 * 성인Count;
		int teenTotal = teenPrice * teenCount;//int 청소년Total = 청소년 * 청소년Count;
		int total = adultTotal + teenTotal;//int total = 성인Total + 청소년Total;
		
		//출력
		System.out.println("성인 요금은 다음과 같습니다.");
		System.out.println(adultTotal);
		System.out.println("청소년 요금은 다음과 같습니다.");
		System.out.println(teenTotal);
		System.out.println("총 결제 금액은 다음과 같습니다.");
		System.out.println(total);
	}

}
