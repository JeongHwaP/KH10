package condition;
import java.lang.*;
public class Test07_1 {
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
	
	int month = 5; // 1~12월
	
	int discount = 25;//할인율
	
	//계산
	int price = people * day * 100000;
	
	int total;
	if(month == 6 || month == 7 || month == 8) {
		total = price * (100 - discount) / 100;
	}
	else {
		total = price;
	}
	
	//출력
	//if(여름이라면) {
	
	//if(month가 6, 7, 8중 하나) {
	if(month == 6 || month == 7 || month == 8) {
		
	//if(month가 6에서 8사이) {
	//if(month >= 6 && month <= 8) {
		
	//if(month가 5보다 크고 9보다 작은 경우) {
	//if(month > 5 && month < 9) {
	
	//if(month / 3 == 2) {
		System.out.println("여름 특가 적용!");
		System.out.println("요금 : " + price * 75/100 + "원");
	}
	else {
	System.out.println("경비 : " + total + "원");
		}
	}
}
