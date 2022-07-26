package data;
//KH PC방에서는 1시간에 1200원의 요금을 받고 있습니다.
//만약 요금이 10원단위로 나올 경우 해당 요금은 받지 않습니다.
//(ex) 1250원이면 1200원만 받습니다.
//12시 40분부터 16시 10분까지 이용한 고객의 요금을 출력
import java.lang.*;
public class Test09_1 {
	public static void main(String[] args) {
		//준비 - 시작시각, 종료시각, 시간당요금
		int inHour = 12, inMinute = 40;
		int outHour = 16, outMinute = 10;
		int pricePerHour = 1200;
		
		//계산 - 이용시간, 이용요금
		int inTime = inHour * 60 + inMinute;
		//System.out.println(inTime);
		int outTime = outHour * 60 + outMinute;
		int time = outTime - inTime;
		//System.out.println(time);
		
		//요금
		int pricePerMinute = pricePerHour / 60;
		//System.out.println(pricePerMinute);
		
		//int price = 이용시간(분) * 분당요금;
		int price = time * pricePerMinute;//int price = 1200 / 60 * time;
		
		//시간
		int hour = time / 60;
		int minute = time % 60;
		
		//int fixPrice = price / 100 * 100;//신규 변수 생성
		price = price / 100 * 100;//기존 변수 변경
		
		//출력
		System.out.println("이용시간은 다음과 같습니다.");
		System.out.println(hour);
		System.out.println(minute);
		System.out.println("이용요금은 다음과 같습니다.");
		//System.out.println(fixPrice);
		System.out.println(price);
	}
}
