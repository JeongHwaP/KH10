package data;
//KH주차장의 요금은 다음과 같습니다.
//- 0분부터 9분가지 무료
//- 10분부터 19분까지 1000원
//- 이후 10분당 1000원식 추가
//12시 40분에 들어와서 16시 10분에 나간 차량이 있을 때 이 차량의 주차시간과 요금을 구해서 출력
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		//준비 - 들어온시간(시/분), 나간시간(시/분)
		//int hour1 = 16;
		//int minute1 = 10;
		//int hour2 = 12;
		//int minute2 = 40;
		int inHour = 12, inMinute = 40;
		int outHour = 16, outMinute = 10;
		
		//계산 - 가장 작은 단위로 변경해서 계산 후 원래 형태로 복원
		//int time1 = 60 * hour1 + minute1;
		//System.out.println(time1);
		//int time2 = 60 * hour2 + minute2;
		//System.out.println(time2);
		
		int inTime = inHour * 60 + inMinute;
		//System.outprintln(inTime);
		int outTime = outHour * 60 + outMinute;
		
		int time = outTime - inTime;
		System.out.println(time);
		
		//int time = time1 - time2;
		//int hour = time / 60;
		//int minute = time % 60;
		
		//int total = (time1 - time2) / 10 * 1000 - 1000;
		
		//요금
		int price = time / 10 * 1000;
		
		//시간
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
		//System.out.println(hour);
		//System.out.println(minute);
		//System.out.println(total);
		System.out.println("주차요금은 다음과 같습니다.");
		System.out.println(price);
		
		System.out.println("주차시간");
		System.out.println(hour);
		System.out.println(minute);
	}
}
