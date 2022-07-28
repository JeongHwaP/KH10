package io;
import java.lang.*;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		// PC방 요금이 시간당 1000원 입니다.
		// 사용자의 시작시각, 종료시각을 입력받아서 이용요금을 계산하도록 구현
		// (10원단위는 버림 처리)
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("시작시간을 입력해주세요.");
		int inHour = sc.nextInt();
		System.out.print("시작분을 입력해주세요.");
		int inMinute = sc.nextInt();
		System.out.print("종료시간을 입력해주세요.");
		int outHour = sc.nextInt();
		System.out.print("종료분을 입력해주세요.");
		int outMinute = sc.nextInt();
		sc.close();
		
		int priceH = 1000; // 시간당 요금
		
		//계산
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int time = outTime - inTime;
		
		int hour = time / 60;
		int minute = time % 60;
		
		int priceM = 1000 / 60; // 분당 이용요금
		
		int price = time * priceM; // 이용요금 합계
		
		price = price / 100 * 100; // 10원단위 버림 처리
		
		//출력
		System.out.println("이용시간 : " + hour + "시간 " + minute + "분");
		System.out.println("이용요금 : " + price + "원"	);
	}
}
