package io;
import java.lang.*;
import java.util.Scanner;
public class Test06_2 {
	public static void main(String[] args) {
		// PC방 요금이 시간당 1000원 입니다.
		// 사용자의 시작시각, 종료시각을 입력받아서 이용요금을 계산하도록 구현
		// (10원단위는 버림 처리)
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 시각을 입력해주세요.");
		int in= sc.nextInt();
		System.out.print("종료 시각을 입력해주세요.");
		int out = sc.nextInt();
		sc.close();
		
		int inHour = in / 100, inMinute = in % 100;
		int outHour = out / 100, outMinute = out % 100;
		
		int priceH = 1000; // 시간당 요금
		
		//계산
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int time = outTime - inTime;
		//.System.out.println(time);
		
		int hour = time / 60;
		int minute = time % 60;
		
		double priceM = priceH / 60.0; // 분당 이용요금 (정수로 계산하면 원하는 결과가 나오지 않는다.)
		
		int price = (int)(time * priceM); // 이용요금 합계 (요금은 정수로 표기가 나와야한다.)
		
		price = price / 100 * 100; // 10원단위 버림 처리
		
		//출력
		System.out.println("이용시간 : " + hour + "시간 " + minute + "분");
		System.out.println("이용요금 : " + price + "원"	);
	}
}
