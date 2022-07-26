package data;
//KH 주유소에서는 휘발유를 1L에 1920원에 판매중입니다.
//50000원을 주유했을 때 주유 가능한 리터(L)를 구하여 출력
import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		//준비
		int money = 50000;
		int pricePerLiter = 1920;
		
		//계산
		//int liter = money / pricePerLiter;
		//float liter = (float)money / pricePerLiter;
		double liter = (double)money / pricePerLiter;
		
		//출력
		System.out.println("주유 가능한 용량");
		System.out.println(liter);
	}
}
