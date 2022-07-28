package condition;
import java.lang.*;
public class Test07_2 {
public static void main(String[] args) {
	//KH 여행사는 '무조건 1명 1박에 10만원'이라는 슬로건으로 영업을 하고 있습니다.
	//추가로 여름 여행객을 유치하기 위해 다음과 같은 이벤트를 하기로 결정했습니다.
	// - 여름(6, 7, 8월)에 여행가는 사람은 무조건 이용요금 25% 할인
	//다음 정보가 주어졌을 때 예상 여행 경비를 계산하여 출력하도록 프로그래밍하세요.
	//1. 인원 수(명)
	//2. 여행 기간(일)
	//3. 여행 계획중인 달(1월~12월 사이)
	
	//준비 - 인원수, 기간, 월
	int people = 1;
	int day = 1;
	
	int month = 6; // 1~12월
	
	int discount = 25;//할인율
	
	//계산
	int price = people * day * 100000;
	
	//int result = price 또는 25%할인된 price;
	int result;
	if(month == 6 || month == 7 || month == 8) {
		result = price * 75 / 100;
	}
	else {
		result = price;
	}
	
	//출력
	if(month == 6 || month == 7 || month == 8) {
		System.out.println("(KH여행사 영수증)");
		System.out.println("인원 수 : " + people + "명");
		System.out.println("여행기간 : " + day + "일");
		System.out.println("1인 1박에 100000원");
		System.out.println("여름 특가 적용!");
		System.out.println("할인 전 : " + price + "원");
		System.out.println("할인 후 : " + result + "원");
	}
	else {
		System.out.println("(KH여행사 영수증)");
		System.out.println("인원 수 : " + people + "명");
		System.out.println("여행기간 : " + day + "일");
		System.out.println("1인 1박에 100000원");
		System.out.println("여름 특가 적용!");
		System.out.println("할인 전 : " + price + "원");
		System.out.println("할인 후 : " + result + "원");
		}
	}
}
