package condition;
import java.lang.*;
public class Test05_1 {
	public static void main(String[] args) {
		
		//준비 - 자장면 금액/수량, 짬뽕 금액/수량
		int jjajang = 5000;
		int jjajangCount = 1;
		int champon = 6000;
		int champonCount = 1;
		
		int discount = 10;//할인율
		
		//계산
		int totalCount = jjajangCount + champonCount;
		int jjajangTotal = jjajang * jjajangCount;
		int champonTotal = champon * champonCount;
		
		//(문제점) 
		//할인이 되는 경우와 안되는 경우는 가격만 달라지고 나머진 똑같은데
		//가격 계산만 따로 할 수는 없을까?
		
		//int total = 원래금액 or 할인된금액;
		int total;
		if(totalCount >= 3) {
			total = (jjajangTotal + champonTotal) * (100-discount) / 100;//할인된금액
		}
		else {
			total = jjajangTotal + champonTotal;//원래금액
		}
		
		//출력
		System.out.println("결제 금액 : " + total + "원");
		
	}
}