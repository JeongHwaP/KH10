package condition;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		//KH 반점에서는 다음과 같은 메뉴를 판매하고 있습니다.
		// - 자장면 : 5000원, 짬뽕 : 6000원
		//매출을 올리기 위해서 총 3그릇 이상 주문하면 10%를 할인해줍니다.
		//임의의 자장면, 짬뽕 주문 수량에 대해 결제금액을 계산하도록 구현
		
		//준비 - 자장면 금액 / 수량, 짬뽕 금액 / 수량
		int jjajang = 5000, champon = 6000;
		int jjajangCount = 2, champonCount = 6;
		int discount = 10;//할인율
		
		//계산
		int jjajangTotal = jjajang * jjajangCount;
		int champonTotal = champon * champonCount;
		int totalCount = jjajangCount + champonCount;
		
		int total = jjajangTotal + champonTotal;
		
		boolean 할인 = jjajangCount + champonCount >= 3;
		int 할인금액 = total * 90/100;
		
		//출력
		if(jjajangCount >= 1) {
		System.out.println("자장면 " + jjajangCount + "개 " + jjajangTotal + "원");
		}
		if(champonCount >=1) {
			System.out.println("짬뽕 " + champonCount + "개 " + champonTotal + "원");
		}
		if(totalCount >= 3) {
		System.out.println("결제금액은 할인적용 " + 할인금액 + "원 입니다.");
		}
		else {
			System.out.println("결제금액은 " + total + "원 입니다.");
		}
	}
}
